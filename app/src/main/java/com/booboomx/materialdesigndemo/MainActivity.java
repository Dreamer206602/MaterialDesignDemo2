package com.booboomx.materialdesigndemo;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.booboomx.materialdesigndemo.adapter.SimpleAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toolbar mTooBar;
    private RecyclerView mRecyclerView;
    private ImageView imageView;
    private CollapsingToolbarLayout mToolBarLayout;


    int mutedColor = R.attr.colorPrimary;


    private ArrayList<String>mDatas=new ArrayList<>();

    private SimpleAdapter mAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }

    private void initData() {
        mTooBar.setTitle("MaterialDesign");
        setSupportActionBar(mTooBar);

        mToolBarLayout.setTitle("Material Design");

//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.mushroom);
//        Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
//            @Override
//            public void onGenerated(Palette palette) {
//                mutedColor = palette.getMutedColor(getResources().getColor(R.color.colorPrimary));
//                mToolBarLayout.setContentScrimColor(mutedColor);
//                mToolBarLayout.setStatusBarScrimColor(R.color.black_trans80);
//
//            }
//        });


        for (int i = 0; i < 20; i++) {
            mDatas.add("I Love Android-->"+i);
        }


        mAdapter=new SimpleAdapter(this,mDatas);
        mRecyclerView.setAdapter(mAdapter);

    }

    private void initView() {
        mTooBar= (Toolbar) findViewById(R.id.toolBar);
        mRecyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        mToolBarLayout= (CollapsingToolbarLayout) findViewById(R.id.collToolLayout);

        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
