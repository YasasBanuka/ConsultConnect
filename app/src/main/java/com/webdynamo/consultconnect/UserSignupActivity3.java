package com.webdynamo.consultconnect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UserSignupActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_signup3);

        TextView loginBtn = findViewById(R.id.headerButton);
        loginBtn.setOnClickListener(view -> {
            Intent intent = new Intent(UserSignupActivity3.this, UserLoginActivity.class);
            startActivity(intent);
        });

        Spinner honorificsSpinner = findViewById(R.id.honorificsSpinner);
        String[] honorifics = getResources().getStringArray(R.array.honorifics);
        ArrayAdapter<String> honorificsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, honorifics);
        honorificsSpinner.setAdapter(honorificsAdapter);

        honorificsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedHonorific = parent.getItemAtPosition(position).toString();
                Toast.makeText(UserSignupActivity3.this, "Selected: " + selectedHonorific, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Button previousBtn = findViewById(R.id.PreviousBtn);
        previousBtn.setOnClickListener(view -> {
            Intent intent = new Intent(UserSignupActivity3.this, UserSignupActivity2.class);
            startActivity(intent);
        });

        Button verifyBtn = findViewById(R.id.VerifyBtn);
        verifyBtn.setOnClickListener(view -> {
            Intent intent = new Intent(UserSignupActivity3.this, UserSignupActivity4.class);
            startActivity(intent);
        });

    }
}