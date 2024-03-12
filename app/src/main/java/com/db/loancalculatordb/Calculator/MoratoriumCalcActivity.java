package com.db.loancalculatordb.Calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityMoratoriumCalcBinding;

public class MoratoriumCalcActivity extends AppCompatActivity {
    ActivityMoratoriumCalcBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMoratoriumCalcBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        binding.imgBack.setOnClickListener(v -> {
            onBackPressed();
        });




    }
}