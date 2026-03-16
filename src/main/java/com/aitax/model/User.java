package com.aitax.model;

public class User {

    private String name;
    private double income;
    private double deductions;

    public User(String name, double income, double deductions) {
        this.name = name;
        this.income = income;
        this.deductions = deductions;
    }

    public String getName() {
        return name;
    }

    public double getIncome() {
        return income;
    }

    public double getDeductions() {
        return deductions;
    }
}