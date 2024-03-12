package com.db.loancalculatordb.SubAc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityLoanTypeBinding;

public class LoanTypeActivity extends AppCompatActivity {
    ActivityLoanTypeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityLoanTypeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        binding.back.setOnClickListener(v -> {
            onBackPressed();
        });

        binding.car.setOnClickListener(v -> {
            startActivity(new Intent(LoanTypeActivity.this , TypeDetailsActivity.class).putExtra("cnt",1));
        });
        binding.business.setOnClickListener(v -> {
            startActivity(new Intent(LoanTypeActivity.this , TypeDetailsActivity.class).putExtra("cnt",2));
        });
        binding.personal.setOnClickListener(v -> {
            startActivity(new Intent(LoanTypeActivity.this , TypeDetailsActivity.class).putExtra("cnt",3));
        });


    }
}