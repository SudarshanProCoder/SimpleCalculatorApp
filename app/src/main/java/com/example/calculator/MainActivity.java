package com.example.calculator;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2;
    TextView result;
    Button add, sub, div, mul;



    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = findViewById(R.id.button2);
        sub = findViewById(R.id.button3);
        mul = findViewById(R.id.button4);
        div = findViewById(R.id.button5);
        num1 = findViewById(R.id.textView6);
        num2 = findViewById(R.id.textView7);
        result = findViewById(R.id.textView8);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);

    }

    public void onClick(View v){
        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());
        int sum;
        switch (v.getId()){

            case R.id.button2:
                sum = number1 + number2;
                result.setText(String.valueOf(sum));
                break;

            case R.id.button3:
                sum = number1 - number2;
                result.setText(String.valueOf(sum));
                break;

            case R.id.button4:
                sum = number1 * number2;
                result.setText(String.valueOf(sum));
                break;

            case R.id.button5:

                if(number2 != 0) {
                    sum = number1 / number2;
                    result.setText(String.valueOf(sum));
                }else{
                    result.setText("Cannot divide by 0");
                }
                break;

        }
    }




}