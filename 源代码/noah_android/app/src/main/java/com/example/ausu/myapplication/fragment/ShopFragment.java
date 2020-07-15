package com.example.ausu.myapplication.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.ausu.myapplication.R;
import com.example.ausu.myapplication.model.goodsInfo;
import com.example.ausu.myapplication.model.reclycleVIewInfo;
import com.wuxiaolong.pullloadmorerecyclerview.PullLoadMoreRecyclerView;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShopFragment extends Fragment {
    private PullLoadMoreRecyclerView preView;
    private CommonAdapter<goodsInfo> commonAdapter;
    private List<goodsInfo> modelList = new ArrayList<>();
    List<String> list=new ArrayList<String>();
    private Banner banner;


    public ShopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        list.add("https://raw.githubusercontent.com/Tingzi123/blog/master/_posts/picture/shop1.png");
        list.add("https://raw.githubusercontent.com/Tingzi123/blog/master/_posts/picture/shop2.png");
        list.add("https://raw.githubusercontent.com/Tingzi123/blog/master/_posts/picture/shop3.png");
        View view=inflater.inflate(R.layout.fragment_shop, container, false);
        banner = (Banner) view.findViewById(R.id.banner);
        banner.setImages(list).setImageLoader(new GlideImageLoader()).start();


        initmodelList();//初始化数据
        preView = view.findViewById(R.id.preView);
        preView.setGridLayout(2);
        preView.setPullRefreshEnable(false);
        preView.setPushRefreshEnable(false);
        // Inflate the layout for this fragment
        commonAdapter = new CommonAdapter<goodsInfo>(getActivity(),R.layout.goods_item,modelList) {
            @Override
            protected void convert(ViewHolder holder, goodsInfo goodsInfo, int position) {
                ImageView imageView = holder.getView(R.id.goods_img);
                imageView.setImageResource(goodsInfo.getIcon());
              /*  TextView textView_name = holder.getView(R.id.goods_name);
                textView_name.setText(goodsInfo.getGoods_name());
                TextView textView_context = holder.getView(R.id.goods_content);
                textView_context.setText(goodsInfo.getGoods_content());
                TextView textView_price = holder.getView(R.id.price);
                textView_price.setText(goodsInfo.getGoods_price());*/
            }
        };
        preView.setAdapter((commonAdapter));
        return view;

    }

    public class GlideImageLoader extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {

            //Glide 加载图片简单用法
            Glide.with(context).load(path).into(imageView);
        }

    }

    public void initmodelList(){

        modelList.add(new goodsInfo(R.mipmap.goods_one,"名称","描述内容","价格"));
        modelList.add(new goodsInfo(R.mipmap.goods_two,"名称","描述内容","价格"));
        modelList.add(new goodsInfo(R.mipmap.goods_three,"名称","描述内容","价格"));
        modelList.add(new goodsInfo(R.mipmap.goods_four,"名称","描述内容","价格"));
        modelList.add(new goodsInfo(R.mipmap.goods_five,"名称","描述内容","价格"));
        modelList.add(new goodsInfo(R.mipmap.goods_six,"名称","描述内容","价格"));

       /* modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/b4_a","内容",R.mipmap.b4_a));
        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/b4_a","内容",R.mipmap.b4_a));
        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/b4_a","内容",R.mipmap.b4_a));
        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/b4_a","内容",R.mipmap.b4_a));
        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/b4_a","内容",R.mipmap.b4_a));
        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/b4_a","内容",R.mipmap.b4_a));*/


    }



}
