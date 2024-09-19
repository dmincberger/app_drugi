package com.example.app02;

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

public class secondary_activity extends AppCompatActivity {

    private ActivitySecondaryBinding ActivitySecondaryBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle bundle = getIntent().getExtras();
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_secondary);
        ActivitySecondaryBinding = ActivitySecondaryBinding.inflate(getLayoutInflater());
        View view = ActivitySecondaryBinding.getRoot();
        setContentView(view);

    }
}