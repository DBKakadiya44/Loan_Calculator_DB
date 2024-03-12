package com.db.loancalculatordb.SubAc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.db.loancalculatordb.Calculator.RdCalcActivity;
import com.db.loancalculatordb.Details.DetailPageActivity;
import com.db.loancalculatordb.Details.FaqsActivity;
import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityCreditScoreBinding;

public class CreditScoreActivity extends AppCompatActivity {
    ActivityCreditScoreBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCreditScoreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        binding.back.setOnClickListener(v -> {
            onBackPressed();
        });

        binding.crm1.setOnClickListener(view -> {
                    Intent intent = new Intent(CreditScoreActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 9);
                    startActivity(intent);
        });
        binding.crm2.setOnClickListener(view -> {
                    Intent intent = new Intent(CreditScoreActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 10);
                    startActivity(intent);
        });
        binding.crm3.setOnClickListener(view -> {
                    Intent intent = new Intent(CreditScoreActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 11);
                    startActivity(intent);
        });
        binding.crm4.setOnClickListener(view -> {
                    Intent intent = new Intent(CreditScoreActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 12);
                    startActivity(intent);
        });
        binding.crm5.setOnClickListener(view -> {
                    Intent intent = new Intent(CreditScoreActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 13);
                    startActivity(intent);
        });
        binding.crm6.setOnClickListener(view -> {
                    Intent intent = new Intent(CreditScoreActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 14);
                    startActivity(intent);
        });
        binding.crm7.setOnClickListener(view -> {
                    Intent intent = new Intent(CreditScoreActivity.this, RdCalcActivity.class);
                    intent.putExtra("cnt", 15);
                    startActivity(intent);
        });
        binding.crm8.setOnClickListener(view -> {
                    Intent intent = new Intent(CreditScoreActivity.this, FaqsActivity.class);
                    startActivity(intent);
        });

    }

}