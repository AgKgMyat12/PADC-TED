package com.bnkk.padc_ted.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.bnkk.padc_ted.R;
import com.bnkk.padc_ted.adapters.TEDTabsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolBar;

    @BindView(R.id.fab)
    FloatingActionButton fab;

    @BindView(R.id.tl_ted)
    TabLayout tlTED;

    @BindView(R.id.vp_ted)
    ViewPager vpTED;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this, this);

        setSupportActionBar(toolBar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("TED Talks");
        }

        tlTED.addTab(tlTED.newTab().setIcon(R.drawable.ic_format_list_bulleted_24dp));
        tlTED.addTab(tlTED.newTab().setIcon(R.drawable.ic_subscriptions_24dp));
        tlTED.addTab(tlTED.newTab().setIcon(R.drawable.ic_headset_24dp));
        tlTED.addTab(tlTED.newTab().setIcon(R.drawable.ic_lightbulb_outline_24dp));
        tlTED.addTab(tlTED.newTab().setIcon(R.drawable.ic_account_circle_24dp));

        TEDTabsAdapter tedTabsAdapter = new TEDTabsAdapter(getSupportFragmentManager(), tlTED.getTabCount());
        vpTED.setOffscreenPageLimit(2);
        vpTED.setAdapter(tedTabsAdapter);

        vpTED.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tlTED));
        tlTED.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vpTED.setCurrentItem(tab.getPosition());
                setToolBarTitle(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = SearchActivity.newIntent(getApplicationContext());
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case R.id.action_settings:
                return true;
            case R.id.action_privacy_policy:
                return true;
            case R.id.action_feedback:
                return true;
            case R.id.action_log_in:
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setToolBarTitle(int position) {

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            switch (position) {
                case 0:
                    actionBar.setTitle("TED Talks");
                    break;
                case 1:
                    actionBar.setTitle("TED Playlists");
                    break;
                case 2:
                    actionBar.setTitle("TED Podcasts");
                    break;
                case 3:
                    actionBar.setTitle("TED Surprise me");
                    break;
                case 4:
                    actionBar.setTitle("TED My talks");
                    break;
            }
        }
    }
}
