package com.example.lab1;

import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView calculatorLogo;
    private TypedArray randomImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView telemathTextView = findViewById(R.id.Telemath);
        calculatorLogo = findViewById(R.id.calculatorLogo);
        randomImages = getResources().obtainTypedArray(R.array.random_images);

        telemathTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener una imagen al azar
                Random random = new Random();
                int randomIndex = random.nextInt(randomImages.length());
                int randomImageId = randomImages.getResourceId(randomIndex, -1);

                if (randomImageId != -1) {
                    calculatorLogo.setImageResource(randomImageId);
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        randomImages.recycle();
    }

}