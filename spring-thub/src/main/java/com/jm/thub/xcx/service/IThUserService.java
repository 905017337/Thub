package com.jm.thub.xcx.service;

import com.jm.thub.core.service.AbstractService;
import com.jm.thub.core.util.result.Result;
import com.jm.thub.xcx.entity.WxUserInfo;

/**
* <p>
*  服务类
* </p>
*
* @author caozhenhao
* @since 2023-05-28
*/
public interface IThUserService extends AbstractService<WxUserInfo>{

    /**
     * 登录
     * @param code code
     * @return   WxMaJscode2SessionResult
     */
    Result login(String code);

    /**
     * 获取用户信息
     * @param userInfo  包含一些加密的信息
     * @return  WxMaUserInfo
     */
    Result getUserInfo(WxUserInfo userInfo);

}
