package com.bnkk.padc_ted.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.bnkk.padc_ted.R;
import com.bnkk.padc_ted.adapters.SearchResultAdapter;
import com.bnkk.padc_ted.components.SmartRecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by E5-575G on 1/25/2018.
 */

public class SearchResultActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolBar;

    @BindView(R.id.rv_search_result)
    SmartRecyclerView rvSearchResult;

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, SearchResultActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        ButterKnife.bind(this, this);

        setSupportActionBar(toolBar);
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null) {
            actionbar.setHomeAsUpIndicator(R.drawable.ic_arrow_back_24dp);
            actionbar.setDisplayHomeAsUpEnabled(true);
        }

        rvSearchResult.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        SearchResultAdapter searchResultAdapter = new SearchResultAdapter(getApplicationContext());
        rvSearchResult.setAdapter(searchResultAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case android.R.id.home:
                onBackPressed();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
