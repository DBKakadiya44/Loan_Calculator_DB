package com.db.loancalculatordb.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityWelcomeBinding;

public class WelcomeActivity extends AppCompatActivity {
    ActivityWelcomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWelcomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        binding.start.setOnClickListener(v -> {
            startActivity(new Intent(WelcomeActivity.this , MainActivity.class));
        });
        binding.rate.setOnClickListener(v -> {
            String packageName = getPackageName();
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
            } catch (ActivityNotFoundException unused) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + packageName)));
            }
        });
        binding.share.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", "Hey Download the app for Many Usefull Calculations : https://play.google.com/store/apps/details?id=" + getPackageName());
            intent.setType("text/plain");
            startActivity(intent);
        });
        binding.privacy.setOnClickListener(v -> {

        });


    }
}