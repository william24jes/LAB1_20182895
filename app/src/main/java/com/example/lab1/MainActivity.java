package com.example.lab1;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView calculatorLogo;
    private TypedArray randomImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView telemathTextView = findViewById(R.id.Telemath);
        calculatorLogo = findViewById(R.id.logoMenu);
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