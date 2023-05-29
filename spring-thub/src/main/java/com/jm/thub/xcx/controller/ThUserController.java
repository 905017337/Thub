package com.jm.thub.xcx.controller;

import com.jm.thub.core.controller.AbstractController;
import com.jm.thub.core.util.result.Result;
import com.jm.thub.xcx.entity.WxUserInfo;
import com.jm.thub.xcx.service.IThUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author caozhenhao
 * @since 2023-05-28
 * @version v1.0
 */
@RestController
@RequestMapping("//api/v1/th-user")
public class ThUserController extends AbstractController<WxUserInfo, IThUserService> {

    @Resource
    private IThUserService iThUserService;


    /**
     * 登陆接口
     */
    @ApiOperation(value = "微信登录", httpMethod = "GET", notes = "微信小程序登录方法")
    @GetMapping("/login")
    public Result login(@RequestParam("code") String code) {
        return iThUserService.login(code);
    }

    /**
     * <pre>
     * 获取用户信息接口
     * </pre>
     */
    @ApiOperation(value = "获取个人基本信息", httpMethod = "GET", notes = "微信小程序获取个人基本信息")
    @PostMapping("/getUserInfo")
    public Result getUserInfo(@RequestBody WxUserInfo userInfo) {
        return iThUserService.getUserInfo(userInfo);
    }

}
