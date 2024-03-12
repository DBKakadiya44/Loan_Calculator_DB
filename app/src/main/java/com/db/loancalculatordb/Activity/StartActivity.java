package com.db.loancalculatordb.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityStartBinding;

public class StartActivity extends AppCompatActivity {
    ActivityStartBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.s1));

        binding.start.setOnClickListener(v -> {
            startActivity(new Intent(StartActivity.this, WelcomeActivity.class));
        });


    }
}