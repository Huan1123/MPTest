package com.example.demo;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
    }

    @Test
    public void Test01(){
        System.out.println("select method test------------------");
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
        User user = userMapper.selectById(1);
        System.out.println(user);
        User user1 = new User();
        user1.setAge(66);
        user1.setName("czx");
        user1.setEmail("2333@qq.com");
        int insert = userMapper.insert(user1);
        System.out.println(user1.getId());
    }

    @Test
    void Test02(){
        System.out.println("service method test");
        User user = new User();
        user.setAge(66);
        user.setName("czx");
        user.setEmail("2333@qq.com");
        boolean save = userService.save(user);
        System.out.println(save);
        System.out.println(user.getId());
    }
}
