package com.example.ausu.myapplication.fragment;


import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ausu.myapplication.R;
import com.example.ausu.myapplication.model.ChatItemListViewBean;
import com.example.ausu.myapplication.util.SoftKeyboardUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HealthFragment extends Fragment {

    private ListView mListView;
    private List<ChatItemListViewBean> data;
    private Button btn;
    private ChatItemListViewAdapter chatItemListViewAdapter;
    private EditText et_msg;

    public HealthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_health2, container, false);
        initView(v);
        initData();
        return v;

    }
    private void initData() {
        ChatItemListViewBean bean1 = new ChatItemListViewBean();     //创建ChatItemListViewBean对象
        bean1.setType(0);           //设置type类型
        bean1.setIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.yisheng));        //设置图片
        bean1.setText("您好，我是您的宠物医生，请问你需要咨询什么问题？");                    //设置文本
        //以下同

        ChatItemListViewBean bean2 = new ChatItemListViewBean();
        bean2.setType(1);
        bean2.setIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.touxiang3));
        bean2.setText("我的猫不知道怎么了，最近总是食欲不振");

        ChatItemListViewBean bean3 = new ChatItemListViewBean();
        bean3.setType(0);
        bean3.setIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.yisheng));
        bean3.setText("请问一下您的猫咪年龄？");

        ChatItemListViewBean bean4 = new ChatItemListViewBean();
        bean4.setType(1);
        bean4.setIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.touxiang3));
        bean4.setText("10个月");

        ChatItemListViewBean bean5 = new ChatItemListViewBean();
        bean5.setType(0);
        bean5.setIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.yisheng));
        bean5.setText("猫咪品种？");

        ChatItemListViewBean bean6 = new ChatItemListViewBean();
        bean6.setType(1);
        bean6.setIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.touxiang3));
        bean6.setText("中华田园猫");

        ChatItemListViewBean bean7 = new ChatItemListViewBean();
        bean7.setType(0);
        bean7.setIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.yisheng));
        bean7 .setText("是否接种过猫三联和弓形虫疫苗？");

        data = new ArrayList<ChatItemListViewBean>();
        data.add(bean1);
        data.add(bean2);
        data.add(bean3);
        data.add(bean4);
        data.add(bean5);
        data.add(bean6);
        data.add(bean7);
        data.add(bean1);
        data.add(bean2);
        data.add(bean3);
        data.add(bean4);
        data.add(bean5);
        data.add(bean6);
        data.add(bean7);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        chatItemListViewAdapter = new ChatItemListViewAdapter(getActivity(), data);
        mListView.setAdapter(chatItemListViewAdapter);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChatItemListViewBean bean = new ChatItemListViewBean();
                bean.setType(1);
                bean.setIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.touxiang3));
                bean.setText(et_msg.getText().toString());
                data.add(bean);
                chatItemListViewAdapter.notifyDataSetChanged();
                SoftKeyboardUtil.hideSoftKeyboard(getActivity(),null);
            }
        });
    }

    private void initView(View v) {
        mListView = (ListView) v.findViewById(R.id.listView_chat);
        et_msg = v.findViewById(R.id.et_msg);
        btn = v.findViewById(R.id.tv_send);
    }


    class ChatItemListViewAdapter extends BaseAdapter {

        private List<ChatItemListViewBean> mData;       //创建ChatItemListViewBean类型的List表
        private LayoutInflater mInflater;               //定义线性布局过滤器

        public ChatItemListViewAdapter(Context context, List<ChatItemListViewBean> data) {
            this.mData = data;
            mInflater = LayoutInflater.from(context);       //获取布局
        }

        /**
         * 得到列表长度
         *
         * @return
         */
        @Override
        public int getCount() {
            return mData.size();
        }

        @Override
        public long getItemId(int position) {
            return position;    //得到子项位置id
        }

        /**
         * 获取列表对应位置的子项
         *
         * @param position
         * @return
         */
        @Override
        public Object getItem(int position) {
            return mData.get(position);
        }

        /**
         * 获取对应Positon的type值
         *
         * @param position
         * @return
         */
        @Override
        public int getItemViewType(int position) {
            ChatItemListViewBean bean = mData.get(position);
            return bean.getType();
        }

        /**
         * 返回总数
         *
         * @return
         */
        @Override
        public int getViewTypeCount() {
            return 2;
        }

        /**
         * @param position
         * @param convertView
         * @param parent
         * @return
         */
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            //判断是否缓存
            if (convertView == null) {
                if (getItemViewType(position) == 0) {      //如果类型是0
                    holder = new ViewHolder();
                    //通过LayoutInflater实例化布局
                    convertView = mInflater.inflate(R.layout.chat_item_iteint, null);
                    //绑定id
                    holder.img = (ImageView) convertView.findViewById(R.id.icon_in);
                    holder.title = (TextView) convertView.findViewById(R.id.text_in);
                } else {
                    holder = new ViewHolder();
                    convertView = mInflater.inflate(R.layout.char_item_itemout, null);
                    holder.img = (ImageView) convertView.findViewById(R.id.icon_out);
                    holder.title = (TextView) convertView.findViewById(R.id.text_out);
                }
                convertView.setTag(holder);         //为View设置tag
            } else {
                holder = (ViewHolder) convertView.getTag();      //通过tag找到缓存的布局
            }
            //设置布局中控件要显示的视图
            holder.img.setImageBitmap(mData.get(position).getIcon());
            holder.title.setText(mData.get(position).getText());
            return convertView;     //返回一个view
        }

        /**
         * 实体类
         */
        public final class ViewHolder {
            public ImageView img;
            public TextView title;
        }
    }
}


