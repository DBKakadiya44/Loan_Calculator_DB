package com.db.loancalculatordb.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.db.loancalculatordb.Calculator.EmiCalcActivity;
import com.db.loancalculatordb.Calculator.GST_CalcActivity;
import com.db.loancalculatordb.Calculator.HomeLoanCalcActivity;
import com.db.loancalculatordb.Calculator.VAT_Calculaor;
import com.db.loancalculatordb.Details.BalanceInquiryActivity;
import com.db.loancalculatordb.R;
import com.db.loancalculatordb.SubAc.CreateProfileActivity;
import com.db.loancalculatordb.SubAc.CreditScoreActivity;
import com.db.loancalculatordb.SubAc.DocumentActivity;
import com.db.loancalculatordb.SubAc.FinanceActivity;
import com.db.loancalculatordb.SubAc.InsuranceActivity;
import com.db.loancalculatordb.SubAc.LoanActivity;
import com.db.loancalculatordb.SubAc.LoanTypeActivity;
import com.db.loancalculatordb.SubAc.MutualActivity;
import com.db.loancalculatordb.SubAc.StockActivity;
import com.db.loancalculatordb.SubAc.ViewProfileActivity;
import com.db.loancalculatordb.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    public static int decimalPlace;
    public static int numberFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        binding.top1.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this , EmiCalcActivity.class));
        });
        binding.top2.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this , LoanTypeActivity.class));
        });

        binding.mid1.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this , FinanceActivity.class));
        });
        binding.mid2.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this , BalanceInquiryActivity.class));
        });
        binding.mid3.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this , LoanActivity.class));
        });
        binding.mid4.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this , StockActivity.class));
        });
        binding.mid5.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this , GST_CalcActivity.class));
        });
        binding.mid6.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this , VAT_Calculaor.class));
        });

        binding.bot1.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this , MutualActivity.class));
        });
        binding.bot2.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this , CreditScoreActivity.class));
        });
        binding.bot3.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this , DocumentActivity.class));
        });
        binding.bot4.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this , InsuranceActivity.class));
        });

        binding.loan1.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this , CreateProfileActivity.class));
        });
        binding.loan2.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this , ViewProfileActivity.class));
        });
        binding.loan3.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this , HomeLoanCalcActivity.class));
        });

    }
}