package com.example.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MenuIndicaciones extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.indicaciones_layout);

    }
    public void irACalculadora(View view) {
        Intent intent2 = new Intent(this, Calculadora.class);
        startActivity(intent2);
    }

}
