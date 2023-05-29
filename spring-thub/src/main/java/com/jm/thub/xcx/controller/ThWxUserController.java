package com.jm.thub.xcx.controller;

import com.jm.thub.core.util.result.Result;
import com.jm.thub.xcx.entity.Userinfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.jm.thub.xcx.service.IThWxUserService;
import com.jm.thub.xcx.entity.ThWxUser;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import com.jm.thub.core.controller.AbstractController;

/**
 * <p>
 * 微信小程序-用户表 前端控制器
 * </p>
 *
 * @author caozhenhao
 * @since 2023-05-29
 * @version v1.0
 */
@RestController
@RequestMapping("//api/v1/th-wx-user")
public class ThWxUserController extends AbstractController<ThWxUser, IThWxUserService> {

    @Resource
    private IThWxUserService iThWxUserService;

    /**
     * 登陆接口
     */
    @ApiOperation(value = "微信登录", httpMethod = "GET", notes = "微信小程序登录方法")
    @GetMapping("/login")
    public Result login(@RequestParam("code") String code) {
        return iThWxUserService.login(code);
    }

    /**
     * <pre>
     * 获取用户信息接口
     * </pre>
     */
    @ApiOperation(value = "获取个人基本信息", httpMethod = "GET", notes = "微信小程序获取个人基本信息")
    @PostMapping("/getUserInfo")
    public Result getUserInfo(@RequestBody Userinfo userInfo) {
        return iThWxUserService.getUserInfo(userInfo);
    }
}
