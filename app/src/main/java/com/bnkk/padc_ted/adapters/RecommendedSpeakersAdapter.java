package com.bnkk.padc_ted.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bnkk.padc_ted.R;
import com.bnkk.padc_ted.utils.AppConstants;
import com.bnkk.padc_ted.viewholders.RecommendedSpeakersViewHolder;

/**
 * Created by E5-575G on 1/29/2018.
 */

public class RecommendedSpeakersAdapter extends RecyclerView.Adapter<RecommendedSpeakersViewHolder> {

    private LayoutInflater mLayoutInflater;

    public RecommendedSpeakersAdapter(Context context) {
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RecommendedSpeakersViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.view_item_recommended_speaker, parent, false);
        return new RecommendedSpeakersViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecommendedSpeakersViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return AppConstants.RECOMMENDED_ITEM_NUMBER;
    }
}
