package com.demo.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.HashMap;

public class JSONObject2ListMap {

    public void jSONObject2ListMap(){
        String jsonStr = "[" +
                "{'fac_name':1,'fac_address':1}" +
                ",{'fac_name':2,'fac_address':2}" +
                ",{'fac_name':'','fac_address':3}" +
                ",{'fac_name':4,'fac_address':4}" +
                ",{'fac_name':5,'fac_address':5}]";

        JSONArray jsonArray = JSON.parseArray(jsonStr);
        jsonArray.forEach(x ->{

            System.out.printf("x : %s\n",x);

        });

    }


    public static void main(String[] args){
        JSONObject2ListMap jsonObject2ListMap = new JSONObject2ListMap();
        jsonObject2ListMap.jSONObject2ListMap();
    }

}
