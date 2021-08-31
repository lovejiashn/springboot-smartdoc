package com.jiashn.smartdoc.controller;

import com.jiashn.smartdoc.entity.User;
import com.jiashn.smartdoc.service.UserManageService;
import com.jiashn.smartdoc.utils.ResultJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户管理接口
 * @author: jiangjs
 * @description: 用户登录
 * @date: 2021/8/30 11:24
 */
@RestController
@RequestMapping("/user")
public class UserManageController {

    @Autowired
    private UserManageService userManageService;

    @PostMapping("/login")
    /**
     * 用户登录
     * @param user 用户实体
     * @return user 返回登录后用户信息
     */
    public ResultJson<User> login(@RequestBody User user){
       return userManageService.login(user);
    }

    /**
     * 管理用户信息-添加/修改
     * @param user 用户信息
     * @return 操作结果
     */
    @PostMapping("/manage/user")
    public ResultJson<User> manageUser(@RequestBody User user){
        return userManageService.login(user);
    }
}
