package com.bnkk.padc_ted.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bnkk.padc_ted.R;
import com.bnkk.padc_ted.viewholders.PodCastsViewHolder;

/**
 * Created by E5-575G on 1/25/2018.
 */

public class PodCastsAdapter extends RecyclerView.Adapter<PodCastsViewHolder> {

    private LayoutInflater mLayoutInflater;

    public PodCastsAdapter(Context context) {
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public PodCastsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.view_item_podcasts, parent, false);
        return new PodCastsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PodCastsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
