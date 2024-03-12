package com.db.loancalculatordb.Details;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityPancard1Binding;

import java.lang.annotation.Native;

public class Pancard1Activity extends AppCompatActivity {
    ActivityPancard1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPancard1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        binding.imageView7.setOnClickListener(view -> {
            onBackPressed();
        });

        binding.btnApply.setOnClickListener(view -> {
                    startActivity(new Intent(Pancard1Activity.this, Pancard2Activity.class));
        });

    }
}