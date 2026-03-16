package com.aitax;

import java.util.Scanner;

import com.aitax.database.DatabaseManager;
import com.aitax.form.FormAutoFill;
import com.aitax.model.User;
import com.aitax.service.AIAdvisor;
import com.aitax.service.ChatBot;
import com.aitax.service.TaxCalculator;
import com.aitax.service.TaxPredictor;
import com.aitax.utils.DocumentUploader;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ─── Banner ───────────────────────────────────────────────
        System.out.println("==========================================");
        System.out.println("       AI TAX FILING SYSTEM - INDIA       ");
        System.out.println("==========================================");

        // ─── User Input ───────────────────────────────────────────
        System.out.print("Enter Name       : ");
        String name = sc.nextLine();

        System.out.print("Enter Income (Rs): ");
        double income = sc.nextDouble();

        System.out.print("Enter Deductions : ");
        double deductions = sc.nextDouble();
        sc.nextLine(); // consume newline

        User user = new User(name, income, deductions);

        // ─── Tax Calculation ──────────────────────────────────────
        System.out.println("\n==========================================");
        TaxCalculator calc = new TaxCalculator();
        double tax = calc.calculateTax(user);
        System.out.println("Tax Payable      : Rs " + tax);

        // ─── ITR Form ─────────────────────────────────────────────
        System.out.println();
        FormAutoFill form = new FormAutoFill();
        form.fillForm(user, tax);

        // ─── AI Tax Saving Advice ─────────────────────────────────
        System.out.println("\n--- AI Tax Saving Advice ---");
        AIAdvisor advisor = new AIAdvisor();
        System.out.println(advisor.getAdvice(user));

        // ─── Future Tax Prediction ────────────────────────────────
        TaxPredictor predictor = new TaxPredictor();
        double futureTax = predictor.predictFutureTax(income);
        System.out.println("--- Future Tax Prediction ---");
        System.out.println("Predicted Tax Next Year : Rs " + futureTax);
        if (futureTax < tax) {
            System.out.println("Note: Predicted tax uses a flat 18% estimate.");
            System.out.println("      Actual future tax depends on your income slab.");
        }

        // ─── Save to Database ─────────────────────────────────────
        System.out.println("\n--- Database ---");
        DatabaseManager db = new DatabaseManager();
        db.saveUser(user, tax);

        // ─── Document Upload ──────────────────────────────────────
        System.out.println("\n--- Document Upload ---");
        System.out.print("Enter document path to upload (or press Enter to skip): ");
        String docPath = sc.nextLine();
        if (!docPath.trim().isEmpty()) {
            DocumentUploader uploader = new DocumentUploader();
            uploader.uploadDocument(docPath);
        } else {
            System.out.println("No document uploaded.");
        }

        // ─── AI ChatBot ───────────────────────────────────────────
        System.out.println("\n--- AI Tax ChatBot ---");
        ChatBot bot = new ChatBot();
        bot.startChat();

        // ─── Cleanup ──────────────────────────────────────────────
        db.closeConnection();
        sc.close();

        System.out.println("\n==========================================");
        System.out.println("       Thank you for using AI Tax Filing   ");
        System.out.println("==========================================");
    }
}