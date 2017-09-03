package com.bobtest.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author bob
 * @apiNote 实现接口的类
 */
@WebService(endpointInterface = "com.bobtest.service.IMyService")
public class MyServiceImpl implements IMyService{

    @Override
    @WebResult(name = "AddResponse")
    public int add(@WebParam(name = "A") int a,@WebParam(name = "B") int b) {
        System.out.println(a+"+"+b+"="+(a+b));
        return a+b;
    }

    @Override
    @WebResult(name = "MinusResponse")
    public int minus(@WebParam(name = "A") int a,@WebParam(name = "B") int b) {
        System.out.println(a+"-"+b+"="+(a-b));
        return a-b;
    }

    @Override
    @WebResult(name = "Login")
    public User login(@WebParam(name = "Username") String username,@WebParam(name = "password") String password) {
        System.out.println(username+"来了");
        User user = new User();
        user.setId(1);
        user.setUsername(username);
        user.setPassword(password);
        return user;
    }
}
