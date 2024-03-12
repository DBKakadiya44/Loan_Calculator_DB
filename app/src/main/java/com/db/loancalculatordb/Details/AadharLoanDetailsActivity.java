package com.db.loancalculatordb.Details;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityAadharLoanDetailsBinding;

public class AadharLoanDetailsActivity extends AppCompatActivity {
    ActivityAadharLoanDetailsBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAadharLoanDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));


        binding.imageView7.setOnClickListener(view -> {
            onBackPressed();
        });

        int pos = getIntent().getIntExtra("cnt", 0);

        if (pos == 1) {
            binding.question.setText("What is Adharcard Loan?");

            binding.aad1.setText("Aadhaar card loans are typically unsecured, meaning they don't require collateral. This makes them an attractive option for people who don't have a lot of assets to pledge as security.");
            binding.aad2.setText("To make the process faster, you can link your Aadhaar card and PAN card to your mobile number. You might also need to submit some other secondary documents.");
            binding.aad3.setText("Interest rates for Aadhaar card loans can start from 1.33%. However, they can change based on your business profile, loan tenure, and eligibility.");
            binding.aad4.setVisibility(View.GONE);
            binding.aad5.setVisibility(View.GONE);
        }
        if (pos == 2) {
            binding.question.setText("What Purpose Can it be Used?");

            binding.aad1.setText(" Instant Personal Loan - It can be used for any personal financial need and the bank will not monitor its use .");
            binding.aad2.setText(" It can be utilized for renovating your home, marriage - related expenses, family vacation, your child's education, purchasing latest electronic gadgets or home appliances, meeting unexpected medical expenses and any other emergencies.");
            binding.aad3.setText("Personal loans are also useful when it comes to investing in business, fixing your car, down payment of a new house, etc.");
            binding.aad4.setVisibility(View.GONE);
            binding.aad5.setVisibility(View.GONE);
        }
        if (pos == 3) {
            binding.question.setText("Which Eligibility criteria are used?");

            binding.aad1.setText("Although it varies from bank to bank, the general criteria include your age, occupation, income, ability to repay the loan and place of residence. To avail of a personal loan, you must have a regular income source, whether you are a salaried individual, self-employed business person or a professional. An individual's eligibility is also affected by the company he is employed with, his credit history, etc.");
            binding.aad2.setVisibility(View.GONE);
            binding.aad3.setVisibility(View.GONE);
            binding.aad4.setVisibility(View.GONE);
            binding.aad5.setVisibility(View.GONE);

        }
        if (pos == 4) {
            binding.question.setText("How Much can one borrow?");

            binding.aad1.setText("It usually depends on your income and varies based on whether you are salaried or self - employed.");
            binding.aad2.setText("Usually, the banks restrict the loan amount such that your EMI is not more than");
            binding.aad3.setText("40-50% of your monthly income.");
            binding.aad4.setText("Any existing loans that are being serviced by the applicant are also considered when calculating the personal loan amount.");
            binding.aad5.setText("For the self employed, the loan value is determined on the basis of the profit earned as per the most recently acknowledged profit / loss statement, while taking into ас.");

        }
        if (pos == 5) {
            binding.question.setText("Loan Approval Process");

            binding.aad1.setText("The approval is at the sole discretion of the loan sanctioning officer whose decision is based on the criteria specified by the bank / financial institution");
            binding.aad2.setText("The entire process can take between 48 hours and about two weeks. Once all the necessary documents are submitted and the verification process is completed, the loan, if sanctioned, is disbursed within seven working days by the bank.");
            binding.aad3.setText("Do keep all necessary documents ready along with PDC and / or signed ECS form to avoid delays in loan processing..");
            binding.aad4.setVisibility(View.GONE);
            binding.aad5.setVisibility(View.GONE);

        }

        if (pos == 6) {
            binding.question.setText("What is CIBIL?");
            binding.textView18.setText("Faqs Credit Score");

            binding.aad1.setText("TransUnion CIBIL Limited (or CIBIL – Credit Information Bureau India Limited CIBIL) is one of the foremost credit bureaus licensed to operate by the Reserve Bank of India (RBI). CIBIL gathers and preserves records of an individual’s payments pertaining to credit cards and loans.");
            binding.aad2.setVisibility(View.GONE);
            binding.aad3.setVisibility(View.GONE);
            binding.aad4.setVisibility(View.GONE);
            binding.aad5.setVisibility(View.GONE);

        }
        if (pos == 7) {
            binding.question.setText("How does your CIBIL score/report matter?");
            binding.textView18.setText("Faqs Credit Score");

            binding.aad1.setText("CIBIL score or report plays a very important role in an individual’s financial life. So much so that lenders totally rely on the reports to assess the creditworthiness and as to how much credit they can give you. So it’s always better to be on the higher side of the credit score because there will be brighter chances of getting credit approvals or else they would not trust you with their lending. A higher score will also help in getting some of the best interest rates.");
            binding.aad2.setVisibility(View.GONE);
            binding.aad3.setVisibility(View.GONE);
            binding.aad4.setVisibility(View.GONE);
            binding.aad5.setVisibility(View.GONE);

        }
        if (pos == 8) {
            binding.question.setText("Who prepares the CIBIL score or report?");
            binding.textView18.setText("Faqs Credit Score");

            binding.aad1.setText("The report is obviously prepared by Credit Information Bureau (India) Limited. The report is prepared based on the financial behavior of a customer. Hence, the bureau receives information from financial institutions or banks about your credit behavior patterns which will then decide the scores and those will help in creating a credit report.");
            binding.aad2.setVisibility(View.GONE);
            binding.aad3.setVisibility(View.GONE);
            binding.aad4.setVisibility(View.GONE);
            binding.aad5.setVisibility(View.GONE);

        }
        if (pos == 9) {
            binding.question.setText("How do you correct errors in your CIBIL report?");
            binding.textView18.setText("Faqs Credit Score");

            binding.aad1.setText("There was a recent update from RBI stating the customers should be given proper access to their reports as in when requested. One can contact CIBIL through their website contact details and can check for any sort of mistakes in it.");
            binding.aad2.setVisibility(View.GONE);
            binding.aad3.setVisibility(View.GONE);
            binding.aad4.setVisibility(View.GONE);
            binding.aad5.setVisibility(View.GONE);

        }
        if (pos == 10) {
            binding.question.setText("What is PAN?");
            binding.textView18.setText("PAN Apply");

            binding.aad1.setText("The UIDAI asks the resident to confirm the address (from several address proofs), on which he wants to distribute his Aadhaar letter. Based on the choice of the resident, UIDAI captures the details as per supporting documents.");
            binding.aad2.setVisibility(View.GONE);
            binding.aad3.setVisibility(View.GONE);
            binding.aad4.setVisibility(View.GONE);
            binding.aad5.setVisibility(View.GONE);

        }
        if (pos == 11) {
            binding.question.setText("Who Can Apply for PAN?");
            binding.textView18.setText("PAN Apply");

            binding.aad1.setText("The Permanent Account Number (PAN) is a ten-digit alphanumeric identifier (identifier) issued by the Income Tax Department. A unique PAN is issued to each such person (ie individual, firm, company etc.).");
            binding.aad2.setVisibility(View.GONE);
            binding.aad3.setVisibility(View.GONE);
            binding.aad4.setVisibility(View.GONE);
            binding.aad5.setVisibility(View.GONE);

        }
        if (pos == 12) {
            binding.question.setText("Who can apply on behalf of minor,foolish,retarded,dead and wards of the court?");
            binding.textView18.setText("PAN Apply");

            binding.aad1.setText("All existing assessees or taxpayers or individuals, who are required to file income returns, even if filing on behalf of someone, are required to have PAN. Any person who wants to do financial or financial transactions, where it is mandatory to file PAN, they also have to have PAN.");
            binding.aad2.setVisibility(View.GONE);
            binding.aad3.setVisibility(View.GONE);
            binding.aad4.setVisibility(View.GONE);
            binding.aad5.setVisibility(View.GONE);

        }
        if (pos == 13) {
            binding.question.setText("Do i Need to apply for a new pan when I move from one city to another?");
            binding.textView18.setText("PAN Apply");

            binding.aad1.setText("Section 180 of the IT Act, 1971 provides that minor, insane, foolish, retarded, dead and wards of the court and such other persons can be represented through the Represpective Assisi (Representative Assessee). In such cases: In the application for PAN, details of minor, insane, foolish, retarded, dead and court wards etc. should be given in item 14 of the application for PAN.");
            binding.aad2.setVisibility(View.GONE);
            binding.aad3.setVisibility(View.GONE);
            binding.aad4.setVisibility(View.GONE);
            binding.aad5.setVisibility(View.GONE);

        }
        if (pos == 14) {
            binding.question.setText("Can I Get More than one Pan card?");
            binding.textView18.setText("PAN Apply");

            binding.aad1.setText("The Permanent Account Number (PAN), as the name implies, is a permanent number and does not change. However, by changing the address, such an officer can change. Therefore, such changes should be reported to the ITD so that the PAN database of the ITD can be updated. The applicant can notify the change in address by requesting for a new PAN card or/and filling up the form for change or modification in the PAN data. This form can be submitted online on any TIN-FC or NSDL e-Governance TIN website.");
            binding.aad2.setVisibility(View.GONE);
            binding.aad3.setVisibility(View.GONE);
            binding.aad4.setVisibility(View.GONE);
            binding.aad5.setVisibility(View.GONE);

        }
        if (pos == 15) {
            binding.question.setText("Is any third party used for verification of identity with genuineness of the documents by the applicants?");
            binding.textView18.setText("PAN Apply");

            binding.aad1.setText("Currently, you can submit the PAN Change Request Application Form by filling in the details of the PAN you are using, at the top of the form in the form. All other PAN/s you have inadvertently allotted should be mentioned in item no. 11 of the form and the corresponding PAN card copy/s should be submitted along with the form for cancellation.");
            binding.aad2.setVisibility(View.GONE);
            binding.aad3.setVisibility(View.GONE);
            binding.aad4.setVisibility(View.GONE);
            binding.aad5.setVisibility(View.GONE);

        }
        if (pos == 16) {
            binding.question.setText("Should an organization that files AIR, file a single AIR for the entire organization for each of its branches / regional offices?");
            binding.textView18.setText("PAN Apply");

            binding.aad1.setText("CBDT has appointed the Director General of Income Tax (System) as Return Annual Information Return - Administrator for the purpose of administering the annual income tax return scheme.");
            binding.aad2.setVisibility(View.GONE);
            binding.aad3.setVisibility(View.GONE);
            binding.aad4.setVisibility(View.GONE);
            binding.aad5.setVisibility(View.GONE);

        }
        if (pos == 17) {
            binding.question.setText("Loan");
            binding.textView18.setText("PAN Apply");

            binding.aad1.setText("");
            binding.aad2.setVisibility(View.GONE);
            binding.aad3.setVisibility(View.GONE);
            binding.aad4.setVisibility(View.GONE);
            binding.aad5.setVisibility(View.GONE);

        }

    }

}