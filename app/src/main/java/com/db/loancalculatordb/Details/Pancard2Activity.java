package com.db.loancalculatordb.Details;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityPancard2Binding;

public class Pancard2Activity extends AppCompatActivity {
    ActivityPancard2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPancard2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        binding.imageView7.setOnClickListener(view -> {
            onBackPressed();
        });

        binding.btncontinue.setOnClickListener(view -> {
                    startActivity(new Intent(Pancard2Activity.this, Pancard3Activity.class));
        });

    }
}