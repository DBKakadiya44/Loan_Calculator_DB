package com.db.loancalculatordb.Calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.ViewCompat;
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
import com.db.loancalculatordb.databinding.ActivityLoanCalcBinding;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class LoanCalcActivity extends AppCompatActivity {
    ActivityLoanCalcBinding binding;

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
    TextView tv_emi;
    TextView tv_interest_amt;
    TextView tv_months;
    TextView tv_total_pay_amt;
    TextView tv_years;
    private DecimalFormat decimalFormat = new DecimalFormat("0.00");
    int monthOrYear = 2;
    public float aa = 0.0f;
    public float bb = 0.0f;
    boolean isCalculated = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityLoanCalcBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        ((ImageView) findViewById(R.id.img_back)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        this.et_interest = (EditText) findViewById(R.id.et_interest);
        this.et_principal = (EditText) findViewById(R.id.et_principal);
        this.et_tenure = (EditText) findViewById(R.id.et_tenure);
        this.tv_emi = (TextView) findViewById(R.id.Monthly_EMI);
        this.tv_interest_amt = (TextView) findViewById(R.id.tv_interest_amt);
        this.tv_months = (TextView) findViewById(R.id.tv_months);
        this.tv_total_pay_amt = (TextView) findViewById(R.id.tv_total_pay_amt);
        this.tv_years = (TextView) findViewById(R.id.tv_years);
        this.principalAmount = (TextView) findViewById(R.id.tv_principal_amt);
        this.btn_calculate = (TextView) findViewById(R.id.btn_calculate);
        this.btn_reset = (TextView) findViewById(R.id.btn_reset);
        this.fulldetails = (CardView) findViewById(R.id.fullinfo);

        this.btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getEMI();
            }
        });
        this.btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearFields();
            }
        });
        this.tv_months.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    setColorsOfSelectedTextView(tv_months, tv_years);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                monthOrYear = 1;
            }
        });
        this.tv_years.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    setColorsOfSelectedTextView(tv_years,tv_months);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                monthOrYear = 2;
            }
        });

    }


    @SuppressLint("WrongConstant")
    public void getEMI() {
        double d;
        if (Global.isZeroDouble(this.et_principal.getText().toString())) {
            this.et_principal.setError("Enter Loan Amount");
        } else if (TextUtils.isEmpty(this.et_interest.getText().toString())) {
            this.et_interest.setError("Enter Interest");
        } else if (TextUtils.isEmpty(this.et_tenure.getText().toString())) {
            this.et_tenure.setError("Enter Years Or Months");
        } else {
            this.doubleValue = Global.stringToDouble(this.et_principal.getText().toString()).doubleValue();
            double parseDouble = Double.parseDouble(this.et_interest.getText().toString());
            int month = getMonth();
            if (parseDouble == 0.0d) {
                d = this.doubleValue / month;
            } else {
                double d2 = (parseDouble / 12.0d) / 100.0d;
                double pow = Math.pow(d2 + 1.0d, month);
                d = ((d2 * this.doubleValue) * pow) / (pow - 1.0d);
            }
            displayResult(d, this.doubleValue, month);
            this.isCalculated = true;
            this.fulldetails.setVisibility(0);
            LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent("Scrollview"));
        }
    }

    private int getMonth() {
        if (TextUtils.isEmpty(this.et_tenure.getText().toString())) {
            return 0;
        }
        return this.monthOrYear == 2 ? Integer.parseInt(this.et_tenure.getText().toString()) * 12 : Integer.parseInt(this.et_tenure.getText().toString());
    }

    private void displayResult(double d, double d2, int i) {
        double d3 = (i * d) - d2;
        this.principalAmount.setText(this.doubleValue + "");
        this.tv_emi.setText(this.decimalFormat.format(d));
        this.tv_interest_amt.setText(this.decimalFormat.format(d3));
        double d4 = d2 + d3;
        this.tv_total_pay_amt.setText(this.decimalFormat.format(d4));
        this.TotalpersentageInterest = (int) (((d3 / d4) * 100.0d) + 1.0d);
        Log.e("TAG", "displayResult  TotalpersentageInterest : " + this.TotalpersentageInterest);
        this.principalTotalPR = (int) ((this.doubleValue / d4) * 100.0d);
        Log.e("TAG", "displayResult  principalTotalPR : " + this.principalTotalPR);
        this.aa = (float) d2;
        this.bb = (float) d3;
    }

    @SuppressLint("WrongConstant")
    public void clearFields() {
        try {
            this.et_principal.setText("");
            this.et_interest.setText("");
            this.et_tenure.setText("");
            this.monthOrYear = 2;
            setColorsOfSelectedTextView(this.tv_years, this.tv_months);
            this.tv_emi.setText("0");
            this.tv_interest_amt.setText("0");
            this.tv_total_pay_amt.setText("0");
            this.fulldetails.setVisibility(4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setColorsOfSelectedTextView(TextView textView, TextView textView2) throws Exception {
        textView2.setBackgroundColor(getResources().getColor(R.color.white));
        textView2.setTextColor(getResources().getColor(R.color.black));
        textView.setBackground(getResources().getDrawable(R.color.white));
        textView.setTextColor(getResources().getColor(R.color.maincolor));
    }

}