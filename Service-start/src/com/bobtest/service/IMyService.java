package com.bobtest.service;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface IMyService {
    int add(int a, int b);

    int minus(int a, int b);

    User login(String username, String password);
}
