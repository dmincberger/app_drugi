package com.example.app02;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.app02.databinding.ActivitySecondaryBinding;

import java.util.Random;

public class secondary_activity extends AppCompatActivity {

    private ActivitySecondaryBinding ActivitySecondaryBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle bundle = getIntent().getExtras();
        int ilosc = bundle.getInt("ilosc");
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_secondary);
        ActivitySecondaryBinding = ActivitySecondaryBinding.inflate(getLayoutInflater());
        View view = ActivitySecondaryBinding.getRoot();
        setContentView(view);
        Log.d("went", "wszedlem");
        for (int i = 0; i < ilosc; i++) {
            Button bt = new Button(secondary_activity.this);
            Random rnd = new Random();
            Log.d("for", "zrobilem");
            int color = Color.argb(255, rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
            bt.setBackgroundColor(color);
            bt.setText("#" + Integer.toHexString(color));
            bt.setOnClickListener(v -> {
                Intent intent = new Intent(secondary_activity.this,button_click.class);
                intent.putExtra("kolor", color);
                startActivity(intent);
            });
            ActivitySecondaryBinding.main.addView(bt);
        }
    }
}