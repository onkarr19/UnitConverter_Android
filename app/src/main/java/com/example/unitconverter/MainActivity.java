package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText input;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.inputValue);
        button = findViewById(R.id.convert);
        output = findViewById(R.id.output);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n = Double.parseDouble(input.getText().toString());
//                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
                output.setText("Converted value is: "+ n);

            }
        });
    }
}