package com.bnkk.padc_ted.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bnkk.padc_ted.R;
import com.bnkk.padc_ted.viewholders.TalksViewHolder;

/**
 * Created by E5-575G on 1/24/2018.
 */

public class TalksAdapter extends RecyclerView.Adapter<TalksViewHolder> {

    private LayoutInflater mLayoutInflater;

    public TalksAdapter(Context context) {
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public TalksViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.view_item_talks, parent, false);
        return new TalksViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TalksViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
