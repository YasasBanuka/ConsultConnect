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

public class UserLoginActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login2);

        TextView signupBtn = findViewById(R.id.headerButton);
        signupBtn.setOnClickListener(view -> {
            Intent intent = new Intent(UserLoginActivity2.this, UserSignupActivity1.class);
            startActivity(intent);
        });

        Spinner spinner = findViewById(R.id.spinner);

        String[] countryCodes = getResources().getStringArray(R.array.country_codes);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, countryCodes);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedCode = parent.getItemAtPosition(position).toString();
                Toast.makeText(UserLoginActivity2.this, "Selected: " + selectedCode, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Button previousBtn = findViewById(R.id.PreviousBtn);
        previousBtn.setOnClickListener(view -> {
            Intent intent = new Intent(UserLoginActivity2.this, UserLoginActivity.class);
            startActivity(intent);
        });

    }
}