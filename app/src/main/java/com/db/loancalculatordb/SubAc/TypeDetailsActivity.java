package com.db.loancalculatordb.SubAc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityTypeDetailsBinding;

public class TypeDetailsActivity extends AppCompatActivity {
    ActivityTypeDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTypeDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        binding.back.setOnClickListener(v -> {
            onBackPressed();
        });

        int pos = getIntent().getIntExtra("cnt", 1);

        if (pos == 1) {
            binding.txt.setText("When you take a car loan, you can repay it in equated monthly instalments (EMIS) till the end of the repayment tenure. However, if you decide to pay off the outstanding loan amount before your tenure ends, you will be foreclosing or prepaying your loan. When you take a new loan to pay off the outstanding balance on your existing car loan, it is known as car refinancing.\n" + "\nYou can choose to refinance your car loan if you wish to replace your current loan with better features such as low interest rates, extended repayment tenures, etc., or simply to change the terms of your current loan. The most common reason why people refinance their car loans is to save money. When refinancing a car loan, you can avail a new loan that offers lower interest rates which, in turn, will save you money.\n" + "\nYou can also lower the equated monthly instalments (EMIS) by choosing a longer repayment tenure with a new lender through car refinancing. As stated above, some lenders may charge you a penalty on loan foreclosure. Hence, before you decide to foreclose a loan, it is a good idea to go through the clauses associated with it carefully.");
            binding.title.setText("Car Loan");
        }
        if (pos == 2) {
            binding.txt.setText("The business loan meaning is a loan product offered to business owners who have a running company but require external funds for operations. The investment cover expenses such as employee salaries, rent, buying equipment, or expanding the business in other cities.\n" + "\n" + "Lenders analyze the business owner's creditworthiness through factors such as credit score and business turnover. However, entrepreneurs or business owners are legally bound to use the loan amount only to cover business expenses and not use the loan amount to cover personal expenditures.\n" + "\n" + "Repayment is also a factor in the business loan definition, as the lenders charge interest on the principal amount the borrower must repay in full within the loan tenure.");
            binding.title.setText("Business Loan");
        }
        if (pos == 3) {
            binding.txt.setText("Personal Loan does not require any collateral or security and can be obtained with minimal documentation. Just like most loans, however, it must be repaid in monthly instalments.\n" + "\n" + "You can use it to fund any expense including education, a wedding, a trip, home renovation, medical expenses, and even to buy a gadget. You can even use the money to help out with the day-to-day expenses in case of a cash flow crunch.\n" + "\n" + "Bank offers a Personal Loan to pre-approved customers in just 10 seconds. For others, it usually takes about 4 days. As an already existing customer, you can apply via NetBanking on the Bank website, through an ATM or Loan Assist App. Otherwise, you can drop by the nearest branch to get the process started.\n" + "\n" + "You can get a re-payment tenure that suits your needs. And then you have to make the payments in equated monthly instalments or EMI. This instalment amount is calculated using the loan amount, the payment tenure, and the interest rate.");
            binding.title.setText("Personal Loan");
        }

    }
}