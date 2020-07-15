package com.example.ausu.myapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.ausu.myapplication.R;
import com.example.ausu.myapplication.model.save_item;
import com.wuxiaolong.pullloadmorerecyclerview.PullLoadMoreRecyclerView;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SaveFragment extends Fragment {
    private ImageView xialajiantou;
    private View xialawenben;

    /*下拉拉框*/
    private Spinner spinner;
    private ArrayAdapter adapter;

    private PullLoadMoreRecyclerView preView;
    private CommonAdapter<save_item> commonAdapter;
    private List<save_item> modelList = new ArrayList<>();

    public SaveFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_save, container, false);
        xialajiantou = view.findViewById(R.id.xialajiantou);
        xialawenben = view.findViewById(R.id.xialawenben);

        xialajiantou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int visibility = xialawenben.getVisibility();
                switch (visibility) {
                    case View.GONE:
                        xialawenben.setVisibility(View.VISIBLE);
                        xialajiantou.setImageResource(R.mipmap.xiangshangjiantou);
                        //可以翻转
                        break;
                    case View.VISIBLE:
                        xialawenben.setVisibility(View.GONE);
                        xialajiantou.setImageResource(R.mipmap.xiangxiajiantou);
                        break;
                }
            }
        });

        spinner = (Spinner) view.findViewById(R.id.Spinner01);
        //将可选内容与ArrayAdapter连接起来
        adapter = ArrayAdapter.createFromResource(getActivity(), R.array.plantes, android.R.layout.simple_spinner_item);


        //设置下拉列表的风格
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_activated_1);

        //将adapter 添加到spinner中
        spinner.setAdapter(adapter);

        //添加事件Spinner事件监听
        spinner.setOnItemSelectedListener(new SpinnerXMLSelectedListener());

        //设置默认值
        spinner.setVisibility(View.VISIBLE);


        initmodelList();//初始化数据
        preView = view.findViewById(R.id.preView);
        preView.setLinearLayout();
        preView.setPullRefreshEnable(false);
        preView.setPushRefreshEnable(false);
        // Inflate the layout for this fragment
        commonAdapter = new CommonAdapter<save_item>(getActivity(),R.layout.save_item,modelList) {
            @Override
            protected void convert(ViewHolder holder, save_item save_item, int position) {
                ImageView imageView = holder.getView(R.id.user_img);
                imageView.setImageResource(save_item.getUserIcon());
                TextView textView_name = holder.getView(R.id.user_name);
                textView_name.setText(save_item.getUsername());
                TextView textView_context = holder.getView(R.id.neirong);
                textView_context.setText(save_item.getContent());
                ImageView con_img = holder.getView(R.id.contentImage);
                con_img.setImageResource(save_item.getContentImage());
            }
        };
        preView.setAdapter(commonAdapter);
        return view;
    }

    class SpinnerXMLSelectedListener implements AdapterView.OnItemSelectedListener {
        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                   long arg3) {
            adapter.getItem(arg2);
        }

        public void onNothingSelected(AdapterView<?> arg0) {
        }
    }

    public void initmodelList(){
        modelList.add(new save_item(R.mipmap.touxiang1,"mahua714","我们该如何选择最佳时间与自己的“心上猫”实现面对面呢？请跟随咱们的镜头，一起去挖掘小技巧。欢乐暑假，畅游行！[太开心]成都大熊猫繁育研究基地作为假期打卡圣地，近期日均人流量超3万。在如此多游客参观的情况下，大熊猫的状态如何呢？我们该如何选择最佳时间与自己的“心上猫”实现面对面呢？请跟随咱们的镜头，一起去挖掘小技巧。\n欢乐暑假，畅游行！[太开心]成都大熊猫繁育研究基地作为假期打卡圣地，近期日均人流量超3万。在如此多游客参观的情况下，大熊猫的状态如何呢？我们该如何选择最佳时间与自己的“心上猫”实现面对面呢？请跟随咱们的镜头，一起去挖掘小技巧。欢乐暑假，畅游行！[太开心]成都大熊猫繁育研究基地作为假期打卡圣地，近期日均人流量超3万。在如此多游客参观的情况下，大熊猫的状态如何呢？我们该如何选择最佳时间与自己的“心上猫”实现面对面呢？请跟随咱们的镜头，一起去挖掘小技巧。",R.mipmap.img));
        modelList.add(new save_item(R.mipmap.touxiang2,"mahua714","有人说：“养猫三年，但它忘记你只用三天”，真的是这样的吗？日本有人做了一个实验",R.mipmap.img));
        modelList.add(new save_item(R.mipmap.touxiang3,"mahua714","网友带大脸猫检查身体打疫苗，全程乖巧脸。#宠物卖萌中心。网友带大脸猫检查身体打疫苗，全程乖巧脸。",R.mipmap.img));
        modelList.add(new save_item(R.mipmap.touxiang4,"mahua714","一只年迈的汪星人迎来了15岁生日，一家人给它庆生，蛋糕、蜡烛、生日歌…让它明白自己在家人心中有多重要~好暖心",R.mipmap.img));
        modelList.add(new save_item(R.mipmap.touxiang5,"mahua714","每年复活节很多人跟风买兔子当宠物，但复活节过后没多久就把兔兔抛弃[失望]……一位兔兔铲屎官用亲身经历表示，兔兔虽然阔爱但也让人头大！没想清楚就不要养！",R.mipmap.img));
        modelList.add(new save_item(R.mipmap.touxiang,"mahua714","宠物像主人可能真的有点道理…编剧姐妹超级瘦，而她的兔子也不怎么爱吃东西，瘦瘦小小一只。我的一天24小时嘴不停，是一个椭圆形[困]",R.mipmap.img));

    }
}







