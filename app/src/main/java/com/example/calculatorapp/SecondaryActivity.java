package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import java.util.logging.Formatter;

public class SecondaryActivity extends AppCompatActivity {

    Button buttonKM;
    Button buttonMiles;
    Button buttonCalc;
    double firstValue;
    EditText editText;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        buttonKM = findViewById(R.id.buttonKM);
        buttonMiles = findViewById(R.id.buttonMiles);
        buttonCalc = findViewById(R.id.buttonCalc);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);


        buttonMiles.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("")) {
                    editText.setText("");
                }
                else {
                    firstValue = Float.parseFloat(editText.getText() + "");
                    firstValue = firstValue * 0.62137;
                    textView.setText(String.format("%.2f", firstValue) + " Miles");

                }
                editText.onEditorAction(EditorInfo.IME_ACTION_DONE);
            }

        });

        buttonKM.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("")) {
                    editText.setText("");
                }
                else {
                    firstValue = Float.parseFloat(editText.getText() + "");
                    firstValue = firstValue * 1.60934;
                    textView.setText(String.format("%.2f", firstValue) + " Kilometer");

                }
                editText.onEditorAction(EditorInfo.IME_ACTION_DONE);
            }

        });

        buttonCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity();
            }
        });
    }
    private void openSecondActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
