package com.bnkk.padc_ted.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.bnkk.padc_ted.fragments.MyTalksFragment;
import com.bnkk.padc_ted.fragments.PlaylistsFragment;
import com.bnkk.padc_ted.fragments.PodcastsFragment;
import com.bnkk.padc_ted.fragments.SurpriseMeFragment;
import com.bnkk.padc_ted.fragments.TalksFragment;

/**
 * Created by E5-575G on 1/23/2018.
 */

public class TEDTabsAdapter extends BaseFragmentStatePagerAdapter {

    public TEDTabsAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm, numberOfTabs);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TalksFragment talksFragment = new TalksFragment();
                return talksFragment;
            case 1:
                PlaylistsFragment playlistsFragment = new PlaylistsFragment();
                return playlistsFragment;
            case 2:
                PodcastsFragment podcastsFragment = new PodcastsFragment();
                return podcastsFragment;
            case 3:
                SurpriseMeFragment surpriseMeFragment = new SurpriseMeFragment();
                return surpriseMeFragment;
            case 4:
                MyTalksFragment myTalksFragment = new MyTalksFragment();
                return myTalksFragment;
            default:
                return super.getItem(position);
        }
    }
}
