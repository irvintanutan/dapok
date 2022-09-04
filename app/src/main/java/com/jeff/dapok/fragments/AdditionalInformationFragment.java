package com.jeff.dapok.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.jeff.dapok.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AdditionalInformationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AdditionalInformationFragment extends Fragment {

    @BindView(R.id.highestView)
    Spinner highestView;
    @BindView(R.id.languageView)
    Spinner languageView;
    @BindView(R.id.fluentView)
    Spinner fluentView;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AdditionalInformationFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AdditionalInformationFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AdditionalInformationFragment newInstance(String param1, String param2) {
        AdditionalInformationFragment fragment = new AdditionalInformationFragment();
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

    private void loadSpinnerIdTypes() {
        ArrayAdapter<CharSequence> educationalAdapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.educationalAttainment, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> languageAdapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.languagesYouSpeak, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> fluentAdapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.fluency, android.R.layout.simple_spinner_item);
        educationalAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        languageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fluentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        highestView.setAdapter(educationalAdapter);
        languageView.setAdapter(languageAdapter);
        fluentView.setAdapter(fluentAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_additional_information, container, false);
        ButterKnife.bind(this, rootView);
        loadSpinnerIdTypes();
        return rootView;
    }
}