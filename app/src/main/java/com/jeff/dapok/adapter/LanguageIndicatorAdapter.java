package com.jeff.dapok.adapter;

import android.os.Bundle;
import android.util.Log;

import com.jeff.dapok.fragments.AdditionalInformationFragment;
import com.jeff.dapok.fragments.CreatePasswordFragment;
import com.jeff.dapok.fragments.CreateUsernameFragment;
import com.jeff.dapok.fragments.PersonalInformationFragment;
import com.jeff.dapok.fragments.carousel.CebuanoFragment;
import com.jeff.dapok.fragments.carousel.MandayaFragment;
import com.jeff.dapok.fragments.carousel.TagalogFragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class LanguageIndicatorAdapter extends FragmentStatePagerAdapter {
    private static int NUM_ITEMS = 3;

    public LanguageIndicatorAdapter(FragmentManager activity) {
        super(activity);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        Log.e("pos", ":" + position);
        Bundle bundle;
        switch (position) {
            case 0:
                fragment = new TagalogFragment();
                break;
            case 1:
                fragment = new CebuanoFragment();
                break;
            case 2:
                fragment = new MandayaFragment();
                break;

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
