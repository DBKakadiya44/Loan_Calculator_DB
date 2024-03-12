package com.db.loancalculatordb.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityIntro1Binding;

public class Intro1Activity extends AppCompatActivity {
    ActivityIntro1Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntro1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.i1));

        binding.next.setOnClickListener(v -> {
            startActivity(new Intent(Intro1Activity.this , Intro2Activity.class));
        });



    }
}