package com.jm.thub.xcx.service.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import cn.binarywang.wx.miniapp.util.WxMaConfigHolder;
import com.jm.thub.core.service.impl.AbstractServiceImpl;
import com.jm.thub.core.util.result.Result;
import com.jm.thub.xcx.entity.WxUserInfo;
import com.jm.thub.xcx.mapper.ThUserMapper;
import com.jm.thub.xcx.service.IThUserService;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* <p>
*  服务实现类
* </p>
*
* @author caozhenhao
* @since 2023-05-28
*/
@Slf4j
@Service
public class ThUserServiceImpl extends AbstractServiceImpl<WxUserInfo> implements IThUserService{

    @Resource
    private ThUserMapper userMapper;
    @Resource
    private  WxMaService wxMaService;

    /**
     * 登录
     * @param code code
     * @return   WxMaJscode2SessionResult
     */
    @Override
    public Result login(String code) {
        try {
            WxMaJscode2SessionResult session = wxMaService.getUserService().getSessionInfo(code);
            log.info(session.getSessionKey());
            log.info(session.getOpenid());
            WxUserInfo info = new WxUserInfo();
            info.setAppid(session.getOpenid());
            info.setSessionKey(session.getSessionKey());
            userMapper.insert(info);
            //TODO 可以增加自己的逻辑，关联业务相关数据
            return Result.success(session);
        } catch (WxErrorException e) {
            log.error(e.getMessage(), e);
            return Result.failed(e.toString());
        } finally {
            WxMaConfigHolder.remove();//清理ThreadLocal
        }
    }

    @Override
    public Result getUserInfo(WxUserInfo userInfo) {

        // 用户信息校验
        if (!wxMaService.getUserService().checkUserInfo(userInfo.getSessionKey(), userInfo.getRawData(), userInfo.getSignature())) {
            WxMaConfigHolder.remove();//清理ThreadLocal
            return Result.failed("user check failed");
        }

        // 解密用户信息
        WxMaUserInfo wxMaUserInfo = wxMaService.getUserService().getUserInfo(userInfo.getSessionKey(), userInfo.getEncryptedData(), userInfo.getIv());
        WxMaConfigHolder.remove();//清理ThreadLocal
        return Result.success(wxMaUserInfo);
    }
}
