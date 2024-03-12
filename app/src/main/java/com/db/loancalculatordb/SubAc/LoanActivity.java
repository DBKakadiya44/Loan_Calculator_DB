package com.db.loancalculatordb.SubAc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.db.loancalculatordb.Calculator.CompoundCalcActivity;
import com.db.loancalculatordb.Calculator.LoanCalcActivity;
import com.db.loancalculatordb.Calculator.MoratoriumCalcActivity;
import com.db.loancalculatordb.Calculator.TenureCalcActivity;
import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityLoanBinding;

public class LoanActivity extends AppCompatActivity {
    ActivityLoanBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityLoanBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        binding.back.setOnClickListener(v -> {
            onBackPressed();
        });

        binding.lon1.setOnClickListener(v -> {
            startActivity(new Intent(LoanActivity.this , LoanCalcActivity.class));
        });
        binding.lon2.setOnClickListener(v -> {
            startActivity(new Intent(LoanActivity.this , TenureCalcActivity.class));
        });
        binding.lon3.setOnClickListener(v -> {
            startActivity(new Intent(LoanActivity.this , CompoundCalcActivity.class));
        });
        binding.lon4.setOnClickListener(v -> {
            startActivity(new Intent(LoanActivity.this , MoratoriumCalcActivity.class));
        });

    }
}