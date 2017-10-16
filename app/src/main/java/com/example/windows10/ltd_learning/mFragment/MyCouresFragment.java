package com.example.windows10.ltd_learning.mFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.windows10.ltd_learning.R;
import com.example.windows10.ltd_learning.mRecycler.MyAdapter;

/**
 * Created by Windows10 on 10/11/2017.
 */

public class MyCouresFragment extends Fragment {
    String[] mycourse = {"MyVideo1","MyVideo2","MyVideo3","MyVideo4","MyVideo5","MyVideo6","MyVideo7","MyVideo8","MyVideo9","MyVideo10"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.mycoures_fragment,container,false);
        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.mycourse_RV);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        MyAdapter adapter = new MyAdapter(this.getActivity(),mycourse);
        rv.setAdapter(adapter);

        return rootView;
    }
}