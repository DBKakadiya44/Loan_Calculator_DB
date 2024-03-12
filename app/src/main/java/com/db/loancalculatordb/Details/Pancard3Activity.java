package com.db.loancalculatordb.Details;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityPancard3Binding;

public class Pancard3Activity extends AppCompatActivity {
    ActivityPancard3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPancard3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        binding.imageView7.setOnClickListener(view -> {
            onBackPressed();
        });

        binding.pan1.setOnClickListener(view -> {
            Intent intent = new Intent(Pancard3Activity.this, AadharLoanDetailsActivity.class);
            intent.putExtra("cnt", 10);
            startActivity(intent);
        });
        binding.pan2.setOnClickListener(view -> {
            Intent intent = new Intent(Pancard3Activity.this, AadharLoanDetailsActivity.class);
            intent.putExtra("cnt", 11);
            startActivity(intent);
        });
        binding.pan3.setOnClickListener(view -> {
            Intent intent = new Intent(Pancard3Activity.this, AadharLoanDetailsActivity.class);
            intent.putExtra("cnt", 12);
            startActivity(intent);
        });
        binding.pan4.setOnClickListener(view -> {
            Intent intent = new Intent(Pancard3Activity.this, AadharLoanDetailsActivity.class);
            intent.putExtra("cnt", 13);
            startActivity(intent);
        });
        binding.pan5.setOnClickListener(view -> {
            Intent intent = new Intent(Pancard3Activity.this, AadharLoanDetailsActivity.class);
            intent.putExtra("cnt", 14);
            startActivity(intent);
        });
        binding.pan6.setOnClickListener(view -> {
            Intent intent = new Intent(Pancard3Activity.this, AadharLoanDetailsActivity.class);
            intent.putExtra("cnt", 15);
            startActivity(intent);
        });
        binding.pan7.setOnClickListener(view -> {
            Intent intent = new Intent(Pancard3Activity.this, AadharLoanDetailsActivity.class);
            intent.putExtra("cnt", 16);
            startActivity(intent);
        });

    }

}