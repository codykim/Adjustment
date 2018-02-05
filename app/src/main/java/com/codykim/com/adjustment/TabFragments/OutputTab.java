package com.codykim.com.adjustment.TabFragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codykim.com.adjustment.R;

/**
 * Created by Kim on 2018. 1. 27..
 */

public class OutputTab extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab_fragment_output, container, false);
    }
}
