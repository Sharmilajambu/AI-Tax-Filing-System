package com.aitax.service;

import com.aitax.model.User;

public class TaxCalculator {

    public double calculateTax(User user) {

        double taxableIncome = user.getIncome() - user.getDeductions();
        double tax = 0;

        if (taxableIncome <= 250000) {
            tax = 0;
        }
        else if (taxableIncome <= 500000) {
            tax = taxableIncome * 0.05;
        }
        else if (taxableIncome <= 1000000) {
            tax = taxableIncome * 0.20;
        }
        else {
            tax = taxableIncome * 0.30;
        }

        return tax;
    }
}
