package com.example.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MenuPrincipal extends AppCompatActivity {

    private ImageView calculatorLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView telemathTextView = findViewById(R.id.Telemath);
        calculatorLogo = findViewById(R.id.logoMenu);
        registerForContextMenu(telemathTextView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.color_azul) {
            setImageViewImage("circulo");
            return true;
        } else if (itemId == R.id.color_verde) {
            setImageViewImage("circulo_verde");
            return true;
        } else if (itemId == R.id.color_rojo) {
            setImageViewImage("circulo_rojo");
            return true;
        } else {
            return super.onContextItemSelected(item);
        }
    }


    private void setImageViewImage(String imageName) {
        int resourceId = getResources().getIdentifier(imageName, "drawable", getPackageName());
        if (resourceId != 0) {
            calculatorLogo.setImageResource(resourceId);
        }
    }

    public void irAVentana2(View view) {
        Intent intent = new Intent(this, MenuIndicaciones.class);
        startActivity(intent);
    }

    public void irACalculadora(View view) {
        Intent intent2 = new Intent(this, Calculadora.class);
        startActivity(intent2);
    }

}