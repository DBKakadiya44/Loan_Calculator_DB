package com.db.loancalculatordb.SubAc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.db.loancalculatordb.Details.DetailPageActivity;
import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityInsuranceBinding;

public class InsuranceActivity extends AppCompatActivity {
    ActivityInsuranceBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityInsuranceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        binding.back.setOnClickListener(v -> {
            onBackPressed();
        });

        binding.gi1.setOnClickListener(v -> {
            startActivity(new Intent(InsuranceActivity.this , DetailPageActivity.class).putExtra("cnt",16));
        });
        binding.gi2.setOnClickListener(v -> {
            startActivity(new Intent(InsuranceActivity.this , DetailPageActivity.class).putExtra("cnt",17));
        });
        binding.gi3.setOnClickListener(v -> {
            startActivity(new Intent(InsuranceActivity.this , DetailPageActivity.class).putExtra("cnt",18));
        });
        binding.gi4.setOnClickListener(v -> {
            startActivity(new Intent(InsuranceActivity.this , DetailPageActivity.class).putExtra("cnt",27));
        });
        binding.gi5.setOnClickListener(v -> {
            startActivity(new Intent(InsuranceActivity.this , DetailPageActivity.class).putExtra("cnt",19));
        });
        binding.gi6.setOnClickListener(v -> {
            startActivity(new Intent(InsuranceActivity.this , DetailPageActivity.class).putExtra("cnt",20));
        });

        binding.li1.setOnClickListener(v -> {
            startActivity(new Intent(InsuranceActivity.this , DetailPageActivity.class).putExtra("cnt",21));
        });
        binding.li2.setOnClickListener(v -> {
            startActivity(new Intent(InsuranceActivity.this , DetailPageActivity.class).putExtra("cnt",22));
        });
        binding.li3.setOnClickListener(v -> {
            startActivity(new Intent(InsuranceActivity.this , DetailPageActivity.class).putExtra("cnt",23));
        });
        binding.li4.setOnClickListener(v -> {
            startActivity(new Intent(InsuranceActivity.this , DetailPageActivity.class).putExtra("cnt",24));
        });
        binding.li5.setOnClickListener(v -> {
            startActivity(new Intent(InsuranceActivity.this , DetailPageActivity.class).putExtra("cnt",25));
        });
        binding.li6.setOnClickListener(v -> {
            startActivity(new Intent(InsuranceActivity.this , DetailPageActivity.class).putExtra("cnt",26));
        });

    }
}