package com.db.loancalculatordb.SubAc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityViewProfileBinding;

public class ViewProfileActivity extends AppCompatActivity {
    ActivityViewProfileBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        binding.back.setOnClickListener(v -> {
            onBackPressed();
        });

        binding.addbtn.setOnClickListener(v -> {
            startActivity(new Intent(ViewProfileActivity.this, CreateProfileActivity.class));
        });


    }
}