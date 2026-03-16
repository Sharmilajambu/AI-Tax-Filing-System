package com.aitax.form;

import com.aitax.model.User;

public class FormAutoFill {

    public void fillForm(User user, double tax) {

        System.out.println("------ ITR TAX FORM ------");
        System.out.println("Name        : " + user.getName());
        System.out.println("Income      : ₹" + user.getIncome());
        System.out.println("Deductions  : ₹" + user.getDeductions());
        System.out.println("Taxable Inc : ₹" + (user.getIncome() - user.getDeductions()));
        System.out.println("Tax Payable : ₹" + tax);
        System.out.println("--------------------------");

    }
}