package com.codykim.com.adjustment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.codykim.com.adjustment.TabFragments.InputTab;
import com.codykim.com.adjustment.TabFragments.OutputTab;

/**
 * Created by Kim on 2018. 1. 27..
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    int numOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                InputTab inputTab = new InputTab();
                return inputTab;
            case 1:
                OutputTab outputTab = new OutputTab();
                return outputTab;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
