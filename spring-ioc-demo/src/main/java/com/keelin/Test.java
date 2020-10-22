package com.keelin;

import com.keelin.service.impl.UserServiceImpl;
import com.keelin.spring.ext.SelfPathXmlApplicationContext;

/**
 * @description: test
 * @author: skn
 * @create: 2020-10-22 10:31
 */
public class Test {
    public static void main(String[] args) throws Exception {

        SelfPathXmlApplicationContext app = new SelfPathXmlApplicationContext("com.keelin.service.impl");
        UserServiceImpl userServiceImpl = (UserServiceImpl) app.getBean("userServiceImpl");
        String result = userServiceImpl.add();
        System.out.println("获取到了orderService的执行结果是 : " + result);
        System.out.println("当前的bean的实例对象是: " + userServiceImpl);
    }
}