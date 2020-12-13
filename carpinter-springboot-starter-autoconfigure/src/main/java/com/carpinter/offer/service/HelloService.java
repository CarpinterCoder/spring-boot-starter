package com.carpinter.offer.service;

import com.carpinter.offer.config.HelloProperties;

/**
 * @author XiaoNing
 * @date 2020/5/26
 */
public class HelloService {

    private HelloProperties properties;

    public HelloProperties getProperties() {
        return properties;
    }

    public void setProperties(HelloProperties properties) {
        this.properties = properties;
    }

    public String sayHello(String name) {
        return properties.getPrefix() + "-" + name + properties.getSuffix();
    }
}
