package com.natwest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bankName;
    private double minLoanAmount;
    private double maxLoanAmount;
    private double minInterestRate;
    private double minCreditScore;
    private double termLength;
    private double processingFee;
    private int rating;
    private String status;

    public LoanApplication() {
    }

    public LoanApplication(int id, String bankName, double minLoanAmount, double maxLoanAmount, double minInterestRate, double minCreditScore, double termLength, double processingFee, int rating, String status) {
        this.id = id;
        this.bankName = bankName;
        this.minLoanAmount = minLoanAmount;
        this.maxLoanAmount = maxLoanAmount;
        this.minInterestRate = minInterestRate;
        this.minCreditScore = minCreditScore;
        this.termLength = termLength;
        this.processingFee = processingFee;
        this.rating = rating;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getMinLoanAmount() {
        return minLoanAmount;
    }

    public void setMinLoanAmount(double minLoanAmount) {
        this.minLoanAmount = minLoanAmount;
    }

    public double getMaxLoanAmount() {
        return maxLoanAmount;
    }

    public void setMaxLoanAmount(double maxLoanAmount) {
        this.maxLoanAmount = maxLoanAmount;
    }

    public double getMinInterestRate() {
        return minInterestRate;
    }

    public void setMinInterestRate(double minInterestRate) {
        this.minInterestRate = minInterestRate;
    }

    public double getMinCreditScore() {
        return minCreditScore;
    }

    public void setMinCreditScore(double minCreditScore) {
        this.minCreditScore = minCreditScore;
    }

    public double getTermLength() {
        return termLength;
    }

    public void setTermLength(double termLength) {
        this.termLength = termLength;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LoanApplication{" +
                "id=" + id +
                ", bankName='" + bankName + '\'' +
                ", minLoanAmount=" + minLoanAmount +
                ", maxLoanAmount=" + maxLoanAmount +
                ", minInterestRate=" + minInterestRate +
                ", minCreditScore=" + minCreditScore +
                ", termLength=" + termLength +
                ", processingFee=" + processingFee +
                ", rating=" + rating +
                ", status='" + status + '\'' +
                '}';
    }
}
