package com.example.toolapp;

import android.content.Intent;
import android.os.Bundle;

import com.example.toolapp.ApplyOrder.ApplyOrderReturn;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {


    private Button productionOrderBut;
    private Button applyOrderBut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        productionOrderBut=this.findViewById(R.id.production_order_button);
        applyOrderBut=this.findViewById(R.id.apply_order_button);
        applyOrderBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity.this, ApplyOrderReturn.class);
                startActivity(intent);
            }
        });
    }

}

