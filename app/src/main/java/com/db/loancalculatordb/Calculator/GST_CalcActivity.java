package com.db.loancalculatordb.Calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.db.loancalculatordb.EMIFormula.Conversions;
import com.db.loancalculatordb.EMIFormula.GST_Formulas;
import com.db.loancalculatordb.R;

public class GST_CalcActivity extends AppCompatActivity {
    Button addGst;
    EditText et_initial_amount;
    EditText et_rate_gst;
    private GST_Formulas gst_formulas;
    boolean isCalculated = false;
    private LinearLayout nativeads;
    Button subGst;
    TextView tv_cgst;
    TextView tv_gst_amount;
    TextView tv_net_amount;
    TextView tv_sgst;
    TextView tv_total_amount;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_gst_calc);
        getWindow().setStatusBarColor(getColor(R.color.maincolor));


        this.gst_formulas = new GST_Formulas();
        ((ImageView) findViewById(R.id.img_back)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GST_CalcActivity.this.onBackPressed();
            }
        });
        this.addGst = (Button) findViewById(R.id.btn_add_gst);
        this.subGst = (Button) findViewById(R.id.btn_sub_gst);
        this.et_initial_amount = (EditText) findViewById(R.id.et_initial_amount);
        this.et_rate_gst = (EditText) findViewById(R.id.et_rate_gst);
        this.tv_net_amount = (TextView) findViewById(R.id.tv_net_amount);
        this.tv_gst_amount = (TextView) findViewById(R.id.tv_gst_amount);
        this.tv_total_amount = (TextView) findViewById(R.id.tv_total_amount);
        this.tv_cgst = (TextView) findViewById(R.id.tv_cgst);
        this.tv_sgst = (TextView) findViewById(R.id.tv_sgst);
        this.addGst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (GST_CalcActivity.this.validateFields()) {
                    double parseDouble = Double.parseDouble(GST_CalcActivity.this.et_rate_gst.getText().toString()) / 2.0d;
                    GST_CalcActivity.this.tv_net_amount.setText(GST_CalcActivity.this.et_initial_amount.getText());
                    Double addGSTAmount = GST_CalcActivity.this.gst_formulas.getAddGSTAmount(GST_CalcActivity.this.et_initial_amount.getText().toString(), GST_CalcActivity.this.et_rate_gst.getText().toString());
                    GST_CalcActivity.this.tv_gst_amount.setText("" + Conversions.round(addGSTAmount.doubleValue(), 2));
                    GST_CalcActivity.this.tv_cgst.setText("" + parseDouble + " % = " + Conversions.round(addGSTAmount.doubleValue() / 2.0d, 2));
                    GST_CalcActivity.this.tv_sgst.setText("" + parseDouble + " % = " + Conversions.round(addGSTAmount.doubleValue() / 2.0d, 2));
                    TextView textView = GST_CalcActivity.this.tv_total_amount;
                    textView.setText("" + GST_CalcActivity.this.gst_formulas.getGST_Add_Total(GST_CalcActivity.this.et_initial_amount.getText().toString(), GST_CalcActivity.this.et_rate_gst.getText().toString()));
                    GST_CalcActivity.this.isCalculated = true;
                }
            }
        });
        this.subGst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (GST_CalcActivity.this.validateFields()) {
                    double parseDouble = Double.parseDouble(GST_CalcActivity.this.et_rate_gst.getText().toString()) / 2.0d;
                    GST_CalcActivity.this.tv_net_amount.setText("" + Conversions.round(GST_CalcActivity.this.gst_formulas.getGST_Actual_Amount(GST_CalcActivity.this.et_initial_amount.getText().toString(), GST_CalcActivity.this.et_rate_gst.getText().toString()).doubleValue(), 2));
                    Double subtractGSTAmount = GST_CalcActivity.this.gst_formulas.getSubtractGSTAmount(GST_CalcActivity.this.et_initial_amount.getText().toString(), GST_CalcActivity.this.et_rate_gst.getText().toString());
                    GST_CalcActivity.this.tv_gst_amount.setText("" + Conversions.round(subtractGSTAmount.doubleValue(), 2));
                    GST_CalcActivity.this.tv_cgst.setText("" + parseDouble + " % = " + Conversions.round(subtractGSTAmount.doubleValue() / 2.0d, 2));
                    GST_CalcActivity.this.tv_sgst.setText("" + parseDouble + " % = " + Conversions.round(subtractGSTAmount.doubleValue() / 2.0d, 2));
                    GST_CalcActivity.this.tv_total_amount.setText(GST_CalcActivity.this.et_initial_amount.getText());
                    GST_CalcActivity.this.isCalculated = true;
                }
            }
        });
    }

    public boolean validateFields() {
        if (this.et_initial_amount.getText().length() == 0) {
            this.et_initial_amount.setError("Enter Amount");
            return false;
        } else if (this.et_rate_gst.getText().length() != 0) {
            return true;
        } else {
            this.et_rate_gst.setError("Enter Rate");
            return false;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
