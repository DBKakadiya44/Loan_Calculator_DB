package com.db.loancalculatordb.Calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityIntraCalcBinding;

public class IntraCalcActivity extends AppCompatActivity {
    ActivityIntraCalcBinding binding;

    TextView Calculate;
    TextView InvestAmount;
    float brokerage;
    float brokerage1;
    float clearing;
    EditText edtBuy;
    EditText edtQuantity;
    EditText edtSell;
    private float exchange;
    CardView fullinfo;
    private float gst;
    boolean isCalculated = false;
    public Float mBuyAmt;
    public int mCheckedId;
    public Integer mQuantity;
    public int mRadioPosition;
    public Float mSellAmt;
    public int mStatePosition;
    float netProfit;
    TextView reset;
    float sebi;
    Spinner spinBrokers;
    Spinner spinStates;
    Spinner spinTrade;
    float stampDuty;
    float stampDuty1;
    int states;
    int sttTotal;
    float totalTax;
    float turnover;
    TextView txtBreakeven;
    TextView txtBrokerage;
    TextView txtClearing;
    TextView txtExchange;
    TextView txtGst;
    TextView txtNetProfit;
    TextView txtSebi;
    TextView txtStamp;
    TextView txtStt;
    TextView txtTotalTax;
    TextView txtTurnover;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntraCalcBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        ((ImageView) findViewById(R.id.img_back)).setOnClickListener(new View.OnClickListener() { // from class: com.loancalculator.emicalculator.gstcalculator.StockCalculator.Intraday.1
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        edtBuy = (EditText) findViewById(R.id.edt_buy);
        edtSell = (EditText) findViewById(R.id.edt_sell);
        edtQuantity = (EditText) findViewById(R.id.edt_quantity);
        spinStates = (Spinner) findViewById(R.id.spinner_states);
        txtTurnover = (TextView) findViewById(R.id.txt_turnover1);
        txtBrokerage = (TextView) findViewById(R.id.txt_brokerage1);
        txtStamp = (TextView) findViewById(R.id.txt_stamp1);
        txtStt = (TextView) findViewById(R.id.txt_stt1);
        txtExchange = (TextView) findViewById(R.id.txt_exchange1);
        txtGst = (TextView) findViewById(R.id.txt_gst1);
        txtSebi = (TextView) findViewById(R.id.txt_sebi1);
        txtTotalTax = (TextView) findViewById(R.id.txt_total_tax1);
        InvestAmount = (TextView) findViewById(R.id.InvestAmount);
        txtNetProfit = (TextView) findViewById(R.id.txt_net_profit);
        Calculate = (TextView) findViewById(R.id.btn_calculate);
        reset = (TextView) findViewById(R.id.btn_reset);
        fullinfo = (CardView) findViewById(R.id.fullinfo);
        Calculate.setOnClickListener(new View.OnClickListener() { // from class: com.loancalculator.emicalculator.gstcalculator.StockCalculator.Intraday.2
            @Override
            public void onClick(View view) {
                setResult();
            }
        });
        this.reset.setOnClickListener(new View.OnClickListener() { // from class: com.loancalculator.emicalculator.gstcalculator.StockCalculator.Intraday.3
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View view) {
                edtBuy.setText("");
                edtSell.setText("");
                edtQuantity.setText("");
                fullinfo.setVisibility(4);
            }
        });
        @SuppressLint("ResourceType") ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(this, R.array.States, 17367048);
        createFromResource.setDropDownViewResource(17367049);
        this.spinStates.setAdapter((SpinnerAdapter) createFromResource);
        this.spinStates.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.loancalculator.emicalculator.gstcalculator.StockCalculator.Intraday.4
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                mStatePosition = i;
            }
        });

        this.edtBuy.addTextChangedListener(new TextWatcher() { // from class: com.loancalculator.emicalculator.gstcalculator.StockCalculator.Intraday.6
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (editable.length() > 0) {
                    try {
                        mBuyAmt = Float.valueOf(Float.parseFloat(editable.toString()));
                        return;
                    } catch (Exception unused) {
                        mBuyAmt = null;
                        return;
                    }
                }
                mBuyAmt = null;
            }
        });
        this.edtSell.addTextChangedListener(new TextWatcher() { // from class: com.loancalculator.emicalculator.gstcalculator.StockCalculator.Intraday.7
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (editable.length() > 0) {
                    try {
                        mSellAmt = Float.valueOf(Float.parseFloat(editable.toString()));
                        return;
                    } catch (Exception unused) {
                        mSellAmt = null;
                        return;
                    }
                }
                mSellAmt = null;
            }
        });
        this.edtQuantity.addTextChangedListener(new TextWatcher() { // from class: com.loancalculator.emicalculator.gstcalculator.StockCalculator.Intraday.8
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (editable.length() > 0) {
                    try {
                        mQuantity = Integer.valueOf(Integer.parseInt(editable.toString()));
                        return;
                    } catch (Exception unused) {
                        mQuantity = null;
                        return;
                    }
                }
                mQuantity = null;
            }
        });
    }

    @SuppressLint("WrongConstant")
    public void setResult() {
        float parseFloat = 0;
        if (this.edtBuy.getText().toString().isEmpty()) {
            this.edtBuy.setError("Enter Buy Price");
        } else if (this.edtSell.getText().toString().isEmpty()) {
            this.edtSell.setError("Enter sell Price");
        } else if (this.edtQuantity.getText().toString().isEmpty()) {
            this.edtQuantity.setError("Enter Quantity");
        } else {
            boolean isNullFloat = isNullFloat(this.mBuyAmt, this.mSellAmt);
            if (this.mQuantity == null) {
                isNullFloat = true;
            }
            if (isNullFloat) {
                resetResult(this.txtTurnover, this.txtBrokerage, this.txtStt, this.txtExchange, this.txtClearing, this.txtGst, this.txtSebi, this.txtStamp, this.txtTotalTax);
                resetNetProfit(this.txtNetProfit);
                return;
            }
            float floatValue = (this.mBuyAmt.floatValue() * this.mQuantity.intValue()) + (this.mSellAmt.floatValue() * this.mQuantity.intValue());
            this.turnover = floatValue;
            float f = (float) (floatValue * 1.0E-4d);
            this.brokerage = f;
            if (f < 40.0f) {
                this.brokerage1 = f;
            } else {
                this.brokerage1 = 40.0f;
            }
            this.sttTotal = (int) (this.mSellAmt.floatValue() * this.mQuantity.intValue() * 2.5E-4d);

                this.exchange = (float) (this.turnover * 3.0E-5d);

            this.clearing = 0.0f;
            this.gst = (this.brokerage1 + this.exchange) * 0.18f;
            float f2 = this.turnover;
            this.sebi = (f2 / 1.0E7f) * 10.0f;
            switch (this.mStatePosition) {
                case 0:
                    float f3 = (float) (f2 * 5.0E-5d);
                    this.stampDuty = f3;
                    if (f3 >= 50.0f) {
                        this.stampDuty1 = 50.0f;
                        break;
                    } else {
                        this.stampDuty1 = f3;
                        break;
                    }
                case 1:
                    if (this.mRadioPosition != 1) {
                        this.stampDuty1 = (float) (f2 * 2.0E-5d);
                        break;
                    } else {
                        this.stampDuty1 = (float) (f2 * 1.0E-4d);
                        break;
                    }
                case 2:
                    if (this.mRadioPosition != 1) {
                        this.stampDuty1 = (float) (f2 * 2.0E-5d);
                        Log.e("TAG", "setResult:1.0E-4d:: " + this.stampDuty1);
                        break;
                    } else {
                        this.stampDuty1 = (float) (f2 * 1.0E-4d);
                        Log.e("TAG", "setResult:1.0E-4d:: " + this.stampDuty1);
                        break;
                    }
                case 3:
                    this.stampDuty1 = (float) (f2 * 3.0E-5d);
                    break;
                case 4:
                    if (this.mRadioPosition != 1) {
                        this.stampDuty1 = (float) (f2 * 2.0E-5d);
                        break;
                    } else {
                        this.stampDuty1 = (float) (f2 * 1.0E-4d);
                        break;
                    }
                case 5:
                    if (this.mRadioPosition != 1) {
                        this.stampDuty1 = (float) (f2 * 2.0E-5d);
                        break;
                    } else {
                        this.stampDuty1 = (float) (f2 * 1.0E-4d);
                        break;
                    }
                case 6:
                    int i = this.mRadioPosition;
                    if (i == 0) {
                        this.stampDuty1 = (float) (f2 * 3.0E-5d);
                        break;
                    } else if (i == 1) {
                        this.stampDuty1 = (float) (f2 * 1.2E-4d);
                        break;
                    } else if (i != 2) {
                        this.stampDuty1 = (float) (f2 * 2.3999999999999997E-5d);
                        break;
                    } else {
                        this.stampDuty1 = (float) (f2 * 1.1999999999999999E-5d);
                        break;
                    }
                case 7:
                    this.stampDuty1 = (float) (f2 * 6.0E-5d);
                    break;
                case 8:
                    float f4 = (float) (f2 * 2.0E-5d);
                    this.stampDuty = f4;
                    if (f4 >= 1000.0f) {
                        this.stampDuty1 = 1000.0f;
                        break;
                    } else {
                        this.stampDuty1 = f4;
                        break;
                    }
                case 9:
                    if (this.mRadioPosition != 1) {
                        this.stampDuty1 = (float) (f2 * 2.0E-5d);
                        break;
                    } else {
                        this.stampDuty1 = (float) (f2 * 1.0E-4d);
                        break;
                    }
                default:
                    this.stampDuty1 = 0.0f;
                    break;
            }
            this.txtTurnover.setText(String.format("%.2f", Float.valueOf(this.turnover)) + " ₹");
            this.txtBrokerage.setText(String.format("%.2f", Float.valueOf(this.brokerage1)) + " ₹");
            this.txtStt.setText(this.sttTotal + " ₹");
            this.txtExchange.setText(String.format("%.2f", Float.valueOf(this.exchange)) + " ₹");
            this.txtGst.setText(String.format("%.2f", Float.valueOf(this.gst)) + " ₹");
            this.txtSebi.setText(String.format("%.2f", Float.valueOf(this.sebi)) + " ₹");
            this.txtStamp.setText(String.format("%.2f", Float.valueOf(this.stampDuty1)) + " ₹");
            float parseFloat2 = Float.parseFloat(String.format("%.2f", Float.valueOf(this.brokerage1)));
            float parseFloat3 = Float.parseFloat(String.valueOf(this.sttTotal));
            float parseFloat4 = Float.parseFloat(String.format("%.2f", Float.valueOf(this.exchange)));
            this.totalTax = parseFloat2 + parseFloat3 + parseFloat4 + Float.parseFloat(String.format("%.2f", Float.valueOf(this.clearing))) + Float.parseFloat(String.format("%.2f", Float.valueOf(this.gst))) + Float.parseFloat(String.format("%.2f", Float.valueOf(this.sebi))) + Float.parseFloat(String.format("%.2f", Float.valueOf(this.stampDuty1)));
            this.txtTotalTax.setText(String.format("%.2f", Float.valueOf(parseFloat)) + " ₹");
            this.mQuantity.intValue();
            this.netProfit = (Math.round(this.mSellAmt.floatValue() * this.mQuantity.intValue()) - Math.round(this.mBuyAmt.floatValue() * this.mQuantity.intValue())) - this.totalTax;
            this.txtNetProfit.setText("Net Profit :   " + String.format("%.2f", Float.valueOf(this.netProfit)) + " ₹");
            this.InvestAmount.setText(((Integer.parseInt(this.edtBuy.getText().toString()) * Integer.parseInt(this.edtQuantity.getText().toString())) + parseFloat) + " ₹");
            this.fullinfo.setVisibility(0);
            this.isCalculated = true;
        }
    }

    private void resetResult(TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (textView != null) {
                textView.setText("0");
            }
        }
    }

    private void resetNetProfit(TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (textView != null) {
                textView.setText("Net Profit:   0");
            }
        }
    }

    private boolean isNullFloat(Float... fArr) {
        for (Float f : fArr) {
            if (f == null) {
                return true;
            }
        }
        return false;
    }

}