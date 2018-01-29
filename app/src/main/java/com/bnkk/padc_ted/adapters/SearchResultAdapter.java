package com.bnkk.padc_ted.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bnkk.padc_ted.R;
import com.bnkk.padc_ted.viewholders.SearchResultViewHolder;

/**
 * Created by E5-575G on 1/25/2018.
 */

public class SearchResultAdapter extends RecyclerView.Adapter<SearchResultViewHolder> {

    private LayoutInflater mLayoutInflater;

    public SearchResultAdapter(Context context) {
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public SearchResultViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.view_item_search_result, parent, false);
        return new SearchResultViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SearchResultViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 50;
    }
}
