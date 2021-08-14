package com.zd.server.config;

import com.zd.api.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * @Description
 * @Author 笛
 * @create 2021/8/14 11:08
 */
@Configuration
public class RMIServer {
    @Autowired
    private UserServiceI userService;
    @Bean
    public RmiServiceExporter getRmiServiceExporter(){
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceName("userService");
        rmiServiceExporter.setService(userService);
        rmiServiceExporter.setServiceInterface(UserServiceI.class);
        rmiServiceExporter.setRegistryPort(2002);
        return rmiServiceExporter;
    }
}
