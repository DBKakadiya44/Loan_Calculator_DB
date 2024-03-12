package com.db.loancalculatordb.Details;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityAadharBinding;

public class AadharActivity extends AppCompatActivity {
    ActivityAadharBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAadharBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));


        binding.imageView7.setOnClickListener(view -> {
            onBackPressed();
        });

        binding.aadhar1.setOnClickListener(view -> {
                    Intent intent = new Intent(AadharActivity.this, AadharLoanDetailsActivity.class);
                    intent.putExtra("cnt", 1);
                    startActivity(intent);
        });
        binding.aadhar2.setOnClickListener(view -> {
                    Intent intent = new Intent(AadharActivity.this, AadharLoanDetailsActivity.class);
                    intent.putExtra("cnt", 2);
                    startActivity(intent);
        });
        binding.aadhar3.setOnClickListener(view -> {
                    Intent intent = new Intent(AadharActivity.this, AadharLoanDetailsActivity.class);
                    intent.putExtra("cnt", 3);
                    startActivity(intent);
        });
        binding.aadhar4.setOnClickListener(view -> {
                    Intent intent = new Intent(AadharActivity.this, AadharLoanDetailsActivity.class);
                    intent.putExtra("cnt", 4);
                    startActivity(intent);
        });
        binding.aadhar5.setOnClickListener(view -> {
                    Intent intent = new Intent(AadharActivity.this, AadharLoanDetailsActivity.class);
                    intent.putExtra("cnt", 5);
                    startActivity(intent);
        });

    }

}