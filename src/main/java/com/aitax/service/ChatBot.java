package com.aitax.service;

import java.util.Scanner;

public class ChatBot {

    public void startChat() {

        Scanner sc = new Scanner(System.in);

        System.out.println("+-------------------------------------------------+");
        System.out.println("|       AI Tax Assistant - India (FY 2024-25)     |");
        System.out.println("|  Type 'help' for topics or 'exit' to quit       |");
        System.out.println("+-------------------------------------------------+");

        while (true) {
            System.out.print("You: ");
            String input = sc.nextLine().trim().toLowerCase();

            if (input.isEmpty()) continue;

            if (input.equals("exit")) {
                System.out.println("Bot: Goodbye! File your ITR on time. Deadline: July 31.");
                break;

            } else if (input.equals("help")) {
                System.out.println("Bot: I can answer questions on these topics:");
                System.out.println("     1. tax slab       - Income tax slabs");
                System.out.println("     2. deduction      - 80C, 80D deductions");
                System.out.println("     3. refund         - How to claim refund");
                System.out.println("     4. itr            - ITR filing info");
                System.out.println("     5. tds            - TDS explained");
                System.out.println("     6. hra            - House Rent Allowance");
                System.out.println("     7. nps            - National Pension Scheme");
                System.out.println("     8. deadline       - Filing deadlines");
                System.out.println("     9. penalty        - Late filing penalty");
                System.out.println("     10. new regime    - New vs old tax regime");

            } else if (input.contains("slab") || input.contains("rate") || input.contains("percent")) {
                System.out.println("Bot: India Income Tax Slabs (Old Regime FY 2024-25):");
                System.out.println("     Up to Rs 2.5 lakh   -> 0%");
                System.out.println("     Rs 2.5L - Rs 5L     -> 5%");
                System.out.println("     Rs 5L   - Rs 10L    -> 20%");
                System.out.println("     Above Rs 10L        -> 30%");
                System.out.println("     Tip: Use Section 87A rebate if income <= Rs 5L (zero tax).");

            } else if (input.contains("new regime") || input.contains("old regime") || input.contains("regime")) {
                System.out.println("Bot: New Tax Regime (FY 2024-25):");
                System.out.println("     Up to Rs 3L         -> 0%");
                System.out.println("     Rs 3L - Rs 6L       -> 5%");
                System.out.println("     Rs 6L - Rs 9L       -> 10%");
                System.out.println("     Rs 9L - Rs 12L      -> 15%");
                System.out.println("     Rs 12L - Rs 15L     -> 20%");
                System.out.println("     Above Rs 15L        -> 30%");
                System.out.println("     Note: New regime has lower rates but fewer deductions.");

            } else if (input.contains("80c") || input.contains("deduction")) {
                System.out.println("Bot: Key Deductions available:");
                System.out.println("     Section 80C  -> Up to Rs 1.5L (PPF, ELSS, LIC, EPF, NSC)");
                System.out.println("     Section 80D  -> Up to Rs 25,000 (Health Insurance)");
                System.out.println("     Section 80E  -> Education loan interest (no limit)");
                System.out.println("     Section 80G  -> Donations to charity");
                System.out.println("     Section 80TTA-> Up to Rs 10,000 (savings interest)");

            } else if (input.contains("nps") || input.contains("pension") || input.contains("80ccd")) {
                System.out.println("Bot: National Pension Scheme (NPS):");
                System.out.println("     Section 80CCD(1)  -> Up to 10% of salary (within 80C limit)");
                System.out.println("     Section 80CCD(1B) -> Extra Rs 50,000 deduction over 80C limit");
                System.out.println("     Total max benefit -> Rs 2 lakh (80C + 80CCD(1B))");

            } else if (input.contains("hra") || input.contains("house rent") || input.contains("rent")) {
                System.out.println("Bot: HRA (House Rent Allowance) Exemption:");
                System.out.println("     Exempt amount = Minimum of:");
                System.out.println("     1. Actual HRA received");
                System.out.println("     2. 50% of salary (metro) or 40% (non-metro)");
                System.out.println("     3. Rent paid - 10% of salary");
                System.out.println("     Note: Submit rent receipts & landlord PAN if rent > Rs 1L/year.");

            } else if (input.contains("tds") || input.contains("tax deducted")) {
                System.out.println("Bot: TDS (Tax Deducted at Source):");
                System.out.println("     - Employer deducts TDS from your salary every month.");
                System.out.println("     - You can check TDS in Form 26AS on the IT portal.");
                System.out.println("     - If excess TDS was deducted, file ITR to claim a refund.");
                System.out.println("     - Submit Form 15G/15H to avoid TDS on bank interest.");

            } else if (input.contains("refund")) {
                System.out.println("Bot: Tax Refund Process:");
                System.out.println("     1. File your ITR on the IT portal (incometax.gov.in).");
                System.out.println("     2. Verify ITR using Aadhaar OTP or net banking.");
                System.out.println("     3. Refund is credited to your bank account in 2-6 weeks.");
                System.out.println("     Tip: Make sure your bank account is pre-validated on the portal.");

            } else if (input.contains("itr") || input.contains("file") || input.contains("filing") || input.contains("return")) {
                System.out.println("Bot: ITR Filing Info:");
                System.out.println("     - ITR-1 (Sahaj)  : Salaried individuals, income up to Rs 50L");
                System.out.println("     - ITR-2          : Capital gains, foreign income");
                System.out.println("     - ITR-3          : Business or profession income");
                System.out.println("     - File at: https://incometax.gov.in");
                System.out.println("     - Documents needed: Form 16, PAN, Aadhaar, bank statement.");

            } else if (input.contains("deadline") || input.contains("due date") || input.contains("last date")) {
                System.out.println("Bot: Important Tax Deadlines (FY 2024-25):");
                System.out.println("     July 31, 2025    -> ITR filing (individuals, no audit)");
                System.out.println("     Oct 31, 2025     -> ITR filing (audit cases)");
                System.out.println("     Dec 31, 2025     -> Belated/revised ITR deadline");
                System.out.println("     Mar 15, 2025     -> Advance tax final instalment");

            } else if (input.contains("penalty") || input.contains("late") || input.contains("fine")) {
                System.out.println("Bot: Late Filing Penalty (Section 234F):");
                System.out.println("     - Filed after July 31 but before Dec 31 -> Rs 5,000 penalty");
                System.out.println("     - Filed after Dec 31                    -> Rs 10,000 penalty");
                System.out.println("     - If income <= Rs 5 lakh                -> Max Rs 1,000 penalty");
                System.out.println("     - Interest under 234A also applies on tax due.");

            } else if (input.contains("advance tax") || input.contains("advance")) {
                System.out.println("Bot: Advance Tax (pay in instalments during the year):");
                System.out.println("     June 15   -> 15% of tax");
                System.out.println("     Sept 15   -> 45% of tax");
                System.out.println("     Dec 15    -> 75% of tax");
                System.out.println("     Mar 15    -> 100% of tax");
                System.out.println("     Applies if total tax liability > Rs 10,000.");

            } else if (input.contains("pan") || input.contains("aadhaar") || input.contains("link")) {
                System.out.println("Bot: PAN-Aadhaar Linking:");
                System.out.println("     - Mandatory for all taxpayers.");
                System.out.println("     - Link at: incometax.gov.in or via SMS.");
                System.out.println("     - Unlinked PAN becomes inoperative (higher TDS deducted).");

            } else if (input.contains("predict") || input.contains("future") || input.contains("next year")) {
                System.out.println("Bot: Future tax is estimated at 18% of your current income.");
                System.out.println("     This is a flat projection. Actual tax depends on:");
                System.out.println("     - Your income next year");
                System.out.println("     - Investments and deductions claimed");
                System.out.println("     - Whether you choose old or new tax regime.");

            } else if (input.contains("hello") || input.contains("hi") || input.contains("hey")) {
                System.out.println("Bot: Hello! I am your AI Tax Assistant.");
                System.out.println("     Type 'help' to see what I can help you with.");

            } else if (input.contains("thank")) {
                System.out.println("Bot: You're welcome! File your taxes on time. Happy saving!");

            } else if (input.contains("law") || input.contains("legal") || input.contains("act") || input.contains("section")) {
                System.out.println("Bot: Tax laws in India are governed by the Income Tax Act, 1961.");
                System.out.println("     Key sections for taxpayers:");
                System.out.println("     Section 80C   -> Investments & deductions");
                System.out.println("     Section 87A   -> Rebate for income up to Rs 5L");
                System.out.println("     Section 139   -> Filing of ITR");
                System.out.println("     Section 234F  -> Penalty for late filing");
                System.out.println("     For detailed legal advice, consult a CA.");

            } else {
                System.out.println("Bot: I am not sure about that. Type 'help' to see topics I can answer.");
            }
        }

        sc.close();
    }

}