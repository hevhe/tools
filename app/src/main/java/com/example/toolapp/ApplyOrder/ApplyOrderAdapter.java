package com.example.toolapp.ApplyOrder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.toolapp.BIZ.ApplyOrderHeaderBiz;
import com.example.toolapp.R;

import java.util.List;


public class ApplyOrderAdapter extends ArrayAdapter<ApplyOrderHeaderBiz> {
    private int resourceId;

    public ApplyOrderAdapter(@NonNull Context context, int resource, @NonNull List<ApplyOrderHeaderBiz> objects) {
        super(context, resource, objects);
        resourceId=resource;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        ApplyOrderHeaderBiz applyOrderHeaderBiz=getItem(position);
        ViewHolder viewHolder;
        if(convertView==null){
            view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.applyOrderCode=view.findViewById(R.id.order_code_text);
            viewHolder.applyQty=view.findViewById(R.id.apply_qty_text);
            viewHolder.toWarehouseCode=view.findViewById(R.id.to_warehouse_text);
            view.setTag(viewHolder);
        }else
        {
            view=convertView;
            viewHolder= (ViewHolder) view.getTag();
        }
        viewHolder.applyOrderCode.setText(applyOrderHeaderBiz.getCode());
        viewHolder.applyQty.setText(applyOrderHeaderBiz.getReceivedQty().toString());
        viewHolder.toWarehouseCode.setText(applyOrderHeaderBiz.getWarehouseName());
        return view;
    }

    class ViewHolder{
        TextView applyOrderCode;
        TextView toWarehouseCode;
        TextView applyQty;
    }
}
