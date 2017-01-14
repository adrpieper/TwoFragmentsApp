package com.sda.pieper.twofragmentsapp;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showDepositView() {
        if (findViewById(R.id.frame_layout) != null) {
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.frame_layout, new DepositFragment());
            transaction.commit();
        }else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.PAGE, DetailActivity.DEPOSIT);
            startActivity(intent);
        }
    }

    public void showCalculatorView() {
        if (findViewById(R.id.frame_layout) != null) {
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.frame_layout, new CalculatoreFragment());
            transaction.commit();
        }else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.PAGE, DetailActivity.CALCULATOR);
            startActivity(intent);
        }
    }
}
