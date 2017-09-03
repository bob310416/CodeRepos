package com.bobtest.service;


import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class TestClient
{
    public static void main(String[] args){
        try {
            URL url = new URL("http://localhost:10003/ns?wsdl");
            QName qname = new QName("http://service.bobtest.com/","MyServiceImplService");
            Service service = Service.create(url,qname);

            IMyService ms = service.getPort(IMyService.class);
            System.out.println(ms.add(33,22));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }
}
