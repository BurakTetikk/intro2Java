package listings.listing_10_1;

import java.util.Date;

public class Loan {
    private double annualInterestRate = 2.5;
    private int numberOfYear = 1;
    private double loanAmount = 1000;
    private Date loanDate;

    public Loan() {

    }

    public Loan(double annualInterestRate, int numberOfYear, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYear = numberOfYear;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYear() {
        return numberOfYear;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYear(int numberOfYear) {
        this.numberOfYear = numberOfYear;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYear * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYear * 12;
        return totalPayment;
    }
}
