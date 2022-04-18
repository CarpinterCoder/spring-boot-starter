package com.carpinter.offer.config;

import com.carpinter.offer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author XiaoNing
 * @date 2020/5/26
 */
@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceConfig {

    @Autowired
    private HelloProperties properties;

    @Bean
    public HelloService helloService(){
        HelloService service = new HelloService();
        service.setProperties(properties);
        return service;
    }
}
