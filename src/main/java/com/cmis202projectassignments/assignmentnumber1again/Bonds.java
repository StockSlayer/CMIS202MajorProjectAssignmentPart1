//package com.cmis202projectassignments.assignmentnumber1again;
//
//import java.util.Date;
//
//public class Bonds {
//
//    private String typeOfBond;
//    private double annualInterestRate;
//    private int numberOfYears;
//    private double loanAmount;
//    private Date loanDate;
//
//
//    /** Construct a Bond with specified annual interest rate,
//     number of years, and loan amount
//     */
//    public Bonds(String typeOfBond, double annualInterestRate, int numberOfYears, double loanAmount) {
//        this.typeOfBond = typeOfBond;
//        this.annualInterestRate = annualInterestRate;
//        this.numberOfYears = numberOfYears;
//        this.loanAmount = loanAmount;
//        this.loanDate = new Date();
//    }
//
//    public String getTypeOfBond() {
//        return typeOfBond;
//    }
//
//    public void setTypeOfBond(String typeOfBond) {
//        this.typeOfBond = typeOfBond;
//    }
//
//    public double getAnnualInterestRate() {
//        return annualInterestRate;
//    }
//
//    public void setAnnualInterestRate(double annualInterestRate) {
//        this.annualInterestRate = annualInterestRate;
//    }
//
//    public int getNumberOfYears() {
//        return numberOfYears;
//    }
//
//    public void setNumberOfYears(int numberOfYears) {
//        this.numberOfYears = numberOfYears;
//    }
//
//    public double getLoanAmount() {
//        return loanAmount;
//    }
//
//    public void setLoanAmount(double loanAmount) {
//        this.loanAmount = loanAmount;
//    }
//
//    public Date getLoanDate() {
//        return loanDate;
//    }
//
//    public void setLoanDate(Date loanDate) {
//        this.loanDate = loanDate;
//    }
//
//    /** Find monthly Return */
//    public double getMonthlyReturn() {
//        double monthlyInterestRate = annualInterestRate / 1200;
//        double monthlyReturn = loanAmount * monthlyInterestRate / (1 -
//                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
//        return monthlyReturn;
//    }
//
//
//    /** Find total payment */
//    public double getTotalPayment() {
//        double totalPayment = getMonthlyReturn() * numberOfYears * 12;
//        return totalPayment;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Bond[" +
//                "annualInterestRate=" + annualInterestRate +
//                ", numberOfYears=" + numberOfYears +
//                ", loanAmount=" + loanAmount +
//                ", loanDate=" + loanDate +
//                ']';
//    }
//
//////////////////////////////////////////////////////////////////////////
//    public Bonds() {
//        super();
//    }
//
//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
//
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//}
