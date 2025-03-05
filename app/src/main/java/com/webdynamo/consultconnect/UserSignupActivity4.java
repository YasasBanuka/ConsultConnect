package com.webdynamo.consultconnect;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UserSignupActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_signup4);

        TextView loginBtn = findViewById(R.id.headerButton);
        loginBtn.setOnClickListener(view -> {
            Intent intent = new Intent(UserSignupActivity4.this, UserLoginActivity.class);
            startActivity(intent);
        });

        Button homeBtn = findViewById(R.id.homeButton);
        homeBtn.setOnClickListener(view -> {
            Intent intent = new Intent(UserSignupActivity4.this, MainActivity.class);
            startActivity(intent);
        });

    }
}