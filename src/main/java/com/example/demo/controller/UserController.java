package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 幻
 * @date 2021-04-01 14:22
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id) {
        System.out.println("master");
        System.out.println("hot-fix");
        System.out.println(123456);
        System.out.println(123);
        User byId = userService.getById(id);
        return JSONObject.toJSONString(byId);
    }   
}
