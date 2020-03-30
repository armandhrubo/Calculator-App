package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonPow, buttonPoint, buttonC, buttonEqual;
    EditText calculatorEditText, opEditText;

    float FirstVal, SecondVal;
    double result;

    boolean calcAddition, calcMinus, calcMultiplication, calcDivision, calcPow, check = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonPoint = (Button) findViewById(R.id.buttonDecimal);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonPow = (Button) findViewById(R.id.buttonPow);
        buttonDivision = (Button) findViewById(R.id.buttonDivision);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        calculatorEditText = (EditText) findViewById(R.id.result);
        opEditText = (EditText) findViewById(R.id.op);

        button1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (check) {
                    calculatorEditText.setText("1");
                    check = false;
                }
                else {
                    calculatorEditText.setText(calculatorEditText.getText() + "1");
                }
                opEditText.setText("");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (check) {
                    calculatorEditText.setText("2");
                    check = false;
                }
                else {
                    calculatorEditText.setText(calculatorEditText.getText() + "2");
                }
                opEditText.setText("");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (check) {
                    calculatorEditText.setText("3");
                    check = false;
                }
                else {
                    calculatorEditText.setText(calculatorEditText.getText() + "3");
                }
                opEditText.setText("");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (check) {
                    calculatorEditText.setText("4");
                    check = false;
                }
                else {
                    calculatorEditText.setText(calculatorEditText.getText() + "4");
                }
                opEditText.setText("");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (check) {
                    calculatorEditText.setText("5");
                    check = false;
                }
                else {
                    calculatorEditText.setText(calculatorEditText.getText() + "5");
                }
                opEditText.setText("");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
           @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (check) {
                    calculatorEditText.setText("6");
                    check = false;
                }
                else {
                    calculatorEditText.setText(calculatorEditText.getText() + "6");
                }
                opEditText.setText("");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (check) {
                    calculatorEditText.setText("7");
                    check = false;
                }
                else {
                    calculatorEditText.setText(calculatorEditText.getText() + "7");
                }
                opEditText.setText("");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (check) {
                    calculatorEditText.setText("8");
                    check = false;
                }
                else {
                    calculatorEditText.setText(calculatorEditText.getText() + "8");
                }
                opEditText.setText("");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (check) {
                    calculatorEditText.setText("9");
                    check = false;
                }
                else {
                    calculatorEditText.setText(calculatorEditText.getText() + "9");
                }
                opEditText.setText("");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (check) {
                    calculatorEditText.setText("0");
                    check = false;
                }
                else {
                    calculatorEditText.setText(calculatorEditText.getText() + "0");
                }
                opEditText.setText("");
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorEditText.setText("");
                opEditText.setText("");
            }
        });

        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (check) {
                    calculatorEditText.setText("0.");
                    check = false;
                }
                else {
                    calculatorEditText.setText(calculatorEditText.getText() + ".");
                }
                opEditText.setText("");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculatorEditText.getText().toString().equals("")) {
                    calculatorEditText.setText("");
                }
                else {
                    FirstVal = Float.parseFloat(calculatorEditText.getText() + "");
                    calcAddition = true;
                    calculatorEditText.setText("");
                    opEditText.setText("+");
                }

            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculatorEditText.getText().toString().equals("")) {
                    calculatorEditText.setText("");
                }
                else {
                    FirstVal = Float.parseFloat(calculatorEditText.getText() + "");
                    calcMinus = true;
                    calculatorEditText.setText("");
                    opEditText.setText("-");
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculatorEditText.getText().toString().equals("")) {
                    calculatorEditText.setText("");
                }
                else {
                    FirstVal = Float.parseFloat(calculatorEditText.getText() + "");
                    calcMultiplication = true;
                    calculatorEditText.setText("");
                    opEditText.setText("*");
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calculatorEditText.getText().toString().equals("")){
                    calculatorEditText.setText("");
                }
                else {
                    FirstVal = Float.parseFloat(calculatorEditText.getText() + "");
                    calcDivision = true;
                    calculatorEditText.setText("");
                    opEditText.setText("/");
                }
            }
        });

        buttonPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculatorEditText.getText().toString().equals("")) {
                    calculatorEditText.setText("");
                }
                else {
                    FirstVal = Float.parseFloat(calculatorEditText.getText() + "");
                    calcPow = true;
                    calculatorEditText.setText("");
                    opEditText.setText("^");
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                SecondVal = Float.parseFloat(calculatorEditText.getText() + "");
                check = true;
                NumberFormat format = new DecimalFormat("0.#");


                if (calcAddition) {
                    result = FirstVal + SecondVal;
                    calculatorEditText.setText(format.format(result) + "");
                    calcAddition = false;
                }

                if (calcMinus) {
                    result = FirstVal - SecondVal;
                    calculatorEditText.setText(format.format(result) + "");
                    calcMinus = false;
                }

                if (calcMultiplication) {
                    result = FirstVal * SecondVal;
                    calculatorEditText.setText(format.format(result) + "");
                    calcMultiplication = false;
                }

                if (calcDivision) {
                    result = FirstVal / SecondVal;
                    calculatorEditText.setText(format.format(result) + "");
                    calcDivision = false;
                }

                if (calcPow) {
                    result = Math.pow(FirstVal, SecondVal);
                    calculatorEditText.setText(format.format(result) + "");
                    calcPow = false;
                }
            }
        });

    }
}
