package com.booboomx.materialdesigndemo.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.booboomx.materialdesigndemo.MainActivity;
import com.booboomx.materialdesigndemo.R;

public class Main2Activity extends Activity implements View.OnClickListener {

    private Button btnOne,btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnOne= (Button) findViewById(R.id.btn_one);
        btnTwo= (Button) findViewById(R.id.btn_two);



        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_one:
                startActivity(new Intent(this, MainActivity.class));
                break;

            case R.id.btn_two:
                break;
        }

    }
}
