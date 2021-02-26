package com.example.toolapp.NET;


import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OkHttpHelper {

    public Response doGet(String url, String method)
    {
        OkHttpClient client=new OkHttpClient();
        Request request = new Request.Builder()
                .url(url+method).build();
        Call call=client.newCall(request);
        try{
            Response response=call.execute();
            return response;
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }

    }
    public static void doGetAsyn(String url,String method, Callback callback)
    {
        OkHttpClient client=new OkHttpClient();
        Request request = new Request.Builder()
                .url(url+method).build();
        client.newCall(request).enqueue(callback);
    }
    public Response doPost(String url,String method,String json,String appkey)
    {
        OkHttpClient client=new OkHttpClient();
        RequestBody requestBody=RequestBody.create(MediaType.parse("application/json"),json);
        Request request=new Request.Builder()
                .url(url+method)
                .post(requestBody)
                .build();
        Call call=client.newCall(request);
        try {
            Response response=call.execute();
            return response;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }


    }
    public static void doPostAsyn(String url, String method, String json, String appkey, Callback callback)
    {
        OkHttpClient client=new OkHttpClient();
        RequestBody requestBody=RequestBody.create(MediaType.parse("application/json"),json);
        Request request=new Request.Builder()
                .url(url+method)
                .addHeader("authorization","APP_KEYS "+appkey)
                .post(requestBody)
                .build();
        Call call=client.newCall(request);
        call.enqueue(callback);
    }
}
