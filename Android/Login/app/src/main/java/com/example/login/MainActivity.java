package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                EditText emailInput = findViewById(R.id.emailText);
                EditText passwordInput = findViewById(R.id.passwordText);

                if (checkCredentials(emailInput.getText().toString(), passwordInput.getText().toString())) {
                    Intent intent = new Intent(MainActivity.this,
                            LoggedIn.class);
                    intent.putExtra("email", emailInput.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }

    private boolean checkCredentials(String username, String password) {
        String[][] credentials = {
                {"Stephi", "androidApp"},
                {"Frank", "Sonne"},
                {"Mario", "d1ggA!"},
                {"Mia", "urLaub"},
        };

        for (String[] data : credentials) {
            if (data[0].equals(username) && data[1].equals(password)) return true;
        }
        return false;
    }
}