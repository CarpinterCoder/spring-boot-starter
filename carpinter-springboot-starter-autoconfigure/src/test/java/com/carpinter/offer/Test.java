package com.carpinter.offer;

import com.carpinter.offer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author XiaoNing
 * @date 2020/5/26
 */
@SpringBootTest
public class Test {

    @Autowired
    private HelloService service;

    @org.junit.Test
    public void test(){
        service.sayHello("world");
    }

}
