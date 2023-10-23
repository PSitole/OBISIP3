package com.example.unitconverter;

import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText valueEditText;
    private TextView resultTextView;
    private Button convertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valueEditText = findViewById(R.id.valueEditText);
        resultTextView = findViewById(R.id.resultTextView);
        convertButton = findViewById(R.id.convertButton);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convert();
            }
        });
    }

    private void convert() {
        String inputValue = valueEditText.getText().toString().trim();
        if (inputValue.isEmpty()) {
            resultTextView.setText("Please enter a value");
            return;
        }

        double value = Double.parseDouble(inputValue);

        // Conversion logic
        double convertedValue = value / 100; // For example, converting centimeters to meters

        resultTextView.setText(String.valueOf(convertedValue));
    }
}

