package com.booboomx.materialdesigndemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.booboomx.materialdesigndemo.R;

/**
 * Created by booboomx on 17/1/9.
 */

public class ToolbarAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private Context context;

    public ToolbarAdapter(Context context){
        this.context=context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType==0){
            return new ItemView(LayoutInflater.from(context).inflate(R.layout.shenghuo_head2,null));
        }else{
            return new ItemView(LayoutInflater.from(context).inflate(R.layout.layout_item,parent,false));
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    @Override
    public int getItemViewType(int position) {
        if(position==0){
            return 0;
        }else{
            return 1;
        }
    }

    class ItemView extends RecyclerView.ViewHolder{
        public ItemView(View itemView) {
            super(itemView);
        }
    }

}
