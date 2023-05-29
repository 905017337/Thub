package com.jm.thub.xcx.service;

import com.jm.thub.core.util.result.Result;
import com.jm.thub.xcx.entity.ThWxUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jm.thub.core.service.AbstractService;
import com.jm.thub.xcx.entity.Userinfo;

/**
* <p>
* 微信小程序-用户表 服务类
* </p>
*
* @author caozhenhao
* @since 2023-05-29
*/
public interface IThWxUserService extends AbstractService<ThWxUser>{


    Result login(String code);

    /**
     * 获取用户信息
     * @param userInfo  包含一些加密的信息
     * @return  WxMaUserInfo
     */
    Result getUserInfo(Userinfo userInfo);
}
