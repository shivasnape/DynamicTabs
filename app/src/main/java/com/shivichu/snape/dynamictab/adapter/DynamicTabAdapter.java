package com.shivichu.snape.dynamictab.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.shivichu.snape.dynamictab.fragment.MyNewFragment;

/**
 * Created by root on 4/8/17.
 */

public class DynamicTabAdapter extends FragmentStatePagerAdapter {


    int mNumOfTabs;
    Fragment fragment = null;
    String sNo;

    public DynamicTabAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
        this.sNo = String.valueOf(NumOfTabs);
    }

    @Override
    public Fragment getItem(int position) {

        for (int i = 0; i < mNumOfTabs; i++) {
            if (i == position) {
                fragment = MyNewFragment.newInstance(sNo);
                break;
            }
        }
        return fragment;

    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}

