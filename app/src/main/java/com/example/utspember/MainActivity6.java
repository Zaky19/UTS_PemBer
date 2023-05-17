package com.example.utspember;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    EditText ed7,ed8;
    Button rek;
    TextView iddata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        ed7 = findViewById(R.id.edit7);
        ed8 = findViewById(R.id.edit8);
        rek = findViewById(R.id.button4);
        iddata = findViewById(R.id.edit4);

        rek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(ed7.getText().toString());
                int num2 = Integer.parseInt(ed8.getText().toString());

                int sum = num1 / num2;
                iddata.setText(String.valueOf(sum));
            }
        });
    }
}