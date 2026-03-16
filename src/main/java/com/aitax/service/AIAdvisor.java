package com.aitax.service;

import com.aitax.model.User;

public class AIAdvisor {

    public String getAdvice(User user) {

        double income = user.getIncome();
        double deductions = user.getDeductions();
        double taxableIncome = income - deductions;
        StringBuilder advice = new StringBuilder();

        if (deductions < 150000) {
            advice.append("- You can invest up to ₹1.5 lakh under Section 80C (PPF, ELSS, LIC) to reduce tax.\n");
        }

        if (income > 500000 && deductions < 25000) {
            advice.append("- Claim health insurance premium under Section 80D (up to ₹25,000).\n");
        }

        if (taxableIncome > 1000000) {
            advice.append("- Consider NPS contributions under Section 80CCD(1B) for an extra ₹50,000 deduction.\n");
        }

        if (taxableIncome > 500000) {
            advice.append("- Explore HRA exemption if you are paying rent.\n");
        }

        if (advice.length() == 0) {
            advice.append("- Your tax profile looks optimised. Keep investing in 80C instruments to maintain it.");
        }

        return advice.toString();
    }
}