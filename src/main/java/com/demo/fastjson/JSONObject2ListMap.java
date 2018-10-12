package com.demo.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JSONObject2ListMap {

    /**
     *
     */
    public void jSONArrayObjectStr2ListMap(){
        String jsonStr = "[" +
                "{'fac_name':1,'fac_address':1}" +
                ",{'fac_name':2,'fac_address':2}" +
                ",{'fac_name':'','fac_address':3}" +
                ",{'fac_name':4,'fac_address':4}" +
                ",{'fac_name':5,'fac_address':5}]";

        ArrayList<HashMap<String,Object>> lm = new ArrayList<HashMap<String, Object>>();
        HashMap<String,Object> m = new HashMap<String,Object>();

        JSONArray jsonArray = JSON.parseArray(jsonStr);
        jsonArray.forEach(x ->{
            JSONObject xo = (JSONObject) x;
            Set<Map.Entry<String, Object>> entries = xo.entrySet();
            //Set<Map.Entry<String, Object>>
            entries.forEach(y -> {
                //Map.Entry<String, Object>
                m.put(y.getKey(),y.getValue());
            });
            System.out.printf("一个map m : %s\n",m);

            //需要新建一个map 地址 用于存放数据
            HashMap<String,Object> m2 = new HashMap<String,Object>();
            m2.putAll(m);
            lm.add(m2);
            m.clear();
        });
        System.out.printf("结果为 lm : %s\n",lm);
    }


    public static void main(String[] args){
        JSONObject2ListMap jsonObject2ListMap = new JSONObject2ListMap();
        jsonObject2ListMap.jSONArrayObjectStr2ListMap();
    }

}
