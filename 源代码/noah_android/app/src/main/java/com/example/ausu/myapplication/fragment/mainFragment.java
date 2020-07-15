package com.example.ausu.myapplication.fragment;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.ausu.myapplication.R;
import com.example.ausu.myapplication.fragment.careabout.CareFragment;
import com.example.ausu.myapplication.fragment.main_change.IntroduceFragment;
import com.example.ausu.myapplication.model.reclycleVIewInfo;
import com.library.tabstrip.PagerSlidingTabStrip;
import com.wuxiaolong.pullloadmorerecyclerview.PullLoadMoreRecyclerView;
import com.zhy.adapter.recyclerview.CommonAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class mainFragment extends Fragment implements View.OnClickListener{
    private Button button1;
    private Button button2;
    private CareFragment cf;
    private FragmentManager fm ;
    private IntroduceFragment inf;
    private LinearLayout layout;
    private LinearLayout ll;
    private PullLoadMoreRecyclerView preView;
    private CommonAdapter<reclycleVIewInfo> commonAdapter;
    private List<reclycleVIewInfo> modelList = new ArrayList<>();

    private PagerSlidingTabStrip tabs;
    private ViewPager viewPager;
    private List<Fragment> list = new ArrayList<Fragment>();
    private CareFragment careFragment;
    private IntroduceFragment introduceFragment;
    private MyPageAdapter myPageAdapter;

    private String[] titles ={"关注","推荐"};
    public mainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        cf = new CareFragment();
       inf = new IntroduceFragment();


        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_main, container, false);
        tabs = view.findViewById(R.id.tabs);
        viewPager = view.findViewById(R.id.pager);
        ll = view.findViewById(R.id.ll);




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
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setTabs(titles);
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
                layout.setBackgroundColor(Color.parseColor("#81D8D0"));
                // button1.setBackgroundColor(Color.parseColor("#81D8D0"));
                // button2.setBackgroundColor(Color.parseColor("#81D8D0"));
                button1.setTextColor(Color.parseColor("#FFFFFF"));
                button2.setTextColor(Color.parseColor("#FFFFFF"));
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

        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/touxiang1","有个笑话，说是一个养猫的人买了一本《猫的摇篮》，气得要死，说冯内古特是个骗子，书里既没有猫，也没有摇篮.",R.mipmap.touxiang1));
        modelList.add(new reclycleVIewInfo("梁非凡","@mipmap/touxiang2","猫是种很专情的动物，无论你是贫穷还是富裕，是肮脏还是洁癖，它都看不起你",R.mipmap.touxiang2,"http://",""));
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

    public void hideAllFragment(){
        FragmentTransaction ft = fm.beginTransaction();
        ft.hide(cf);
        ft.hide(inf);
        ft.commit();
    }

    private void setTabs(String[] titles) {
        careFragment = new CareFragment();
        introduceFragment = new IntroduceFragment();
        list.add(careFragment);
        list.add(introduceFragment);
        myPageAdapter = new MyPageAdapter(getChildFragmentManager(), titles, list);
        viewPager.setAdapter(myPageAdapter);
        //viewPager.setOffscreenPageLimit(3);
        setTabsValue();
    }

    private void setTabsValue() {
        DisplayMetrics dm = getResources().getDisplayMetrics();
        // 设置Tab底部选中的指示器Indicator的高度
        tabs.setIndicatorHeight((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 2.0f, dm));
        // 设置Tab底部选中的指示器 Indicator的颜色
        tabs.setIndicatorColor(Color.BLUE);
        //设置Tab标题文字的颜色
        tabs.setTextColor(Color.BLACK);
        // 设置Tab标题文字的大小
        tabs.setTextSize((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 18, dm));
        //设置Tab底部分割线的高度
//        tabs.setUnderlineHeight(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 1f, dm));
        //设置Tab底部分割线的颜色
        tabs.setUnderlineColor(Color.TRANSPARENT);
        // 设置点击某个Tab时的背景色,设置为0时取消背景色
        tabs.setTabBackground(0);
        // 设置Tab是自动填充满屏幕的
        tabs.setShouldExpand(true);
        // 设置选中的Tab文字的颜色
        tabs.setSelectedTextColor(Color.GREEN);
        //tab间的分割线
        tabs.setDividerColor(Color.GRAY);
        //底部横线与字体宽度一致
        tabs.setIndicatorinFollower(true);
        //与ViewPager关联，这样指示器就可以和ViewPager联动
        tabs.setViewPager(viewPager);
        tabs.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                switch (i){
                    case 0:
                        ll.setBackgroundColor(Color.parseColor("#81D8D0"));
                        break;
                    case 1:
                        ll.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    class MyPageAdapter extends FragmentPagerAdapter {
        String[] titles;
        List<Fragment> lists = new ArrayList<>();

        public MyPageAdapter(FragmentManager fm, String[] titles, List<Fragment> list) {
            super(fm);
            this.titles = titles;
            this.lists = list;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }

        @Override
        public Fragment getItem(int position) {
            return lists.get(position);
        }

        @Override
        public int getCount() {
            return list.size();
        }
    }
}
