package com.example.ausu.myapplication.fragment.careabout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.ausu.myapplication.R;
import com.example.ausu.myapplication.model.reclycleVIewInfo;
import com.wuxiaolong.pullloadmorerecyclerview.PullLoadMoreRecyclerView;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CareFragment extends Fragment {
    private PullLoadMoreRecyclerView preView;
    private CommonAdapter<reclycleVIewInfo> commonAdapter;
    private List<reclycleVIewInfo> modelList = new ArrayList<>();

    public CareFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_care, container, false);
        initmodelList();//初始化数据
        preView = view.findViewById(R.id.preView);
        preView.setLinearLayout();
        // Inflate the layout for this fragment
        commonAdapter = new CommonAdapter<reclycleVIewInfo>(getActivity(),R.layout.item,modelList) {
            @Override
            protected void convert(ViewHolder holder, reclycleVIewInfo reclycleVIewInfo, int position) {
                ImageView imageView = holder.getView(R.id.head);
                imageView.setImageResource(reclycleVIewInfo.getIcon());
                TextView textView_name = holder.getView(R.id.username);
                textView_name.setText(reclycleVIewInfo.getUsername());
                TextView textView_context = holder.getView(R.id.huati);
                textView_context.setText(reclycleVIewInfo.getContext());

                ImageView ivMy = holder.getView(R.id.ivMy);
                if(reclycleVIewInfo.getSubject_image()!=null && !reclycleVIewInfo.getSubject_image().isEmpty()){
                    ivMy.setVisibility(View.VISIBLE);
                    Glide.with(getActivity()).load(reclycleVIewInfo.getSubject_image().toString()).into(ivMy);
                }



            }
        };
        preView.setAdapter((commonAdapter));
        // Inflate the layout for this fragment
        return view;
    }
    public void initmodelList(){


        modelList.add(new reclycleVIewInfo("报告梁非凡","@mipmap/touxiang1","在微博上看别的猫被端午抓个现行，它挺大度的，目前在啃我电脑……",R.mipmap.touxiang1,"http://122.112.245.136:5555/Public/Home/images/my.jpg",null));
        modelList.add(new reclycleVIewInfo("刘醒我炒你啊","@mipmap/touxiang2","欢乐暑假，畅游行！[太开心]成都大熊猫繁育研究基地作为假期打卡圣地，近期日均人流量超3万。在如此多游客参观的情况下，大熊猫的状态如何呢？我们该如何选择最佳时间与自己的“心上猫”实现面对面呢？请跟随咱们的镜头，一起去挖掘小技巧。",R.mipmap.touxiang2,null,"http://txym000000.tongxinyumiao.com/pinyin/xbs/yy/xb-yy-1.mp4"));
        modelList.add(new reclycleVIewInfo("呀**非凡","@mipmap/touxiang3","在如此多游客参观的情况下，大熊猫的状态如何呢？我们该如何选择最佳时间与自己的“心上猫”实现面对面呢？请跟随咱们的镜头，一起去挖掘小技巧",R.mipmap.touxiang3));
        modelList.add(new reclycleVIewInfo("？？？？","@mipmap/touxiang4","" +
                "我头上有犄角，我身后有尾巴" +
                "谁也不知道，我其实是一个......",R.mipmap.touxiang4));
        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/touxiang5","国外一个动物救助组织，回访了一批被救助的狗狗。并将它们现在的样子与被救助之前做了对比，希望所有狗狗都能被温柔相待，爱让一切变得更好！",R.mipmap.touxiang5));
        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/yisheng","看起来特别纯良的狗狗cola，想把所有好吃的都给它[心]",R.mipmap.yisheng));
        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/yisheng","看哭！在小狗狗要被领养人带回家的时候，狗狗妈妈来送别小狗狗。狗妈妈舔舔小狗狗后转头走的那一刻我真的爆哭啊！！！[泪][泪][泪]",R.mipmap.yisheng));


    }


}
