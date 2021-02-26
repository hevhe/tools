package com.example.toolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.toolapp.BIZ.ErrorResponse;
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
    private ProgressDialog progressDialog;


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
        SystemConfig.baseUrl="http://rfid.gxgglobal.cn/hdwapi/";
        loginBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("点击了登录按钮！");
                loginMethod();
            }
        });
        loginBut.setFocusableInTouchMode(true);
    }

    public void loginMethod(){
        //setMessageDialog("提示","正在登录!!!");
        OkHttpHelper okHttpHelper=new OkHttpHelper();
        Gson gson=new Gson();
        LoginBiz biz=new LoginBiz(warehouseText.getText().toString(),"MID", AccountType.WAREHOUSE,userNameText.getText().toString(),pwdText.getText().toString(),"WAREHOUSE");
        okHttpHelper.doPostAsyn(SystemConfig.baseUrl, "/api/security/login", gson.toJson(biz), null, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                setMessageDialog("提示",e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String responseText=response.body().string();
                if(response.code()==200){
                    SystemConfig.appkey=responseText.replace("\"","");
                    dialog.dismiss();
                    System.out.println(SystemConfig.appkey);
                    Intent intent=new Intent(MainActivity.this,MenuActivity.class);
                    startActivity(intent);
                }else{
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            ErrorResponse errorResponse=new Gson().fromJson(responseText,ErrorResponse.class);
                            setMessageDialog("提示",errorResponse.message);
                        }
                    });
                    System.out.println(responseText);
                }

        }
        });
    }

    private void showProgressDialog(String mes){
        if(progressDialog==null){
            progressDialog=new ProgressDialog(this);
            progressDialog.setMessage(mes);
            progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progressDialog.setCanceledOnTouchOutside(false);
        }
        progressDialog.show();
    }

    private void closeProgressDialog(){
        if(progressDialog!=null){
            progressDialog.dismiss();
        }
    }

    private void setMessageDialog(String title,String mes){
        dialog=null;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(mes);
        builder.setTitle("提示");
        builder.setPositiveButton("确定", null);
        builder.setNeutralButton("取消", null);
        builder.setCancelable(false);
        dialog=builder.show();
    }

    private void closeMesDialog(){
        if(dialog!=null){
            dialog.dismiss();
        }
    }


}


