package com.bnkk.padc_ted.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by E5-575G on 1/22/2018.
 */

public class BaseFragmentStatePagerAdapter extends FragmentStatePagerAdapter {

    private int mNumberOfTabs;

    public BaseFragmentStatePagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        mNumberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return mNumberOfTabs;
    }
}
