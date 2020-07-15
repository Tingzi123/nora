package com.example.ausu.myapplication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


import com.example.ausu.myapplication.fragment.AboutmeFragment;
import com.example.ausu.myapplication.fragment.HealthFragment;
import com.example.ausu.myapplication.fragment.SaveFragment;
import com.example.ausu.myapplication.fragment.ShopFragment;
import com.example.ausu.myapplication.fragment.mainFragment;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private AboutmeFragment amf;
    private HealthFragment hf;
    private SaveFragment sf;
    private ShopFragment spf;
    private  mainFragment mf;

    private RadioGroup rg;
    private FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = findViewById(R.id.rbtn);
        rg.setOnCheckedChangeListener(this);

        amf = new AboutmeFragment();
        hf = new HealthFragment();
        sf = new SaveFragment();
        spf = new ShopFragment();
        mf = new mainFragment();


        fm = getSupportFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();

        ft.add(R.id.fr,mf);
        ft.add(R.id.fr,hf);
        ft.add(R.id.fr,sf);
        ft.add(R.id.fr,spf);
        ft.add(R.id.fr,amf);
        ft.commit();

        ((RadioButton) rg.getChildAt(0)).setChecked(true);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        hideAllFragment();
        FragmentTransaction ft =fm.beginTransaction();
        switch (checkedId) {
            case R.id.main:
                ft.show(mf);
                Toast.makeText(this, "首页哦", Toast.LENGTH_LONG).show();
                break;
            case R.id.health:
                ft.show(hf);
                Toast.makeText(this, "健康哦", Toast.LENGTH_LONG).show();
                break;
            case R.id.save:
                ft.show(sf);
                Toast.makeText(this, "救援哦", Toast.LENGTH_LONG).show();
                break;
            case R.id.shop:
                ft.show(spf);
                Toast.makeText(this, "商城哦", Toast.LENGTH_LONG).show();
                break;
            case R.id.aboutMe:
                ft.show(amf);
                Toast.makeText(this, "关于哦", Toast.LENGTH_LONG).show();
                break;
        }
        ft.commit();
    }

    public void hideAllFragment(){
        FragmentTransaction ft = fm.beginTransaction();
        ft.hide(mf);
        ft.hide(amf);
        ft.hide(hf);
        ft.hide(sf);
        ft.hide(spf);
        ft.commit();

    }
}