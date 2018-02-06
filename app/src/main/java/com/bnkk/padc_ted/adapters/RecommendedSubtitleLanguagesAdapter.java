package com.bnkk.padc_ted.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bnkk.padc_ted.R;
import com.bnkk.padc_ted.delegates.SearchDelegates;
import com.bnkk.padc_ted.utils.AppConstants;
import com.bnkk.padc_ted.viewholders.RecommendedSubtitleLanguagesViewHolder;

/**
 * Created by E5-575G on 1/29/2018.
 */

public class RecommendedSubtitleLanguagesAdapter extends RecyclerView.Adapter<RecommendedSubtitleLanguagesViewHolder> {

    private LayoutInflater mLayoutInflater;
    private SearchDelegates mDelegates;

    public RecommendedSubtitleLanguagesAdapter(Context context, SearchDelegates searchDelegates) {
        mLayoutInflater = LayoutInflater.from(context);
        mDelegates = searchDelegates;
    }

    @Override
    public RecommendedSubtitleLanguagesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.view_item_recommended_subtitle_language, parent, false);
        return new RecommendedSubtitleLanguagesViewHolder(view,mDelegates);
    }

    @Override
    public void onBindViewHolder(RecommendedSubtitleLanguagesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return AppConstants.RECOMMENDED_ITEM_NUMBER;
    }
}
