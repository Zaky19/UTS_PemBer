package com.example.utspember;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    EditText ed1,ed2;
    Button res;
    TextView getdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ed1 = findViewById(R.id.edittext);
        ed2 = findViewById(R.id.edittext2);
        res = findViewById(R.id.button1);
        getdata = findViewById(R.id.edit);

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(ed1.getText().toString());
                int num2 = Integer.parseInt(ed2.getText().toString());

                int sum = num1 + num2;
                getdata.setText(String.valueOf(sum));
            }
        });
    }
}