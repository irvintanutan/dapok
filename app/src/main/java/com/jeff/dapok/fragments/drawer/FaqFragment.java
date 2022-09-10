package com.jeff.dapok.fragments.drawer;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.jeff.dapok.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FaqFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FaqFragment extends Fragment {
    @BindView(R.id.arrow_button)
    ImageView arrow;
    @BindView(R.id.arrow_button2)
    ImageView arrow2;
    @BindView(R.id.arrow_button3)
    ImageView arrow3;
    @BindView(R.id.arrow_button4)
    ImageView arrow4;
    @BindView(R.id.arrow_button5)
    ImageView arrow5;


    @BindView(R.id.hidden_view)
    LinearLayout hiddenView;
    @BindView(R.id.hidden_view2)
    LinearLayout hiddenView2;
    @BindView(R.id.hidden_view3)
    LinearLayout hiddenView3;
    @BindView(R.id.hidden_view4)
    LinearLayout hiddenView4;
    @BindView(R.id.hidden_view5)
    LinearLayout hiddenView5;

    @BindView(R.id.base_cardview)
    CardView cardView;
    @BindView(R.id.base_cardview2)
    CardView cardView2;
    @BindView(R.id.base_cardview3)
    CardView cardView3;
    @BindView(R.id.base_cardview4)
    CardView cardView4;
    @BindView(R.id.base_cardview5)
    CardView cardView5;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FaqFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FaqFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FaqFragment newInstance(String param1, String param2) {
        FaqFragment fragment = new FaqFragment();
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

        View rootView = inflater.inflate(R.layout.fragment_faq, container, false);
        ButterKnife.bind(this, rootView);

        arrow.setOnClickListener(view -> {
            if (hiddenView.getVisibility() == View.VISIBLE) {
                TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                hiddenView.setVisibility(View.GONE);
                arrow.setImageResource(R.drawable.ic_round_arrow_drop_up_24);
            }
            else {
                TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                hiddenView.setVisibility(View.VISIBLE);
                arrow.setImageResource(R.drawable.ic_round_arrow_drop_down_24);
            }
        });

        arrow2.setOnClickListener(view -> {
            if (hiddenView2.getVisibility() == View.VISIBLE) {
                TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                hiddenView2.setVisibility(View.GONE);
                arrow2.setImageResource(R.drawable.ic_round_arrow_drop_up_24);
            }
            else {
                TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                hiddenView2.setVisibility(View.VISIBLE);
                arrow2.setImageResource(R.drawable.ic_round_arrow_drop_down_24);
            }
        });

        arrow3.setOnClickListener(view -> {
            if (hiddenView3.getVisibility() == View.VISIBLE) {
                TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
                hiddenView3.setVisibility(View.GONE);
                arrow3.setImageResource(R.drawable.ic_round_arrow_drop_up_24);
            }
            else {
                TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
                hiddenView3.setVisibility(View.VISIBLE);
                arrow3.setImageResource(R.drawable.ic_round_arrow_drop_down_24);
            }
        });

        arrow4.setOnClickListener(view -> {
            if (hiddenView4.getVisibility() == View.VISIBLE) {
                TransitionManager.beginDelayedTransition(cardView4, new AutoTransition());
                hiddenView4.setVisibility(View.GONE);
                arrow4.setImageResource(R.drawable.ic_round_arrow_drop_up_24);
            }
            else {
                TransitionManager.beginDelayedTransition(cardView4, new AutoTransition());
                hiddenView4.setVisibility(View.VISIBLE);
                arrow4.setImageResource(R.drawable.ic_round_arrow_drop_down_24);
            }
        });

        arrow5.setOnClickListener(view -> {
            if (hiddenView5.getVisibility() == View.VISIBLE) {
                TransitionManager.beginDelayedTransition(cardView5, new AutoTransition());
                hiddenView5.setVisibility(View.GONE);
                arrow5.setImageResource(R.drawable.ic_round_arrow_drop_up_24);
            }
            else {
                TransitionManager.beginDelayedTransition(cardView5, new AutoTransition());
                hiddenView5.setVisibility(View.VISIBLE);
                arrow5.setImageResource(R.drawable.ic_round_arrow_drop_down_24);
            }
        });
        return rootView;
    }
}