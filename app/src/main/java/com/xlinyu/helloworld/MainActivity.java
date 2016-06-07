package com.xlinyu.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button btnGetMoney;
    private TextView tvGetMoney;

    private int money = 0;

    private Button btnLoseMoney;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGetMoney = (Button) findViewById(R.id.btnGetMoney);
        tvGetMoney = (TextView) findViewById(R.id.tvGetMoney);

        btnLoseMoney = (Button) findViewById(R.id.btnLoseMoney);


        btnGetMoney.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                money++;
                tvGetMoney.setText("哈哈，我通过鼠标点击，轻易赚取了" + money + "元");
            }
        });

        btnLoseMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (money == 0) {
                    //提示用户余额不足
                    Toast.makeText(MainActivity.this, "现在已经是穷光蛋了，不要再点击了", Toast.LENGTH_SHORT).show();
                } else {
                    money--;
                    tvGetMoney.setText("哈哈，我通过鼠标点击，轻易赚取了" + money + "元");

                }
            }
        });


    }
}
