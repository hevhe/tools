package com.example.toolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.alibaba.fastjson.JSONObject;
import com.example.toolapp.BIZ.LoginBiz;
import com.example.toolapp.Enmu.AccountType;
import com.example.toolapp.NET.OkHttpHelper;
import com.example.toolapp.publicSource.SystemConfig;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private Button loginBut;
    private EditText warehouseText;
    private EditText userNameText;
    private EditText pwdText;
    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        loginBut=findViewById(R.id.loginBut);
        warehouseText=findViewById(R.id.warehouseText);
        userNameText=findViewById(R.id.userNameText);
        pwdText=findViewById(R.id.pwdText);
        SystemConfig.baseUrl="http://183.6.117.112:7889/api/";
        loginBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginMethod();
            }
        });

        loginBut.setFocusableInTouchMode(true);
    }

    public void loginMethod(){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(SystemConfig.appkey);
        builder.setMessage("正在登陆中!!!");
        builder.setTitle("提示");
        builder.setPositiveButton("确定", null);
        builder.setNeutralButton("取消", null);
        builder.setCancelable(false);
        dialog=builder.show();
        OkHttpHelper okHttpHelper=new OkHttpHelper();
        Gson gson=new Gson();
        LoginBiz biz=new LoginBiz(warehouseText.getText().toString(),"MID", AccountType.WAREHOUSE,userNameText.getText().toString(),pwdText.getText().toString(),"WAREHOUSE");
        okHttpHelper.doPostAsyn(SystemConfig.baseUrl, "/api/security/login", gson.toJson(biz), null, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                System.out.println("失败信息："+e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                SystemConfig.appkey=response.body().string().replace("\"","");
                dialog.dismiss();
                System.out.println(SystemConfig.appkey);
            }
        });
    }


}
