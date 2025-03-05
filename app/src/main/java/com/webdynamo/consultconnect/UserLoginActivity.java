package com.webdynamo.consultconnect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UserLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        TextView signupBtn = findViewById(R.id.headerButton);
        signupBtn.setOnClickListener(view -> {
            Intent intent = new Intent(UserLoginActivity.this, UserSignupActivity1.class);
            startActivity(intent);
        });

        Button mobileBtn = findViewById(R.id.mobileNumberButton);
        mobileBtn.setOnClickListener(view -> {
            Intent intent = new Intent(UserLoginActivity.this, UserLoginActivity2.class);
            startActivity(intent);
        });

        Button guestBtn = findViewById(R.id.guestButton);
        guestBtn.setOnClickListener(view -> {
            Intent intent = new Intent(UserLoginActivity.this, MainActivity.class);
            startActivity(intent);
        });


    }
}