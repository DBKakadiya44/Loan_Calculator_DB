package com.db.loancalculatordb.SubAc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.db.loancalculatordb.Calculator.FdCalcActivity;
import com.db.loancalculatordb.Calculator.PpfCalcActivity;
import com.db.loancalculatordb.Calculator.RdCalcActivity;
import com.db.loancalculatordb.Calculator.RoiCalcActivity;
import com.db.loancalculatordb.Calculator.SipCalcActivity;
import com.db.loancalculatordb.Calculator.SwpCalcActivity;
import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityFinanceBinding;

public class FinanceActivity extends AppCompatActivity {
    ActivityFinanceBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityFinanceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        binding.back.setOnClickListener(v -> {
            onBackPressed();
        });

        binding.roi.setOnClickListener(v -> {
            startActivity(new Intent(FinanceActivity.this , RoiCalcActivity.class));
        });
        binding.fd.setOnClickListener(v -> {
            startActivity(new Intent(FinanceActivity.this , FdCalcActivity.class));
        });
        binding.sip.setOnClickListener(v -> {
            startActivity(new Intent(FinanceActivity.this , SipCalcActivity.class));
        });
        binding.swp.setOnClickListener(v -> {
            startActivity(new Intent(FinanceActivity.this , SwpCalcActivity.class));
        });
        binding.rd.setOnClickListener(v -> {
            startActivity(new Intent(FinanceActivity.this , RdCalcActivity.class));
        });
        binding.ppf.setOnClickListener(v -> {
            startActivity(new Intent(FinanceActivity.this , PpfCalcActivity.class));
        });

    }
}