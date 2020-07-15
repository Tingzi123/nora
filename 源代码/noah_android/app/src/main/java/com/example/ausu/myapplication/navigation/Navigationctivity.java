package com.example.ausu.myapplication.navigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.ausu.myapplication.R;

public class Navigationctivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private RadioGroup rbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigationctivity);

        rbtn = findViewById(R.id.rbtn);
        rbtn.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        /*switch (checkedId){
            case (1):
                Toast.makeText(this,"首页哦",Toast.LENGTH_LONG).show();
                break;
            case (2):
                Toast.makeText(this,"健康哦",Toast.LENGTH_LONG).show();
                break;
            case (3):
                Toast.makeText(this,"救援哦",Toast.LENGTH_LONG).show();
                break;
            case (4):
                Toast.makeText(this,"商城哦",Toast.LENGTH_LONG).show();
                break;
            case (5):
                Toast.makeText(this,"关于哦",Toast.LENGTH_LONG).show();
                break;
        }*/
    }
}
