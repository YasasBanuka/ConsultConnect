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

public class UserSignupActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_signup1);

        TextView loginBtn = findViewById(R.id.headerButton);
        loginBtn.setOnClickListener(view -> {
            Intent intent = new Intent(UserSignupActivity1.this, UserLoginActivity.class);
            startActivity(intent);
        });

        Spinner countrySpinner = findViewById(R.id.countrySpinner);
        String[] countries = getResources().getStringArray(R.array.countries);
        ArrayAdapter<String> countryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, countries);
        countrySpinner.setAdapter(countryAdapter);

        countrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedCountry = parent.getItemAtPosition(position).toString();
                Toast.makeText(UserSignupActivity1.this, "Selected: " + selectedCountry, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Spinner countryCodeSpinner = findViewById(R.id.CountryCodeSpinner);
        String[] countryCode = getResources().getStringArray(R.array.country_codes);
        ArrayAdapter<String> countryCodeAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, countryCode);
        countryCodeSpinner.setAdapter(countryCodeAdapter);

        countryCodeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedCountryCode = parent.getItemAtPosition(position).toString();
                Toast.makeText(UserSignupActivity1.this, "Selected: " + selectedCountryCode, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Button verifyBtn = findViewById(R.id.VerifyBtn);
        verifyBtn.setOnClickListener(view -> {
            Intent intent = new Intent(UserSignupActivity1.this, UserSignupActivity2.class);
            startActivity(intent);
        });
    }
}