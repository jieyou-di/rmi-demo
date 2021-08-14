package com.zd.client;

import com.zd.api.service.UserServiceI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

/**
 * @Description
 * @Author 笛
 * @create 2021/8/14 11:29
 */
@Configuration
public class RMIClient {

    @Bean
    public RmiProxyFactoryBean getRmiProxyFactoryBean(){
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceUrl("rmi://127.0.0.1:2002/userService");
        rmiProxyFactoryBean.setServiceInterface(UserServiceI.class);
        return rmiProxyFactoryBean;
    }
}
