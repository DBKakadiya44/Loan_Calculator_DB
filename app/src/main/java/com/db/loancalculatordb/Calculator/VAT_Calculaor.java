package com.db.loancalculatordb.Calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.db.loancalculatordb.R;

import java.util.ArrayList;

public class VAT_Calculaor extends AppCompatActivity {
    public TextView Net_price_TV;
    public TextView Vat_price_TV;
    public EditText amount_ET;
    private ImageView calculate;
    float netprice;
    float original;
    public TextView original_costTV;
    RadioButton other;
    RadioButton p1;
    RadioButton p12;
    RadioButton p4;
    RadioButton p5;
    public EditText rate_ET;
    public ImageView reset;
    CardView resultSection;
    public Spinner vatSpinner;
    float vatprice;
    private ArrayList<String> name = new ArrayList<>();
    float rate = 12.5f;
    int rbset = 0;
    boolean isCalculated = false;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_vat_calculaor);
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        ((ImageView) findViewById(R.id.img_back)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VAT_Calculaor.this.onBackPressed();
            }
        });
        this.amount_ET = (EditText) findViewById(R.id.amount);
        this.rate_ET = (EditText) findViewById(R.id.rate_of_vat);
        this.vatSpinner = (Spinner) findViewById(R.id.mode_vat_spinner);
        this.original_costTV = (TextView) findViewById(R.id.originalCost);
        this.Vat_price_TV = (TextView) findViewById(R.id.vatPrice);
        this.Net_price_TV = (TextView) findViewById(R.id.netPrice);
        this.resultSection = (CardView) findViewById(R.id.resultSection);
        this.reset = (ImageView) findViewById(R.id.reset);
        this.calculate = (ImageView) findViewById(R.id.calculate);
        this.p1 = (RadioButton) findViewById(R.id.percent_1);
        this.p4 = (RadioButton) findViewById(R.id.percent_4);
        this.p5 = (RadioButton) findViewById(R.id.percent_5);
        this.p12 = (RadioButton) findViewById(R.id.percent_12);
        this.other = (RadioButton) findViewById(R.id.other);
        this.name.add("Add VAT");
        this.name.add("Remove VAT");
        this.vatSpinner.setAdapter((SpinnerAdapter) new ArrayAdapter(this, (int) R.layout.list, (int) R.id.textlist, this.name));
        this.calculate.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View view) {
                Log.e("TAG", "onClick:rate:: " + VAT_Calculaor.this.rate);
                if (VAT_Calculaor.this.amount_ET.getText().toString().isEmpty()) {
                    VAT_Calculaor.this.amount_ET.setError("Please Enter Amount");
                    return;
                }
                VAT_Calculaor.this.resultSection.setVisibility(0);
                VAT_Calculaor vAT_Calculaor = VAT_Calculaor.this;
                vAT_Calculaor.original = Float.parseFloat(vAT_Calculaor.amount_ET.getText().toString());
                if (!VAT_Calculaor.this.rate_ET.getText().toString().isEmpty()) {
                    VAT_Calculaor vAT_Calculaor2 = VAT_Calculaor.this;
                    vAT_Calculaor2.rate = Float.parseFloat(vAT_Calculaor2.rate_ET.getText().toString());
                } else {
                    VAT_Calculaor.this.rate_ET.setError("Enter Rate Of VAT");
                }
                if (VAT_Calculaor.this.vatSpinner.getSelectedItem().toString().equals("Add VAT")) {
                    VAT_Calculaor vAT_Calculaor3 = VAT_Calculaor.this;
                    vAT_Calculaor3.vatprice = (vAT_Calculaor3.original * VAT_Calculaor.this.rate) / 100.0f;
                    VAT_Calculaor vAT_Calculaor4 = VAT_Calculaor.this;
                    vAT_Calculaor4.netprice = vAT_Calculaor4.original + VAT_Calculaor.this.vatprice;
                } else {
                    VAT_Calculaor vAT_Calculaor5 = VAT_Calculaor.this;
                    vAT_Calculaor5.vatprice = vAT_Calculaor5.original - (VAT_Calculaor.this.original * (100.0f / (VAT_Calculaor.this.rate + 100.0f)));
                    VAT_Calculaor vAT_Calculaor6 = VAT_Calculaor.this;
                    vAT_Calculaor6.netprice = vAT_Calculaor6.original - VAT_Calculaor.this.vatprice;
                }
                VAT_Calculaor.this.original_costTV.setText(String.format("%.2f", Float.valueOf(VAT_Calculaor.this.original)));
                VAT_Calculaor.this.Vat_price_TV.setText(String.format("%.2f", Float.valueOf(VAT_Calculaor.this.vatprice)));
                VAT_Calculaor.this.Net_price_TV.setText(String.format("%.2f", Float.valueOf(VAT_Calculaor.this.netprice)));
                VAT_Calculaor.this.isCalculated = true;
            }
        });
        this.reset.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View view) {
                VAT_Calculaor.this.amount_ET.getText().clear();
                VAT_Calculaor.this.rate_ET.getText().clear();
                VAT_Calculaor.this.resultSection.setVisibility(4);
            }
        });
    }

    @SuppressLint("WrongConstant")
    public void onRadioButtonClicked(View view) {
        boolean isChecked = ((RadioButton) view).isChecked();
        int id = view.getId();

        if(id!=R.id.other)
        {
            if(id==R.id.percent_1)
            {
                if (isChecked) {
                    this.p4.setChecked(false);
                }
                this.p5.setChecked(false);
                this.p12.setChecked(false);
                this.other.setChecked(false);
                this.rate = 1.0f;
                this.rate_ET.setVisibility(4);
            }

            if(id==R.id.percent_12)
            {
                if (isChecked) {
                    this.p4.setChecked(false);
                }
                this.p5.setChecked(false);
                this.p1.setChecked(false);
                this.other.setChecked(false);
                this.rate_ET.setVisibility(4);
                this.rate = 12.5f;
            }

            if(id==R.id.percent_4)
            {
                if (isChecked) {
                    this.p1.setChecked(false);
                }
                this.p5.setChecked(false);
                this.p12.setChecked(false);
                this.other.setChecked(false);
                this.rate = 4.0f;
                this.rate_ET.setVisibility(4);
            }

            if(id==R.id.percent_5)
            {
                if (isChecked) {
                    this.p4.setChecked(false);
                }
                this.p12.setChecked(false);
                this.other.setChecked(false);
                this.rate_ET.setVisibility(4);
                this.rate = 5.0f;
            }
        }
        if (isChecked) {
            this.p4.setChecked(false);
        }
        this.p5.setChecked(false);
        this.p12.setChecked(false);
        this.p1.setChecked(false);
        this.rate_ET.setVisibility(0);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
