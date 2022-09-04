package com.jeff.dapok.fragments.carousel;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jeff.dapok.R;
import com.jeff.dapok.activities.ContributeActivity;
import com.jeff.dapok.activities.LoginSignUpActivity;
import com.jeff.dapok.activities.PersonalInformationActivity;
import com.jeff.dapok.adapter.LanguageIndicatorAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CebuanoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CebuanoFragment extends Fragment {

    @BindView(R.id.contribute)
    Button contribute;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CebuanoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CebuanoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CebuanoFragment newInstance(String param1, String param2) {
        CebuanoFragment fragment = new CebuanoFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_cebuano, container, false);
        ButterKnife.bind(this, rootView);

        contribute.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity() , ContributeActivity.class);
            intent.putExtra("language" , "Cebuano");
            startActivity(intent);
            getActivity().finish();
            getActivity().overridePendingTransition(R.anim.enter_from_right, R.anim.exit_to_left);
        });

        return rootView;
    }
}