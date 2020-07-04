package com.example.rateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Random rand = new Random();
        number = rand.nextInt(10);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(number);
        Button btn = findViewById(R.id.checkButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputNumber = findViewById(R.id.userInput);
                TextView result = findViewById(R.id.checkResult);
                int inputNumberInt = Integer.parseInt(inputNumber.getText().toString());


                if (inputNumberInt < number) {
                    result.setText("Leider zu klein");
                } else if (inputNumberInt > number) {
                    result.setText("Leider zu groß");
                }else {
                    result.setText("RICHTIG!!!");
                }
            }
        });

    }


}