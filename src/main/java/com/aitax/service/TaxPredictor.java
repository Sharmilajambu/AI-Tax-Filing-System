package com.aitax.service;

public class TaxPredictor {

    public double predictFutureTax(double income) {

        double predictedTax = income * 0.18;

        return predictedTax;
    }

}