package com.klins.oc.blog.vueblogs.controller;


import com.klins.oc.blog.vueblogs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author KLins
 * @since 2022-06-18
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("index")
    public Object index(){
        return userService.getById(1L);
    }

}
