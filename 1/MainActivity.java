package com.example.unitconverter1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View viewlength = findViewById(R.id.length);
        View viewweight = findViewById(R.id.weight);
        viewlength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inext;
                inext= new Intent(MainActivity.this, MainActivity2.class);
                startActivity(inext);

            }
        });
        viewweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inext=new Intent(MainActivity.this, MainActivity3.class);
                startActivity(inext);
            }
        });
    }
}