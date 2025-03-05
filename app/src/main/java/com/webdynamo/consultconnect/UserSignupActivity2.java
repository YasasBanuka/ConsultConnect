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

public class UserSignupActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_signup2);

        TextView loginBtn = findViewById(R.id.headerButton);
        loginBtn.setOnClickListener(view -> {
            Intent intent = new Intent(UserSignupActivity2.this, UserLoginActivity.class);
            startActivity(intent);
        });

        Button previousBtn = findViewById(R.id.PreviousBtn);
        previousBtn.setOnClickListener(view -> {
            Intent intent = new Intent(UserSignupActivity2.this, UserSignupActivity1.class);
            startActivity(intent);
        });

        Button verifyBtn = findViewById(R.id.VerifyBtn);
        verifyBtn.setOnClickListener(view -> {
            Intent intent = new Intent(UserSignupActivity2.this, UserSignupActivity3.class);
            startActivity(intent);
        });

    }
}