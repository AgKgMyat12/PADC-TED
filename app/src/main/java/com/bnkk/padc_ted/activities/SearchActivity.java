package com.bnkk.padc_ted.activities;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.bnkk.padc_ted.R;
import com.bnkk.padc_ted.adapters.RecommendedEventsAdapter;
import com.bnkk.padc_ted.adapters.RecommendedSpeakersAdapter;
import com.bnkk.padc_ted.adapters.RecommendedSubtitleLanguagesAdapter;
import com.bnkk.padc_ted.adapters.RecommendedTopicsAdapter;
import com.bnkk.padc_ted.components.SmartRecyclerView;
import com.bnkk.padc_ted.data.models.TEDModel;
import com.bnkk.padc_ted.delegates.SearchDelegates;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by E5-575G on 1/25/2018.
 */

public class SearchActivity extends BaseActivity implements SearchDelegates {

    @BindView(R.id.toolbar)
    Toolbar toolBar;

    @BindView(R.id.rv_recommended_topics)
    SmartRecyclerView rvRecommendedTopics;

    @BindView(R.id.rv_recommended_speakers)
    SmartRecyclerView rvRecommendedSpeakers;

    @BindView(R.id.rv_recommended_subtitle_languages)
    SmartRecyclerView rvRecommendedSubtitleLanguages;

    @BindView(R.id.rv_recommended_events)
    SmartRecyclerView rvRecommendedEvents;

    private TEDModel tedModel;

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, SearchActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this, this);

        tedModel = ViewModelProviders.of(this).get(TEDModel.class);
        tedModel.loadSearchTED();

        setSupportActionBar(toolBar);
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null) {
            actionbar.setHomeAsUpIndicator(R.drawable.ic_arrow_back_24dp);
            actionbar.setDisplayHomeAsUpEnabled(true);
        }

        rvRecommendedTopics.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        RecommendedTopicsAdapter recommendedTopicsAdapter = new RecommendedTopicsAdapter(getApplicationContext(),this);
        rvRecommendedTopics.setAdapter(recommendedTopicsAdapter);

        rvRecommendedSpeakers.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        RecommendedSpeakersAdapter recommendedSpeakersAdapter = new RecommendedSpeakersAdapter(getApplicationContext(),this);
        rvRecommendedSpeakers.setAdapter(recommendedSpeakersAdapter);

        rvRecommendedSubtitleLanguages.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        RecommendedSubtitleLanguagesAdapter recommendedSubtitleLanguagesAdapter = new RecommendedSubtitleLanguagesAdapter(getApplicationContext(),this);
        rvRecommendedSubtitleLanguages.setAdapter(recommendedSubtitleLanguagesAdapter);

        rvRecommendedEvents.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        RecommendedEventsAdapter recommendedEventsAdapter = new RecommendedEventsAdapter(getApplicationContext(),this);
        rvRecommendedEvents.setAdapter(recommendedEventsAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case android.R.id.home:
                onBackPressed();
                break;
            case R.id.action_speaker:
                Toast.makeText(getApplicationContext(), "Search with speakers Coming Soon!!!", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTapRecommendedItem() {
        Intent intent = SearchResultActivity.newIntent(getApplicationContext());
        startActivity(intent);
    }
}
