package com.example.alex_deem.studentlist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by alex-deem on 2016/12/2 0002.
 */

public class MyAdapeter extends RecyclerView.Adapter<MyAdapeter.MyViewHolder>{
    private Context context;
    private List<String> list;

    public MyAdapeter(Context context,List<String> list){
        this.context = context;
        this.list = list;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.text.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView text;
        public MyViewHolder(View itemView) {
            super(itemView);
            text=((TextView) itemView.findViewById(R.id.item_text));
        }
    }
}
