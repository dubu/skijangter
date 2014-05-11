package com.dubu.skijangter;

import com.google.gson.*;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.IOException;

/**
 * User: dubu9
 * Date: 14. 5. 11
 * Time: 오전 9:23
 */
public class SkpWeatherApiTest {

    public static void main(String[] args) {

        String url = "http://apis.skplanetx.com/weather/current/hourly?lon=126.9658000000&village=&county=&lat=37.5714000000&city=&version=1";
        GetMethod getMethod = new GetMethod(url);

//        x-skpop-userId: kozazz
//        Accept-Language: ko_KR
//        Date: Sun May 11 09:10:19 KST 2014
//        Accept: application/json
//        access_token:
//        appKey: **************************

//        getMethod.setRequestHeader(new Header("Referer","https://www.parse.com/apps/toeicnoti/push_notifications/new"));
//        getMethod.setRequestHeader(new Header("Accept-Language","ko-KR"));
//        getMethod.setRequestHeader(new Header("User-Agent","Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.1; WOW64; Trident/6.0)"));
//        getMethod.setRequestHeader(new Header("Content-Type","application/x-www-form-urlencoded; charset=UTF-8"));
//        getMethod.setRequestHeader(new Header("Accept-Encoding","gzip, deflate"));
//        getMethod.setRequestHeader(new Header("Host","www.parse.com"));
//        getMethod.setRequestHeader(new Header("DNT","1"));
//        getMethod.setRequestHeader(new Header("Connection","Keep-Alive"));
//        getMethod.setRequestHeader(new Header("Cache-Control","no-cache"));

        try {
            byte[] responseBody = getMethod.getResponseBody();
               // System.out.println(new String(responseBody));

        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        HttpClient httpclient = new HttpClient();
        GetMethod getPage1 = new GetMethod("http://apis.skplanetx.com/weather/forecast/6days?lon=126.9658000000&village=&county=&lat=37.5714000000&city=&version=1");

        getPage1.setRequestHeader(new Header("x-skpop-userId","kozazz"));
        getPage1.setRequestHeader(new Header("Accept-Language","ko_KR"));
        getMethod.setRequestHeader(new Header("Accept-Encoding","gzip, deflate"));
        getPage1.setRequestHeader(new Header("Accept","application/json"));
        getPage1.setRequestHeader(new Header("access_token",""));
        getPage1.setRequestHeader(new Header("appKey","845a7213-46ce-3ec1-9357-0a68340e1100"));

        try {
            httpclient.executeMethod(getPage1);
            String result =  getPage1.getResponseBodyAsString();
            System.out.println(result);

            JsonElement jelement = new JsonParser().parse(result);
            JsonObject jobject = jelement.getAsJsonObject();

            jobject = jobject.getAsJsonObject("weather");
            JsonArray jarray = jobject.getAsJsonArray("forecast6days");
            jobject = jarray.get(0).getAsJsonObject();
            JsonObject obj1 = jobject.get("sky").getAsJsonObject();

            String str = obj1.get("amName2day").toString();

            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }

}
