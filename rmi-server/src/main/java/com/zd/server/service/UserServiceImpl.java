package com.zd.server.service;

import com.zd.api.pojo.User;
import com.zd.api.service.UserServiceI;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;

/**
 * @Description
 * @Author 笛
 * @create 2021/8/14 11:01
 */
@Service
public class UserServiceImpl implements UserServiceI {
    @Override
    public User selectUserById(Integer userId) throws RemoteException {
        User user = new User();
        user.setId(userId);
        user.setUsername("张三");
        System.out.println("提供服务，接收到客户端的用户id为："+userId);
        return user;
    }
}