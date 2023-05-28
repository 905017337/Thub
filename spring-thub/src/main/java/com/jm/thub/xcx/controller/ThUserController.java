package com.jm.thub.xcx.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.jm.thub.xcx.service.IThUserService;
import com.jm.thub.xcx.entity.ThUser;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import com.jm.thub.core.controller.AbstractController;

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
public class ThUserController extends AbstractController<ThUser, IThUserService> {

    @Resource
    private IThUserService iThUserService;


}
