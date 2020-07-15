package com.example.ausu.myapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.ausu.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutmeFragment extends Fragment {


    private ImageView iv;
    private ImageView ivvbg;
    public AboutmeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_aboutme, container, false);
        // Inflate the layout for this fragment

        iv =view.findViewById(R.id.ivv);
        ivvbg = view.findViewById(R.id.ivvbg);

        RequestOptions mRequestOptions = RequestOptions.circleCropTransform();
        Glide.with(this).load(R.drawable.wode_touxiang_baohuceng).apply(mRequestOptions).into(ivvbg);
        Glide.with(this).load(R.drawable.wode_touxiang).apply(mRequestOptions).into(iv);

        return view;
    }

}
