package com.sda.pieper.twofragmentsapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MasterFragment extends Fragment {




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.master_fragment, container, false);
        Button depositButton = (Button) view.findViewById(R.id.deposit_botton);
        final Button calculatorButton = (Button) view.findViewById(R.id.calculator_button);
        final MainActivity activity = (MainActivity) getActivity();
        depositButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.showDepositView();
            }
        });
        calculatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.showCalculatorView();
            }
        });

        return view;
    }
}
