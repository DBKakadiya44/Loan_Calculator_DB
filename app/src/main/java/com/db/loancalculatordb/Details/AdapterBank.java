package com.db.loancalculatordb.Details;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.db.loancalculatordb.R;

import java.util.ArrayList;

public class AdapterBank extends RecyclerView.Adapter<AdapterBank.ViewHolder> {
    Context context;
    ArrayList<ModelBank> arraydata;
    ArrayList<ModelBank> arraydataFull;

    public AdapterBank(Context context, ArrayList<ModelBank> arraydata) {
        this.context = context;
        this.arraydata = arraydata;
        this.arraydataFull = new ArrayList<>(arraydata);
    }

    public void filterList(ArrayList<ModelBank> filteredList) {
        arraydata = filteredList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bank, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        ModelBank model = arraydata.get(position);
        holder.tvName.setText(model.getName());
        holder.tvNumber.setText(model.getNumber());
        holder.tvBalance.setText(model.getBalance());
        holder.tvStatement.setText(model.getStatement());
        holder.ivLogo_holiday.setText(arraydata.get(position).getName().substring(0, 1));

        holder.llMain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(context, BankBalanceCheckActivity.class);
                intent.putExtra("arraynumberdata", arraydata.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arraydata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvNumber, ivLogo_holiday, tvBalance, tvStatement;
        RelativeLayout llMain;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivLogo_holiday = itemView.findViewById(R.id.ivLogo_holiday);
            tvName = itemView.findViewById(R.id.tvName);
            tvNumber = itemView.findViewById(R.id.tvNumber);
            llMain = itemView.findViewById(R.id.llMain);
            tvBalance = itemView.findViewById(R.id.tvBalance);
            tvStatement = itemView.findViewById(R.id.tvStatement);
        }
    }

}
