package com.example.toolapp.ApplyOrder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.toolapp.BIZ.ApplyOrderHeaderBiz;
import com.example.toolapp.NET.OkHttpHelper;
import com.example.toolapp.R;
import com.example.toolapp.publicSource.SystemConfig;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class ApplyOrderReturn extends AppCompatActivity {

    private Button searchButton;
    private EditText searchText;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_order_return);
        searchButton=this.findViewById(R.id.search_but);
        searchText=this.findViewById(R.id.search_text);
        listView=this.findViewById(R.id.list_view);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OkHttpHelper.doPostAsyn(SystemConfig.baseUrl, "/api/applyOrder/list", "{\"code\":\"PTO%\"}", SystemConfig.appkey, new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        System.out.println("错误信息"+e.getMessage());
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        final String responseText=response.body().string();
                        System.out.println(responseText);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                List<ApplyOrderHeaderBiz> applyOrderList= (List<ApplyOrderHeaderBiz>) ApplyOrderControl.getApplyOrders(responseText);
                                ApplyOrderAdapter adapter=new ApplyOrderAdapter(ApplyOrderReturn.this,R.layout.apply_order_item,applyOrderList);
                                listView.setAdapter(adapter);
                            }
                        });

                    }
                });
            }
        });
    }
}
