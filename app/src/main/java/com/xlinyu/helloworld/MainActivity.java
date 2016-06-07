package com.xlinyu.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button btnGetMoney;
    private TextView tvGetMoney;

    private int money = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGetMoney = (Button) findViewById(R.id.btnGetMoney);
        tvGetMoney = (TextView) findViewById(R.id.tvGetMoney);

        btnGetMoney.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                money++;
                tvGetMoney.setText("哈哈，我通过鼠标点击，轻易赚取了" + money + "元");
            }
        });

    }
}
