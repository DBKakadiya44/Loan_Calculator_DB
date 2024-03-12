package com.db.loancalculatordb.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityIntro2Binding;

public class Intro2Activity extends AppCompatActivity {
    ActivityIntro2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityIntro2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.i2));

        binding.next.setOnClickListener(v -> {
            startActivity(new Intent(Intro2Activity.this , Intro3Activity.class));
        });




    }
}