
package com.bobtest.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>minus complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="minus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "minus", propOrder = {
    "arg0",
    "arg1"
})
public class Minus {

    protected int arg0;
    protected int arg1;

    /**
     * ��ȡarg0���Ե�ֵ��
     * 
     */
    public int getArg0() {
        return arg0;
    }

    /**
     * ����arg0���Ե�ֵ��
     * 
     */
    public void setArg0(int value) {
        this.arg0 = value;
    }

    /**
     * ��ȡarg1���Ե�ֵ��
     * 
     */
    public int getArg1() {
        return arg1;
    }

    /**
     * ����arg1���Ե�ֵ��
     * 
     */
    public void setArg1(int value) {
        this.arg1 = value;
    }

}
