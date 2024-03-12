package com.db.loancalculatordb.Calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityFdCalcBinding;

import java.text.DecimalFormat;

public class FdCalcActivity extends AppCompatActivity {
    ActivityFdCalcBinding binding;

    int TotalpersentageInterest;
    TextView btn_calculate;
    TextView btn_reset;
    double doubleValue;
    EditText et_interest;
    EditText et_principal;
    EditText et_tenure;
    CardView fulldetails;
    TextView principalAmount;
    int principalTotalPR;
    TextView tv_interest_amt;
    TextView tv_total_pay_amt;
    private DecimalFormat decimalFormat = new DecimalFormat("0.00");
    int monthOrYear = 2;
    public float aa = 0.0f;
    public float bb = 0.0f;
    boolean isCalculated = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityFdCalcBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        ((ImageView) findViewById(R.id.img_back)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        et_interest = (EditText) findViewById(R.id.et_interest);
        et_principal = (EditText) findViewById(R.id.et_principal);
        et_tenure = (EditText) findViewById(R.id.et_tenure);
        tv_interest_amt = (TextView) findViewById(R.id.tv_interest_amt);
        tv_total_pay_amt = (TextView) findViewById(R.id.tv_total_pay_amt);
        principalAmount = (TextView) findViewById(R.id.tv_principal_amt);
        btn_calculate = (TextView) findViewById(R.id.btn_calculate);
        btn_reset = (TextView) findViewById(R.id.btn_reset);
        fulldetails = (CardView) findViewById(R.id.fullinfo);

        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getEMI();
            }
        });
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearFields();
            }
        });

    }


    @SuppressLint("WrongConstant")
    public void getEMI() {
        double d;
        if (Global.isZeroDouble(et_principal.getText().toString())) {
            et_principal.setError("Enter Loan Amount");
        } else if (TextUtils.isEmpty(et_interest.getText().toString())) {
            et_interest.setError("Enter Interest");
        } else if (TextUtils.isEmpty(et_tenure.getText().toString())) {
            et_tenure.setError("Enter Years Or Months");
        } else {
            doubleValue = Global.stringToDouble(et_principal.getText().toString()).doubleValue();
            double parseDouble = Double.parseDouble(et_interest.getText().toString());
            int month = getMonth();
            if (parseDouble == 0.0d) {
                d = doubleValue / month;
            } else {
                double d2 = (parseDouble / 12.0d) / 100.0d;
                double pow = Math.pow(d2 + 1.0d, month);
                d = ((d2 * doubleValue) * pow) / (pow - 1.0d);
            }
            displayResult(d, doubleValue, month);
            isCalculated = true;
            fulldetails.setVisibility(0);
            LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent("Scrollview"));
        }
    }

    private int getMonth() {
        if (TextUtils.isEmpty(et_tenure.getText().toString())) {
            return 0;
        }
        return monthOrYear == 2 ? Integer.parseInt(et_tenure.getText().toString()) * 12 : Integer.parseInt(et_tenure.getText().toString());
    }

    private void displayResult(double d, double d2, int i) {
        double d3 = (i * d) - d2;
        principalAmount.setText(doubleValue + "");
        tv_interest_amt.setText(decimalFormat.format(d3));
        double d4 = d2 + d3;
        tv_total_pay_amt.setText(decimalFormat.format(d4));
        TotalpersentageInterest = (int) (((d3 / d4) * 100.0d) + 1.0d);
        Log.e("TAG", "displayResult  TotalpersentageInterest : " + TotalpersentageInterest);
        principalTotalPR = (int) ((doubleValue / d4) * 100.0d);
        Log.e("TAG", "displayResult  principalTotalPR : " + principalTotalPR);
        aa = (float) d2;
        bb = (float) d3;

    }

    @SuppressLint("WrongConstant")
    public void clearFields() {
        try {
            et_principal.setText("");
            et_interest.setText("");
            et_tenure.setText("");
            monthOrYear = 2;
            tv_interest_amt.setText("0");
            tv_total_pay_amt.setText("0");
            fulldetails.setVisibility(4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}