package com.xlinyu.helloworld;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    // 赚钱开始
    private Button btnGetMoney;
    private TextView tvGetMoney;
    private int money = 0;
    private Button btnLoseMoney;
    private EditText etGoaldMoney;
    // 赚钱结束

    // 单选框
    private RadioGroup radioGroup;
    private RadioButton rbSoHappy,rbNoHappy,rbNiu;

    // 复选框
    private CheckBox cbLOL, cbGrilFriend, cbCodingMoney;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGetMoney = (Button) findViewById(R.id.btnGetMoney);
        tvGetMoney = (TextView) findViewById(R.id.tvGetMoney);

        btnLoseMoney = (Button) findViewById(R.id.btnLoseMoney);
        etGoaldMoney = (EditText) findViewById(R.id.etGoaldMoney);

        btnGetMoney.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String strInputMoney = etGoaldMoney.getText().toString().trim();
                if("".equals(strInputMoney) || strInputMoney.length() == 0){
                    int iMoney = Integer.parseInt(strInputMoney);

                    if (iMoney == money) {
                        Toast.makeText(MainActivity.this, "你经过努力已经完成目标", Toast.LENGTH_SHORT).show();
                    } else {
                        money++;
                        tvGetMoney.setText("哈哈，我通过鼠标点击，轻易赚取了" + money + "元");
                    }
                }else{
                    Toast.makeText(MainActivity.this, "请输入您的第一桶金", Toast.LENGTH_SHORT).show();
                }

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

        radioGroup = (RadioGroup) findViewById(R.id.rgCCTVSuvery);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rbSoHappy:
                        Toast.makeText(MainActivity.this, "very good", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbNoHappy:
                        Toast.makeText(MainActivity.this, "realy ?? day day up", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbNiu:
                        Toast.makeText(MainActivity.this, "你是CCTV的忠实粉丝吗？", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });

        cbLOL = (CheckBox) findViewById(R.id.cbLOL);
        cbGrilFriend = (CheckBox) findViewById(R.id.cbGrilFriend);
        cbCodingMoney = (CheckBox) findViewById(R.id.cbCodingMoney);

        cbLOL.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "骚男, 没事duo看看舒服，别整天LOL了", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cbGrilFriend.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "秀恩爱，你懂的", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cbCodingMoney.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "码农，活着就是为了改变世界", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
