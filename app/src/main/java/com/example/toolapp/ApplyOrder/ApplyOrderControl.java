package com.example.toolapp.ApplyOrder;

import com.example.toolapp.BIZ.ApplyOrderHeaderBiz;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class ApplyOrderControl {
    public static List<?> getApplyOrders(String response){
        JsonObject jsonObject=new JsonParser().parse(response).getAsJsonObject();
        JsonArray jsonArray= jsonObject.get("data").getAsJsonArray();
        System.out.println(jsonArray.toString());
        List<ApplyOrderHeaderBiz> applyOrderHeaderBizs=new Gson().fromJson(jsonArray.toString(),new TypeToken<List<ApplyOrderHeaderBiz>>(){}.getType());
        return  applyOrderHeaderBizs;
    }
}
