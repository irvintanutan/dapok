package com.jeff.dapok.fragments.drawer;

import android.os.Bundle;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;
import com.jeff.dapok.R;
import com.jeff.dapok.adapter.LanguageIndicatorAdapter;
import com.jeff.dapok.adapter.PagerIndicatorAdapter;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ContributionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContributionFragment extends Fragment {
    LanguageIndicatorAdapter mAdapter;
    ViewPager mPager;
    ImageView back;
    WormDotsIndicator indicator;
    int currentPage = 0;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ContributionFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ContributionFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ContributionFragment newInstance(String param1, String param2) {
        ContributionFragment fragment = new ContributionFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_contribution, container, false);
        ButterKnife.bind(this, rootView);
        indicator = rootView.findViewById(R.id.dot);


        mPager = rootView.findViewById(R.id.pager);
        mAdapter = new LanguageIndicatorAdapter(getActivity().getSupportFragmentManager());
        mPager.setAdapter(mAdapter);
        mPager.setOffscreenPageLimit(3);
        indicator.setViewPager(mPager);
        setActions();
        return rootView;
    }


    private void setActions() {
        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                currentPage = position;
                Log.e("CURRENTPAGE" , Integer.toString(currentPage));
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
            }
        });

    }

}