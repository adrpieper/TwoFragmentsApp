package com.sda.pieper.twofragmentsapp;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DepositFragment extends Fragment {

    private DepositLogic depositLogic = new DepositLogic();

    public DepositFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_deposit, container, false);
        final EditText amountEditText = (EditText) view.findViewById(R.id.amount_edit);
        final EditText percentEditText = (EditText) view.findViewById(R.id.percernt_edit);
        final EditText yearsEditText = (EditText) view.findViewById(R.id.years_edit);
        final Button button = (Button) view.findViewById(R.id.count_button);
        final TextView resultTextView = (TextView) view.findViewById(R.id.result_text_field);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    int amount = Integer.parseInt(amountEditText.getText().toString());
                    int percent = Integer.parseInt(percentEditText.getText().toString());
                    int years = Integer.parseInt(yearsEditText.getText().toString());
                    int result = depositLogic.calc(amount, percent, years);
                    resultTextView.setText(Integer.toString(result));
                    /*
                    Nie wiemy, czy urzytkownik wypełni pola poprawnie, przed wciśnięciem przycisku Licz.
                    Dlatego należy się przed tym zabezpieczyć przez zastosowanie klauzuli try-catch
                     */
                }catch (NumberFormatException e) {
                    resultTextView.setText("Błędne dane");
                }

            }
        });


        return view;
    }

}
