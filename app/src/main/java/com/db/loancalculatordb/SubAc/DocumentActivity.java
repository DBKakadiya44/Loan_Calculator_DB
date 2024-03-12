package com.db.loancalculatordb.SubAc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import com.db.loancalculatordb.Details.AadharActivity;
import com.db.loancalculatordb.Details.Pancard1Activity;
import com.db.loancalculatordb.Details.VoterActivity;
import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityDocumentBinding;

public class DocumentActivity extends AppCompatActivity {
    ActivityDocumentBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDocumentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        binding.back.setOnClickListener(v -> {
            onBackPressed();
        });

        binding.dc1.setOnClickListener(v -> {
            startActivity(new Intent(DocumentActivity.this , AadharActivity.class));
        });
        binding.dc2.setOnClickListener(v -> {
            startActivity(new Intent(DocumentActivity.this , VoterActivity.class));
        });
        binding.dc3.setOnClickListener(v -> {
            startActivity(new Intent(DocumentActivity.this , Pancard1Activity.class));
        });

    }
}