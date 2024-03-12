package com.db.loancalculatordb.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityIntro3Binding;

public class Intro3Activity extends AppCompatActivity {
    ActivityIntro3Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityIntro3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.i3));

        binding.next.setOnClickListener(v -> {
            startActivity(new Intent(Intro3Activity.this , StartActivity.class));
        });



    }
}