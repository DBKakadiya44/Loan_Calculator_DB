package com.db.loancalculatordb.SubAc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityCreateProfileBinding;

public class CreateProfileActivity extends AppCompatActivity {
    ActivityCreateProfileBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCreateProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        binding.back.setOnClickListener(v -> {
            onBackPressed();
        });

        binding.btnSave.setOnClickListener(v -> {

        });
        binding.btnCancel.setOnClickListener(v -> {

        });


    }
}