package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    TextView resultTextView;
    Button buttonClear, buttonDivide, button7, button8, button9,
            buttonMultiply, button4, button5, button6, buttonMinus, button1, button2, button3, buttonPlus,
            button0, buttonDecimal, buttonEquals;

    String text = "";
    String operator = "";
    double result = 0;
    double fnumber = 0;
    double snumber = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        resultTextView = findViewById(R.id.resultTextView);
        buttonClear = findViewById(R.id.buttonClear);
        buttonDivide = findViewById(R.id.buttonDivide);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        buttonMinus = findViewById(R.id.buttonMinus);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        buttonPlus = findViewById(R.id.buttonPlus);
        button0 = findViewById(R.id.button0);
        buttonDecimal = findViewById(R.id.buttonDecimal);
        buttonEquals = findViewById(R.id.buttonEquals);



        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText("");
                text = " ";
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + " / ";
                resultTextView.setText(text);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "7";
                resultTextView.setText(text);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "8";
                resultTextView.setText(text);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "9";
                resultTextView.setText(text);
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + " * ";
                resultTextView.setText(text);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "4";
                resultTextView.setText(text);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "5";
                resultTextView.setText(text);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "6";
                resultTextView.setText(text);
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + " - ";
                resultTextView.setText(text);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "1";
                resultTextView.setText(text);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "2";
                resultTextView.setText(text);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "3";
                resultTextView.setText(text);
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + " + ";
                resultTextView.setText(text);
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "0";
                resultTextView.setText(text);
            }
        });

        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + ".";
                resultTextView.setText(text);
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] values =  text.split(" ");
                fnumber = Double.parseDouble(values[0]);
                snumber = Double.parseDouble(values[2]);
                operator = values[1];
                if(operator.equals("+")){
                    result = fnumber + snumber;
                }
                else if (operator.equals("/")) {
                    result = fnumber / snumber;
                }
                else if (operator.equals("*")) {
                    result = fnumber * snumber;
                }
                else if (operator.equals("-")) {
                    result = fnumber - snumber;
                }
                resultTextView.setText(String.valueOf(result));
            }
        });

    }
}
