package com.android.tripin.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.tripin.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FindFragment extends Fragment {


    public static FindFragment newInstance(){
        FindFragment findFragment = new FindFragment();
        return findFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.fragment_find, container, false);
        return view;
    }

}
