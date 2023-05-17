package com.example.utspember;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    EditText ed5,ed6;
    Button rer;
    TextView ipdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        ed5 = findViewById(R.id.edit5);
        ed6 = findViewById(R.id.edit6);
        rer = findViewById(R.id.button3);
        ipdata = findViewById(R.id.edit3);

        rer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(ed5.getText().toString());
                int num2 = Integer.parseInt(ed6.getText().toString());

                int sum = num1 * num2;
                ipdata.setText(String.valueOf(sum));
            }
        });
    }
}