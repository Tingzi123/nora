package com.example.ausu.myapplication.fragment.main_change;


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
import com.example.ausu.myapplication.fragment.ShopFragment;
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
public class IntroduceFragment extends Fragment {
    private PullLoadMoreRecyclerView preView;
    private CommonAdapter<reclycleVIewInfo> commonAdapter;
    private List<reclycleVIewInfo> modelList = new ArrayList<>();

    //轮播图
    List<String> list=new ArrayList<String>();
    private Banner banner;

    public IntroduceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        list.add("https://raw.githubusercontent.com/Tingzi123/blog/master/_posts/picture/firstpage1.png");
        list.add("https://raw.githubusercontent.com/Tingzi123/blog/master/_posts/picture/firstpage2.png");
        list.add("https://raw.githubusercontent.com/Tingzi123/blog/master/_posts/picture/firstpage3.png");
        list.add("https://raw.githubusercontent.com/Tingzi123/blog/master/_posts/picture/firstpage4.png");
        list.add("https://raw.githubusercontent.com/Tingzi123/blog/master/_posts/picture/firstpage5.png");
        View view=inflater.inflate(R.layout.fragment_shop, container, false);
        banner = (Banner) view.findViewById(R.id.banner);
        banner.setImages(list).setImageLoader(new IntroduceFragment.GlideImageLoader()).start();


        //View view =inflater.inflate(R.layout.fragment_introduce, container, false);
        initmodelList();//初始化数据
        preView = view.findViewById(R.id.preView);
        preView.setLinearLayout();
        preView.setPullRefreshEnable(false);
        preView.setPushRefreshEnable(false);
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
            }
        };
        preView.setAdapter((commonAdapter));
        return view;
    }

       public void initmodelList(){

      /*  modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/b4_a","内容",R.mipmap.b4_a));
        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/b4_a","内容",R.mipmap.b4_a));
        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/b4_a","内容",R.mipmap.b4_a));
        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/b4_a","内容",R.mipmap.b4_a));
        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/b4_a","内容",R.mipmap.b4_a));
        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/b4_a","内容",R.mipmap.b4_a));
        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/b4_a","内容",R.mipmap.b4_a));*/
           modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/touxiang1","有个笑话，说是一个养猫的人买了一本《猫的摇篮》，气得要死，说冯内古特是个骗子，书里既没有猫，也没有摇篮.",R.mipmap.touxiang1));
           modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/touxiang2","猫是种很专情的动物，无论你是贫穷还是富裕，是肮脏还是洁癖，它都看不起你",R.mipmap.touxiang2));
           modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/touxiang3","深夜吐槽" +
                   "留学生养宠物好正常一件事" +
                   "但是不可否认依旧能遇到很多奇葩的人",R.mipmap.touxiang3));
           modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/touxiang4","有的人前两天还跟我说" +
                   "“不晓得那些把宠物送走的人怎么想的 不能养到最后就不要养啊 一点责任心都没有" +
                   "然后今天发朋友圈就把狗送走换养猫了" +
                   "也不知道养了也有半年了又是怎么狠下心的" +
                   "可能她说话都是放屁吧" +
                   "真的看不起",R.mipmap.touxiang4));
           modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/touxiang5","这里真的好多喵，民宿有镇宿之喵，店铺有镇店之喵，并且这些喵都看不起给它拍照的任何人[喵喵]古风气氛也很浓厚，襦裙很漂酿[爱你]还有就是葱包烩差评，一点都不好吃[二哈]猫的天空之城真的超文艺精致！我怀疑杭州住在森林里，到处都是树和水！杭州第一天，打卡！",R.mipmap.touxiang5));
           modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/yisheng","一直觉得品种猫狗的世界太残酷了，价值都在品相，比起生命，在一些人的概念里它们更像商品吧……真正爱猫的人不会因为喜好看不起任何一种猫的",R.mipmap.yisheng));
           modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/yisheng","一直觉得品种猫狗的世界太残酷了，价值都在品相，比起生命，在一些人的概念里它们更像商品吧……真正爱猫的人不会因为喜好看不起任何一种猫的",R.mipmap.yisheng));


       }

    public class GlideImageLoader extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {

            //Glide 加载图片简单用法
            Glide.with(context).load(path).into(imageView);
        }

    }


}
