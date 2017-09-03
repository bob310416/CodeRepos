package com.bobtest.service;

public class TestClient2 {

    public static void main(String[] args){
        MyServiceImplService msis = new MyServiceImplService();
        IMyService ms = msis.getMyServiceImplPort();
        //System.out.println(ms.minus(50,20));
        System.out.println(ms.minus(50,45));
    }

}
