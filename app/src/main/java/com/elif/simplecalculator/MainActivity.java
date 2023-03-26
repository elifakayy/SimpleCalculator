package com.elif.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    TextView sonuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 =findViewById(R.id.number1);
        number2=findViewById(R.id.number2);
        sonuc =findViewById(R.id.sonuc);

        /*Button toplama =findViewById(R.id.toplama);

        toplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toplama(number1+number2);
            }
        });

        Button cikarma =findViewById(R.id.cikarma);

        toplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cikarma(number1);
            }
        });*/
    }


    public void toplama(View view)
    {
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")) {

            sonuc.setText("Enter Number!");
        }
        else {
            Double number1_ = Double.parseDouble(number1.getText().toString());
            Double number2_ = Double.parseDouble(number2.getText().toString());

            Double sonuc_ = number1_ + number2_;

            sonuc.setText("Result: " + sonuc_);
        }

    }

    public void cikarma(View view)
    {
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")) {

            sonuc.setText("Enter Number!");
        }
        else {
            Double number1_ = Double.parseDouble(number1.getText().toString());
            Double number2_ = Double.parseDouble(number2.getText().toString());

            Double sonuc_ = number1_ - number2_;

            sonuc.setText("Result: " + sonuc_);
        }
    }


    public void bolme(View view)
    {
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")) {

            sonuc.setText("Enter Number!");
        }
        else{
            Double number1_ = Double.parseDouble(number1.getText().toString());
            Double number2_ = Double.parseDouble(number2.getText().toString());

            Double sonuc_ = number1_ / number2_;

            sonuc.setText("Result: " + sonuc_);
        }
    }


    public void carpma(View view)
    {
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")) {

            sonuc.setText("Enter Number!");
        }
        else {
            Double number1_ = Double.parseDouble(number1.getText().toString());
            Double number2_ = Double.parseDouble(number2.getText().toString());

            Double sonuc_ = number1_ * number2_;

            sonuc.setText("Result: " + sonuc_);
        }
    }

}