package com.db.loancalculatordb.Details;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityFaqsBinding;


public class FaqsActivity extends AppCompatActivity {
    ActivityFaqsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFaqsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        binding.imageView7.setOnClickListener(view -> {
            onBackPressed();
        });

        binding.faqs1.setOnClickListener(view -> {
                    Intent intent = new Intent(FaqsActivity.this, AadharLoanDetailsActivity.class);
                    intent.putExtra("cnt", 6);
                    startActivity(intent);
        });
        binding.faqs2.setOnClickListener(view -> {
                    Intent intent = new Intent(FaqsActivity.this, AadharLoanDetailsActivity.class);
                    intent.putExtra("cnt", 7);
                    startActivity(intent);
        });
        binding.faqs3.setOnClickListener(view -> {
                    Intent intent = new Intent(FaqsActivity.this, AadharLoanDetailsActivity.class);
                    intent.putExtra("cnt", 8);
                    startActivity(intent);
        });
        binding.faqs4.setOnClickListener(view -> {
                    Intent intent = new Intent(FaqsActivity.this, AadharLoanDetailsActivity.class);
                    intent.putExtra("cnt", 9);
                    startActivity(intent);
        });

    }

}