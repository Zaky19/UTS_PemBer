package com.example.utspember;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    EditText ed3,ed4;
    Button rec;
    TextView indata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ed3 = findViewById(R.id.edit3);
        ed4 = findViewById(R.id.edit4);
        rec = findViewById(R.id.button2);
        indata = findViewById(R.id.edit2);

        rec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(ed3.getText().toString());
                int num2 = Integer.parseInt(ed4.getText().toString());

                int sum = num1 - num2;
                indata.setText(String.valueOf(sum));
            }
        });
    }
}