package com.db.loancalculatordb.Details;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.db.loancalculatordb.R;

import java.util.ArrayList;

public class BankBalanceCheckActivity extends AppCompatActivity {
    ModelBank modelBank;
    ArrayList<ModelBank> arraydata;
    LinearLayout llCall1, llCall2, llCall3;
    ImageView imgBack;
    TextView tvbankNumber3, txtBankName,tvbankNumber,tvbankNumber2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_bankbalance);
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        llCall1 = findViewById(R.id.llCall1);
        llCall2 = findViewById(R.id.llCall2);
        llCall3 = findViewById(R.id.llCall3);
        imgBack = findViewById(R.id.imgBack);
        tvbankNumber3 = findViewById(R.id.tvbankNumber3);
        txtBankName = findViewById(R.id.txtBankName);
        tvbankNumber = findViewById(R.id.tvbankNumber);
        tvbankNumber2 = findViewById(R.id.tvbankNumber2);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        modelBank = (ModelBank) getIntent().getSerializableExtra("arraynumberdata");

        tvbankNumber.setText(modelBank.getBalance());
        tvbankNumber2.setText(modelBank.getStatement());
        tvbankNumber3.setText(modelBank.getNumber());
        txtBankName.setText(modelBank.getName());

        llCall1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.setData(Uri.parse("tel:" + modelBank.getNumber()));
                startActivity(intent);
            }
        });

        llCall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.setData(Uri.parse("tel:" + modelBank.getNumber()));
                startActivity(intent);
            }
        });

        llCall3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.setData(Uri.parse("tel:" + modelBank.getNumber()));
                startActivity(intent);
            }
        });
    }

}