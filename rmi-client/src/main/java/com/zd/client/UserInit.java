package com.zd.client;

import com.zd.api.service.UserServiceI;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.net.InterfaceAddress;

/**
 * @Description
 * @Author 笛
 * @create 2021/8/14 11:27
 */
@Component
public class UserInit implements CommandLineRunner {

    @Autowired
    private UserServiceI userService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(userService.selectUserById(2));
    }
}
