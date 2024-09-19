package com.example.app02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.app02.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);

        Button bt = new Button(MainActivity.this); // context = AnyActivity.this
        activityMainBinding.linearLayout.addView(bt);

        activityMainBinding.bt.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this,secondary_activity.class);
            int ilosc = Integer.parseInt(activityMainBinding.ilosc.getText().toString());
            intent.putExtra("ilosc",ilosc);
            startActivity(intent);

        });

    }
}