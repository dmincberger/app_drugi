package com.example.app02;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.app02.databinding.ActivityButtonClickBinding;

public class button_click extends AppCompatActivity {

    private ActivityButtonClickBinding ActivityButtonClickBinding;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle bundle = getIntent().getExtras();
        int kolor = bundle.getInt("kolor");
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_button_click);

        ActivityButtonClickBinding = ActivityButtonClickBinding.inflate(getLayoutInflater());
        View view = ActivityButtonClickBinding.getRoot();
        setContentView(view);
        Button bt = new Button(button_click.this);
        bt.setText(Integer.toString(kolor));
        bt.setBackgroundColor(kolor);
        ActivityButtonClickBinding.main.addView(bt);
    }
}