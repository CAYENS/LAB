package com.example.tomjerry;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView tomImageView;
    private ImageView jerryImageView;
    private boolean isTomVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Находим ImageView элементы на макете
        tomImageView = findViewById(R.id.tomImageView);
        jerryImageView = findViewById(R.id.jerryImageView);
    }

    public void toggleVisibility(View view) {
        if (isTomVisible) {
            // Скрываем Tom и показываем Jerry
            animateView(tomImageView, 0, 1);
            animateView(jerryImageView, 1, 0);
        } else {
            // Скрываем Jerry и показываем Tom
            animateView(tomImageView, 1, 0);
            animateView(jerryImageView, 0, 1);
        }
        isTomVisible = !isTomVisible; // Переключаем флаг видимости
    }

    private void animateView(ImageView imageView, float fromAlpha, float toAlpha) {
        imageView.animate()
                .alpha(toAlpha)
                .rotation(imageView.getRotation() + 3600)
                .scaleY(toAlpha)
                .scaleX(toAlpha)
                .setDuration(3000);
    }
}
