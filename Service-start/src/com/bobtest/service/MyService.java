package com.bobtest.service;

import javax.xml.ws.Endpoint;

public class MyService {
    public static void main(String[] args){
        String address = "http://localhost:10003/ns";
        Endpoint.publish(address,new MyServiceImpl());
    }
}
