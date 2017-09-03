package com.bobtest.weather;

public class TestWeather {
    public static void main(String[] agrs){

        //查询上海的天气
        GlobalWeather service = new GlobalWeather();
        GlobalWeatherSoap port = service.getGlobalWeatherSoap();
        String body = port.getWeather("BeiJin","China");
        System.out.println(body);
        System.out.println("-----------------");

        //查询中国所以的城市
        //String citylist = port.getCitiesByCountry("China");
        //System.out.println(citylist);
    }
}
