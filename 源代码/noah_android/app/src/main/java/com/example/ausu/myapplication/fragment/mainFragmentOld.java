package com.example.ausu.myapplication.fragment;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.ausu.myapplication.R;
import com.example.ausu.myapplication.fragment.careabout.CareFragment;
import com.example.ausu.myapplication.fragment.main_change.IntroduceFragment;
import com.example.ausu.myapplication.model.reclycleVIewInfo;
import com.wuxiaolong.pullloadmorerecyclerview.PullLoadMoreRecyclerView;
import com.zhy.adapter.recyclerview.CommonAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class mainFragmentOld extends Fragment implements View.OnClickListener{
    private Button button1;
    private Button button2;
    private CareFragment cf;
    private FragmentManager fm ;
    private IntroduceFragment inf;
    private LinearLayout layout;

    private PullLoadMoreRecyclerView preView;
    private CommonAdapter<reclycleVIewInfo> commonAdapter;
    private List<reclycleVIewInfo> modelList = new ArrayList<>();
    public mainFragmentOld() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initmodelList();//初始化数据

        cf = new CareFragment();
       inf = new IntroduceFragment();

        fm = getChildFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.add(R.id.frg,inf);
        ft.add(R.id.frg,cf);
        ft.commit();


        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_main, container, false);
        button1= (Button) view.findViewById(R.id.button1);//获取
        button2= (Button) view.findViewById(R.id.button2);//获取
      /*  preView = view.findViewById(R.id.preView);
        preView.setLinearLayout();*/
        layout= (LinearLayout) view.findViewById(R.id.layout);//
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);




        /*commonAdapter = new CommonAdapter<reclycleVIewInfo>(getActivity(),R.layout.item,modelList) {
            @Override
            protected void convert(ViewHolder holder, reclycleVIewInfo reclycleVIewInfo, int position) {
                ImageView imageView = holder.getView(R.id.head);
                imageView.setImageResource(reclycleVIewInfo.getIcon());
                TextView textView_name = holder.getView(R.id.username);
                textView_name.setText(reclycleVIewInfo.getUsername());
                TextView textView_context = holder.getView(R.id.huati);
                textView_context.setText(reclycleVIewInfo.getContext());
            }
        };
        preView.setAdapter((commonAdapter));*/
        return view;
    }

    @Override
    public void onClick(View view) {
        hideAllFragment();
        FragmentTransaction ft = fm.beginTransaction();
        switch (view.getId()) {
            case R.id.button1:
                ft.show(inf);
                layout.setBackgroundColor(Color.parseColor("#81D8D0"));
                // button1.setBackgroundColor(Color.parseColor("#81D8D0"));
                // button2.setBackgroundColor(Color.parseColor("#81D8D0"));
                button1.setTextColor(Color.parseColor("#FFFFFF"));
                button2.setTextColor(Color.parseColor("#FFFFFF"));
                // button1.setBackground(getResources().getDrawable(R.drawable.shouyetop_btn1_checked));

                break;
            case R.id.button2:
                ft.show(cf);
                layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                //  button1.setBackgroundColor(Color.parseColor("#FFFFFF"));
                // button2.setBackgroundColor(Color.parseColor("#FFFFFF"));
                button1.setTextColor(Color.parseColor("#000000"));
                button2.setTextColor(Color.parseColor("#000000"));

                break;
        }
        ft.commit();
    }

    public void initmodelList(){

        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/b4_a","内容",R.mipmap.b4_a));
        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/b4_a","内容",R.mipmap.b4_a));
        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/b4_a","内容",R.mipmap.b4_a));
        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/b4_a","内容",R.mipmap.b4_a));
        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/b4_a","内容",R.mipmap.b4_a));
        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/b4_a","内容",R.mipmap.b4_a));
        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/b4_a","内容",R.mipmap.b4_a));


    }

    public void hideAllFragment(){
        FragmentTransaction ft = fm.beginTransaction();
        ft.hide(cf);
        ft.hide(inf);
        ft.commit();
    }
}
