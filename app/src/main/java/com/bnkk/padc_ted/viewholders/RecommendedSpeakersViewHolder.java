package com.bnkk.padc_ted.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.bnkk.padc_ted.delegates.SearchDelegates;

/**
 * Created by E5-575G on 1/29/2018.
 */

public class RecommendedSpeakersViewHolder extends BaseViewHolder {

    private SearchDelegates searchDelegates;

    public RecommendedSpeakersViewHolder(View itemView, SearchDelegates delegates) {
        super(itemView);
        searchDelegates = delegates;
    }

    @Override
    public void setData(Object data) {

    }

    @Override
    public void onClick(View view) {
        searchDelegates.onTapRecommendedItem();
    }
}
