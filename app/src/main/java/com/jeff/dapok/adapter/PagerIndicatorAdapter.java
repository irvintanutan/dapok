package com.jeff.dapok.adapter;

import android.os.Bundle;
import android.util.Log;

import com.jeff.dapok.fragments.AdditionalInformationFragment;
import com.jeff.dapok.fragments.CreatePasswordFragment;
import com.jeff.dapok.fragments.CreateUsernameFragment;
import com.jeff.dapok.fragments.PersonalInformationFragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class PagerIndicatorAdapter extends FragmentStatePagerAdapter {
    private static int NUM_ITEMS = 4;

    public PagerIndicatorAdapter(FragmentManager activity) {
        super(activity);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        Log.e("pos", ":" + position);
        Bundle bundle;
        switch (position) {
            case 0:
                fragment = new PersonalInformationFragment();
                break;
            case 1:
                fragment = new CreateUsernameFragment();
                break;
            case 2:
                fragment = new CreatePasswordFragment();
                break;
            case 3:
                fragment = new AdditionalInformationFragment();
                break;

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
