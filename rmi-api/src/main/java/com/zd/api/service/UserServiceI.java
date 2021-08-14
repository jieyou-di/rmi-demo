package com.zd.api.service;

import com.zd.api.pojo.User;

import java.rmi.RemoteException;

/**
 * @Description
 * @Author 笛
 * @create 2021/8/14 10:53
 */
public interface UserServiceI {
    User selectUserById(Integer userId) throws RemoteException;
}
