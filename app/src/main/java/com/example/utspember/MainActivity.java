package com.example.utspember;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button pindah1, pindah2, pindah3, pindah4, pindah5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pindah1 = (Button) findViewById(R.id.pindah1);
        pindah2 = (Button) findViewById(R.id.pindah2);
        pindah3 = (Button) findViewById(R.id.pindah3);
        pindah4 = (Button) findViewById(R.id.pindah4);
        pindah5 = (Button) findViewById(R.id.pindah5);

        pindah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buka1 = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(buka1);
            }
        });

        pindah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buka2 = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(buka2);
            }
        });

        pindah3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buka3 = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(buka3);
            }
        });

        pindah4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buka4 = new Intent(getApplicationContext(), MainActivity5.class);
                startActivity(buka4);
            }
        });

        pindah5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buka5 = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(buka5);
            }
        });
    }
}