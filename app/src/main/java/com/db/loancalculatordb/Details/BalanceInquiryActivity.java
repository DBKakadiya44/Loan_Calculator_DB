package com.db.loancalculatordb.Details;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.db.loancalculatordb.R;

import java.util.ArrayList;

public class BalanceInquiryActivity extends AppCompatActivity {
    ImageView imgBack;
    private ArrayList<ModelBank> list = new ArrayList<>();
    RecyclerView recyclerView;
    EditText etSearch;
    AdapterBank adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance_inquiry);
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        imgBack = findViewById(R.id.imgBack);
        etSearch = findViewById(R.id.etSearch);
        initViews();

        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filter(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
        list.add(new ModelBank( "Allahabad Bank", "+91 9224150150","09223150150","9223150150"));
        list.add(new ModelBank( "Andhra Bank", "+91 9223011300","09223008586","9223008486"));
        list.add(new ModelBank( "Axis Bank", "18004195959","18004195959","18004196969"));
        list.add(new ModelBank( "Bank of India", "+91 9015135135","09266135135","09015135135"));
        list.add(new ModelBank( "Canara Bank", "+91 9015483483","8886610360","09015734734"));
        list.add(new ModelBank( "Central Bank of India", "+91 9555244442","9555244442","9555144441"));
        list.add(new ModelBank( "Federal Bank", "+91 8431900900","8431900900","8431600600"));
        list.add(new ModelBank( "HDFC Bank", "18002703333","18002703333","18002703355."));
        list.add(new ModelBank( "ICICI Bank", "+91 9594612612","9215676766","9594613613"));
        list.add(new ModelBank( "IDBI Bank", "18008431122","18002094324","18008431133"));
        list.add(new ModelBank( "Indian Bank", "+91 9289592895","180042500000","8108781085"));
        list.add(new ModelBank( "Indusind Bank", "18002741000","9212299955","9212299955"));
        list.add(new ModelBank( "Kotak Mahindra Bank", "18002740110","18002740110","9718566655"));
        list.add(new ModelBank( "Punjab National Bank", "18001802223","18001802223","18001802222"));
        list.add(new ModelBank( "RBL Bank", "18004190610","18004190610","2261156300"));
        list.add(new ModelBank( "Saraswat Co-operative Bank", "+91 9223040000","9223810000","9223501111"));
        list.add(new ModelBank( "UCO Bank", "+91 9278792787","18002740123","18002740123"));
        list.add(new ModelBank( "Union Bank of India", "+91 9223008586","09223008486","09223008486"));
        list.add(new ModelBank( "Yes Bank", "+91 9223920000","09223920000","09223921111"));
        adapter = new AdapterBank(BalanceInquiryActivity.this, list);
        recyclerView.setLayoutManager(new LinearLayoutManager(BalanceInquiryActivity.this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
    }

    private void filter(String text) {
        ArrayList<ModelBank> filteredList = new ArrayList<>();
        for (ModelBank item : list) {
            if (item.getName().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }
        adapter.filterList(filteredList);
    }

}