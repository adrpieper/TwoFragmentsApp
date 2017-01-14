package com.sda.pieper.twofragmentsapp;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;


public class DetailActivity extends Activity {

    public static final String PAGE = "page";
    public static final int DEPOSIT = 0;
    public static final int CALCULATOR = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int page = getIntent().getIntExtra(PAGE, DEPOSIT);
        switch (page) {
            case DEPOSIT:
                showDepositView();
                break;
            case CALCULATOR:
                showCalculatorView();
                break;
        }
    }

    public void showDepositView() {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, new DepositFragment());
        transaction.commit();
    }

    public void showCalculatorView() {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, new CalculatoreFragment());
        transaction.commit();
    }

}
