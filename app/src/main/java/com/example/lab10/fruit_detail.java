package com.example.lab10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class fruit_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_detail);

        Intent intent = getIntent();
        String fruitName = intent.getStringExtra("fruitName");
        String fruitImg = intent.getStringExtra("fruitImg");

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        switch (fruitImg) {
            case "banana":
                imageView.setImageResource(R.drawable.banana);
                break;
            case "blueberry":
                imageView.setImageResource(R.drawable.blueberry);
                break;
            case "melon_warter":
                imageView.setImageResource(R.drawable.melon_warter);
                break;
            case "orange":
                imageView.setImageResource(R.drawable.orange);
                break;
            case "rambutan":
                imageView.setImageResource(R.drawable.rambutan);
                break;
            default:
                imageView.setImageResource(R.drawable.tamarind);
        }
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(fruitName);
    }
}