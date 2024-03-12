package com.db.loancalculatordb.Details;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.db.loancalculatordb.R;
import com.db.loancalculatordb.databinding.ActivityDetailPageBinding;

public class DetailPageActivity extends AppCompatActivity {
    ActivityDetailPageBinding binding;
    int pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getColor(R.color.maincolor));

        pos = getIntent().getIntExtra("cnt", 0);

        binding.imageView7.setOnClickListener(view -> {
            onBackPressed();
        });

        if (pos == 9) {
            binding.textView18.setText("Home");

            binding.tv1.setText("✤ Unlimited Access: You can check your CIBIL Score &amp; Report every 24 hours within your subscription period (1 month, 6 months, 12 months) 1010 Here is what members get: Unlimited Access Loan Offers Credit, Monitoring, Dispute Resolution and more.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if (pos == 10) {
            binding.textView18.setText("Buy");

            binding.tv1.setText("✤ Introducing Score Simulator with your CIBIL Score subscription. Monitoring &amp; maintaining your credit health now becomes easier. 1010 Subscription Plan :- 10 Premium ₹1200(1 Year) 10 Standard ₹800(6 Month) 10 Basic ₹550(1 Month)");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if (pos == 11) {
            binding.textView18.setText("Company");

            binding.tv1.setText("✤ Introducing CIBIL RANK with your Company Credit Report at no additional cost. 1010 The CIBIL RANK and Company Credit Report is an indication of your loan eligibility.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if (pos == 12) {
            binding.textView18.setText("Credit score");

            binding.tv1.setText("✤ Calculate or Estimate your CIBIL Score for Free. 10 Great! Now that you are here, you would be keen to check your online Cibil score free of cost. 1010 We have been helping friends like you get a free Cibil score with an accuracy of up to 93%.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if (pos == 13) {
            binding.textView18.setText("Media");

            binding.tv1.setText("✤ India Ratings and Research (Ind-Ra) is India&amp;s most respected credit rating agency committed to providing India&amp;s credit markets accurate, timely and prospective credit opinions");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if (pos == 14) {
            binding.textView18.setText("Dispute");

            binding.tv1.setText("✤ Looking for loans for your CIBIL Score? 10 Our Eligibility 10 • Cibil Score above 550 10 • Loans ranging from ₹120,000 to ₹150,000 10 • Tenure between 3 months to 12 months 10 • Interest Rate between 1.5% to 2.5% per month (flat)");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if (pos == 15) {
            binding.textView18.setText("credit mantri");

            binding.tv1.setText("✤ Check your FREE Credit Score and report Instantly. 10 How It Works 10 • Get a Credit Score for Free from CreditMantri. 10 • Flag off problem areas where you need expertise/help. 10 • Improve your Credit Score and Build Your Credit profile. 10 • Reduce EMI and borrowing costs and more.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }

        if (pos == 16) {
            binding.textView18.setText("Health insurance");

            binding.tv1.setText("✤ Health insurance refers to a type of general insurance, which provides financial assistance to policyholders when they are admitted to hospitals for treatment. Additionally, some plans also cover the cost of treatment undertaken at home, prior to a hospitalization or after discharge from the same. \n\n✤ With the rising medical inflation in India, buying health insurance has become a necessity. However, before proceeding with your purchase, consider the various types of health insurance plans available in India. \n\n✤ Types of Health Insurance policies \n\n✤ There are eight main types of health insurance policies available in India. They are: \n\n✤ Individual Health Insurance - These are healthcare plans that offer medical cover to just one policyholder.\n\n✤ Family Floater Insurance - These policies allow you to avail health insurance for your entire family without needing to buy separate plans for each member. Generally, husband, wife and two of their children are allowed health cover under one such family floater policy.\n\n✤ Critical Illness Cover - These are specialized health plans that provide extensive financial assistance when the policyholder is diagnosed with specific, chronic illnesses. These plans provide a lump-sum payout after such a diagnosis, unlike typical health insurance policies. \n\n✤ Senior Citizen Health Insurance - As the name suggests, these policies specifically cater to individuals aged 60 years and beyond.\n\n✤ Group Health Insurance - Such policies are generally offered to employees of an organization or company. They are designed in such a way that older beneficiaries can be removed, and fresh beneficiaries can be added, as per the company’s employee retention capability.\n\n✤ Maternity Health Insurance - These policies cover medical expenses during prenatal, post-natal and delivery stages. It covers both the mother as well as her newborn. \n\n✤ Personal Accident Insurance - These medical insurance policies only cover financial liability from injuries, disability or death arising due to accidents.\n\n✤ Preventive Healthcare Plan - Such policies cover the cost of treatment concerned with preventing a severe disease or condition. \n\n✤ Benefits of Health Insurance \n✤ After assessing the various kinds of health insurance available, you must be wondering why availing such a plan is essential for you and your loved ones. Look at the reasons listed below to understand why. \n\n✤ Medical Cover - The primary benefit of such insurance is that it offers financial coverage against medical expenditure. \n\n✤ Cashless Claim - If you seek treatment at one of the hospitals that have tie-ups with your insurance provider, you can avail cashless claim benefit. This feature ensures that all medical bills are directly settled between your insurer and hospital. \n\n✤ Tax Benefits - Those who pay health insurance premiums can enjoy income tax benefits. Under Section 80D of the Income Tax Act one can avail a tax benefit of up to Rs.1 Lakh on the premium payment of their health insurance policies. \n\n✤ There may be additional advantages, depending on the insurance provider in question.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if (pos == 17) {
            binding.textView18.setText("Motor Insurance");

            binding.tv1.setText("✤ Motor insurance refers to policies that offer financial assistance in the event of accidents involving your car or bike. Motor insurance can be availed for three categories of motorized vehicles, including: \n\n✤ Car Insurance - Personally owned four-wheeler vehicles are covered under such a policy. \n\n✤ Two-wheeler Insurance - Personally owned two-wheeler vehicles, including bikes and scooters, are covered under these plans. \n\n✤ Commercial Vehicle Insurance - If you own a vehicle that is used commercially, you need to avail insurance for the same. These policies ensure that your business automobiles stay in the best of shapes, reducing losses significantly. \n\n✤ Types of Motor Insurance Policies\n\n✤ Based on the extent of cover or protection offered, motor insurance policies are of three types, namely: \n\n✤ Third-Party Liability - This is the most basic type of motor insurance cover in India. It is the minimum mandatory requirement for all motorized vehicle owners, as per the Motor Vehicles Act of 1988. Due to the limited financial assistance, premiums for such policies also tend to be low. These insurance plans only pay the financial liability to the third-party affected in the said mishap, ensuring that you do not face legal hassle due to the accident. They, however, do not offer any financial assistance to repair the policyholder’s vehicle after accidents. \n\n✤ Comprehensive Cover - Compared to the third-party liability option, comprehensive insurance plans offer better protection and security. Apart from covering third party liabilities, these plans also cover the expenses incurred for repairing the damages to the policyholder’s own vehicle due to an accident. Additionally, comprehensive plans also offer a payout in case your vehicle sustains damage due to fire, man-made and natural calamities, riots and other such instances. Lastly, you can recover your bike’s cost if it gets stolen, when you have a comprehensive cover in place. One can also opt for several add-ons with their comprehensive motor insurance policy that can make it better-rounded. Some of these add-ons include zero depreciation cover, engine and gear-box protection cover, consumable cover, breakdown assistance, etc.\n\n✤ Own Damage Cover - This is a specialized form of motor insurance, which insurance companies offer to consumers. Further, you are eligible to avail such a plan only if you purchased the two-wheeler or car after September 2018. The vehicle must be brand new and not a second-hand one. You should also remember that you can avail this standalone damage cover only if you already have a third party liability motor insurance policy in place. With its own damage cover, you basically receive the same benefits as a comprehensive policy without the third-party liability portion of the policy. \n\n✤ Benefits of Motor Insurance Policies \n\n✤ Cars and bikes are increasingly more expensive with each passing day. At such a time, staying without proper insurance can lead to severe monetary losses for the owner. Listed below are some advantages of purchasing such a plan. \n\n✤ Prevents Legal Hassle - Helps you avoid any traffic fines and other legalities that you would otherwise need to bear.\n\n✤ Meets All Third-Party Liability - If you injure a person or damage someone’s property during a vehicular accident, the insurance policy helps you meet the monetary losses, effectively. \n\n✤ Financial Assistance to Repair Your own Vehicle - After accidents, you need to spend considerable sums on repairing your own vehicle. Insurance plans limit such out of pocket expenses, allowing you to undertake repairs immediately.\n\n✤ Theft/loss cover - If your vehicle is stolen, your insurance policy will help you reclaim a portion of the car/bike’s on-road price. You can expect similar assistance if your vehicle is damaged beyond repair due to accidents. \n\n✤ Additionally, individuals who own a commercial car/two-wheeler can also avail tax benefits if they pay premiums for that vehicle.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if (pos == 18) {
            binding.textView18.setText("Home Insurance");

            binding.tv1.setText("✤ As the name suggests, a home insurance policy offers comprehensive protection to the contents and structure of your house against any physical destruction or damage. In other words, this insurance type will provide coverage against any natural and human-made calamity, such as fire, earthquake, tornado, burglaries, and robbery. \n\n✤ Different types of home insurance policies include: \n\n✤ Home Structure/Building Insurance – Protects the structure of the house against damage during any calamity \n\n✤ Public Liability Coverage – Provides coverage against any damage to a guest or third-party on the insured residential property \n\n✤ Standard Fire and Special Perils Policy – Coverage against damages caused due to fire outbreaks, natural calamities (e.g., landslides, rockslides, earthquakes, storms, and floods), and anti-social human-made activities (e.g., explosions, strikes, and riots) \n\n✤ Personal Accident – Provides financial coverage to you and your family against any kind of permanent dismemberment or sudden demise to the insured individual, anywhere around the world \n\n✤ Burglary and Theft Insurance – Provides compensation for stolen goods in case of a burglary or theft \n\n✤ Contents Insurance – Provides compensation for loss of furniture, vehicles, and other appliances in case of a fire, theft, flood, or riots\n\n✤ Tenants’ Insurance – Provides financial protection to you (as a tenant) against any loss of personal property living in a rented house \n\n✤ Landlords’ insurance – Provides coverage to you (as a landlord) against contingencies such as public liability and loss of rent");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if (pos == 19) {
            binding.textView18.setText("Travel Insurance");

            binding.tv1.setText("✤ When talking about the different types of insurance policies, one must not forget to learn more about travel insurance plans. Such policies ensure the financial safety of a traveler during a trip. Therefore, when compared to other insurance policies, travel insurance is a short-term cover. \n\n✤ Depending on the provider you choose, travel insurance may offer financial aid at various times, such as during loss of baggage, trip cancellation and much more. Here is a look at some of the different types of travel insurance plans available in the country: \n\n✤ Domestic Travel Insurance - This is the kind of travel insurance policy that safeguards your finances during travels within India. However, if you plan to step outside the country for a vacation, such a policy would not offer any aid. \n\n✤ International Travel Insurance - If you are stepping out of the country, ensure you pick an international travel insurance plan. It allows you to cover the unforeseen expenses that can arise during your trip like medical emergencies, baggage loss, loss of passport, etc. \n\n✤ Home Holiday Insurance - When you are traveling with family, your home remains unguarded and unprotected. Chances of burglary are always significant, which may lead to significant losses. Thankfully, with home holiday insurance plans, which are often included within travel policies, you are financially protected from such events as well. \n\n✤ Benefits of Travel Insurance \n\n✤ The following aspects are covered under travel insurance plans: \n\n✤ Cover Flight Delay - Flight delays or cancellations can lead to significant losses for the passenger. If you buy travel insurance, you can claim such financial losses from the insurer. \n\n✤ Baggage Loss/Delay - Travel insurance lets you claim monetary assistance if there is a delay or you happen to lose your luggage during the trip. With this amount, you can purchase some of the necessary items. \n\n✤ Reclaim Lost Travel Documents - Visa and passport are essential documents during an international trip. Opting for international travel insurance ensures that you have the necessary financial backing to reapply for interim or replacement documents as and when necessary. \n\n✤ Trip Cancellation Cover - A sudden death in the family or a medical emergency may play spoilsport with your travel arrangements. Thankfully, international travel insurance plans support trip cancellations in such events. You can claim financial assistance to pay penalties and cancellation charges for flights, hotels, etc. \n\n✤ Make sure that you choose an insurer carefully, especially a company that is reliable and available 24x7 to assist you.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if (pos == 20) {
            binding.textView18.setText("Property Insurance");

            binding.tv1.setText("✤ Any building or immovable structure can be insured through property insurance plans. This can be either your residence or commercial space. If any damage befalls such a property, you can claim financial assistance from the insurance provider. Keep in mind that such a plan also financially safeguards the content inside the property. \n\n✤ Types of Property Insurance in India \n\n✤ Here are some types of property insurance policies available in India: \n\n✤ Home Insurance - With such a policy, you remain free from all financial liabilities that may arise from damage to your home or contents inside due to fires, burglaries, storms, earthquakes, explosions and other events. \n\n✤ Shop Insurance - If you own a shop, which acts as a source of income for you, it is integral to protect yourself from financial liability arising from the same. Whether the liability occurs due to natural calamities or due to accidents, with these plans, you can immediately undertake repairs to the shop. \n\n✤ Office Insurance - Another type of property insurance policy, office insurance ensures that the office building and all the equipment inside are significantly protected in the event of unforeseen events. Generally, office spaces include expensive equipment, such as computers, servers and much more. Thus, availing these plans is essential. \n\n✤ Building Insurance - If you own a complete building, opting for home insurance may not be sufficient. Instead, you can purchase building insurance to cover the entire premises. \n\n✤ Benefits of Property Insurance \n\n✤ If you still think that property cover is not one of the types of insurance plans you need to avail, take a look at some of the advantages from the same. \n\n✤ Protection against Fires - While the insurance policy cannot prevent fires, it can prevent financial liabilities from such an event. \n\n✤ Burglaries - If your property exists in an area prone to theft and burglaries, such a policy is vital to ensure financial security. \n\n✤ Floods - In certain parts of India, floods are common. These floods can ravage your property leading to substantial losses. Property insurance also protects against such events. \n\n✤ Natural Calamities - The plan also offers financial aid against damage arising from earthquakes, storms and more. \n\n✤ Rebuilding or renovation of a property is immensely expensive. Thus, property insurance policies are the best option to ensure long-term financial health.+");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if (pos == 21) {
            binding.textView18.setText("Term Life Insurance");

            binding.tv1.setText("✤ Term insurance is the purest and most affordable among the types of insurance policy in which you can opt for a high life cover for a specific period. You can secure your family’s financial future with a term life insurance plan by paying a low premium (term insurance plans generally do not have any maturity value, and thus, offer lower rates of premium than other life insurance products.) \n\n✤ If anything happens to you within the policy period, your loved ones would receive the agreed Sum Assured as per the payout option chosen (some term insurance types offer multiple payout options as well)");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if (pos == 22) {
            binding.textView18.setText("Whole Life Insurance");

            binding.tv1.setText("✤ Whole life insurance plans, also known as ‘traditional’ life insurance plans, provide coverage for the entire life of the insured individual, as opposed to any other life insurance instrument that offers coverage for a specific number of years. \n\n✤ While a whole life insurance plan offers to pay a death benefit, the plan also contains a savings component, which helps accrue a cash value throughout the policy term. The maturity age for a whole life insurance policy is 100 years. In case, the insured individual lives past the maturity age, the whole life plan will become a matured endowment.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if (pos == 23) {
            binding.textView18.setText("Endowment Plans");

            binding.tv1.setText("✤ Endowment plans essentially provide financial coverage to the policyholder against life’s uncertainties, while allowing them to save regularly over a certain period. Upon maturity of the endowment plan, the policyholder receives a lump sum amount if he or she survives the policy term. \n\n✤ If anything happens to you (as Life Insured), the life insurance endowment policy pays the complete Sum Assured to your family (beneficiaries)");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if (pos == 24) {
            binding.textView18.setText("Unit Linked Insurance");

            binding.tv1.setText("✤ Unit Linked Insurance Plans are types of insurance policy that offer both investment and insurance benefits under a single policy contract. A portion of the premium that you pay towards a Unit Linked Insurance Plan is allocated to a variety of market-linked equity and debt instruments. \n\n✤ The remaining premium contributes towards providing the life cover throughout the policy tenure. In this investment-cum-insurance type product, you have the flexibility to choose the allocation of premium into different instruments as per your financial requirements and market risk appetite.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if (pos == 25) {
            binding.textView18.setText("Child Plans");

            binding.tv1.setText("✤ Child plans are types of insurance policies that help you financially secure your child’s life goals such as higher education and marriage, even in your absence. In other words, child plans offer a combination of savings and insurance benefits that aid you in the financial planning for your child’s future needs at the right age. \n\n✤ The sum of money received on Maturity under this insurance type can be used to fulfill the financial requirements of your child.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if (pos == 26) {
            binding.textView18.setText("Pension Plans");

            binding.tv1.setText("✤ Pension plan, also known as retirement plan, is a type of investment plan that aids you in accumulating a portion of your savings over an extended period. \n\n✤ Essentially, a pension plan helps you deal with financial uncertainties post-retirement, by ensuring that you continue to receive a steady flow of income even after your working years are over. \n\n✤ In other words, a pension plan can be a type of insurance in India that allows you to create a financial cushion for your life post-retirement, in which you contribute a specific amount of money regularly until your retirement. Subsequently, the accumulated amount is given back to you as annuity or pension at regular intervals. \n\n✤ With Max Life Insurance, you can find comprehensive plans such as Max Life Smart Wealth Plan or Max Life Smart Secure Plus Plan to fulfill your particular investment goals and keep your loved ones financially secure.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if (pos == 27) {
            binding.textView18.setText("Fire Insurance");

            binding.tv1.setText("✤ Fire insurance policies are different types of insurance coverages that compensate any losses incurred due to a fire breakout with a sum assured. These types of insurance policy usually provide a significant amount of coverage to help both individuals and companies to reopen their places after incurring extensive damage due to fire. These insurance types cover war risk, turmoil, riots losses as well. \n\n✤ Different types of fire insurance in India are – \n\n✤ Valued policy \n\n✤ Specific Policy \n\n✤ Floating Policy \n\n✤ Consequential Policy \n\n✤ Replacement Policy \n\n✤ Comprehensive Fire insurance policy");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }

    }
}