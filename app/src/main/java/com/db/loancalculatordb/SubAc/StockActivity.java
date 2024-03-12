package com.db.loancalculatordb.SubAc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.db.loancalculatordb.Calculator.DeliveryCalcActivity;
import com.db.loancalculatordb.Calculator.FuturesCalcActivity;
import com.db.loancalculatordb.Calculator.IntraCalcActivity;
import com.db.loancalculatordb.Calculator.OptionCalcActivity;
import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityStockBinding;

public class StockActivity extends AppCompatActivity {
    ActivityStockBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityStockBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        binding.back.setOnClickListener(v -> {
            onBackPressed();
        });

        binding.stock1.setOnClickListener(v -> {
            startActivity(new Intent(StockActivity.this , IntraCalcActivity.class));
        });
        binding.stock2.setOnClickListener(v -> {
            startActivity(new Intent(StockActivity.this , DeliveryCalcActivity.class));
        });
        binding.stock3.setOnClickListener(v -> {
            startActivity(new Intent(StockActivity.this , FuturesCalcActivity.class));
        });
        binding.stock4.setOnClickListener(v -> {
            startActivity(new Intent(StockActivity.this , OptionCalcActivity.class));
        });

    }
}