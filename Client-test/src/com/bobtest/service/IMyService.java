
package com.bobtest.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IMyService", targetNamespace = "http://service.bobtest.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IMyService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://service.bobtest.com/", className = "com.bobtest.service.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://service.bobtest.com/", className = "com.bobtest.service.AddResponse")
    @Action(input = "http://service.bobtest.com/IMyService/addRequest", output = "http://service.bobtest.com/IMyService/addResponse")
    public int add(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "minus", targetNamespace = "http://service.bobtest.com/", className = "com.bobtest.service.Minus")
    @ResponseWrapper(localName = "minusResponse", targetNamespace = "http://service.bobtest.com/", className = "com.bobtest.service.MinusResponse")
    @Action(input = "http://service.bobtest.com/IMyService/minusRequest", output = "http://service.bobtest.com/IMyService/minusResponse")
    public int minus(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.bobtest.service.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://service.bobtest.com/", className = "com.bobtest.service.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://service.bobtest.com/", className = "com.bobtest.service.LoginResponse")
    @Action(input = "http://service.bobtest.com/IMyService/loginRequest", output = "http://service.bobtest.com/IMyService/loginResponse")
    public User login(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}
