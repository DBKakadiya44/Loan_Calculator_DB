package com.db.loancalculatordb.Details;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityVotingBinding;

public class VoterActivity extends AppCompatActivity {
    ActivityVotingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVotingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        binding.imageView7.setOnClickListener(view -> {
            onBackPressed();
        });

    }
}