package com.bnkk.padc_ted.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bnkk.padc_ted.R;

import butterknife.ButterKnife;

/**
 * Created by E5-575G on 1/23/2018.
 */

public class SurpriseMeFragment extends BaseFragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_surprise_me, container, false);
        ButterKnife.bind(this, view);

        return view;
    }
}
