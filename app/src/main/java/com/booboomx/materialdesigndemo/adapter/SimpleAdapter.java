package com.booboomx.materialdesigndemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.booboomx.materialdesigndemo.R;

import java.util.ArrayList;

/**
 * Created by booboomx on 17/1/7.
 */

public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.SimpleViewHolder> {


    private Context mContext;
    private ArrayList<String>mDatas;


    public SimpleAdapter(Context mContext, ArrayList<String> mDatas) {
        this.mContext = mContext;
        this.mDatas = mDatas;
    }

    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.item_simple, parent, false);
        return new SimpleViewHolder(view);

    }

    @Override
    public void onBindViewHolder(SimpleViewHolder holder, int position) {

        holder.mTitle.setText(mDatas.get(position));
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }



    public class  SimpleViewHolder extends RecyclerView.ViewHolder{


        private TextView mTitle;


        public SimpleViewHolder(View itemView) {
            super(itemView);
            mTitle= (TextView) itemView.findViewById(R.id.tv_title);
        }
    }


}
