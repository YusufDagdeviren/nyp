/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yusuf.nyp4;

import java.util.Date;

/**
 *
 * @author yusuf
 */
public class Loan {
    
    
    private double annualInterestRate ; //aylıkFaiz
    private int numbrOfYears; // Yılı
    private double loanAmount; //kredi mik
    private Date loanDate; //kredi tarihi

    public Loan() {
    }
    
    
    public Loan(double annualInterestRate, int numbrOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numbrOfYears = numbrOfYears;
        this.loanAmount = loanAmount;
        ;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumbrOfYears() {
        return numbrOfYears;
    }

    public void setNumbrOfYears(int numbrOfYears) {
        this.numbrOfYears = numbrOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }
    public double getMonthlyPayment(){
        
        double aylikOdeme = loanAmount * annualInterestRate / 1-1/Math.pow(1+annualInterestRate, numbrOfYears*12);
        return aylikOdeme;
        
        
        
    }
    public double getTotalPayment(){
        
        return 12 * getMonthlyPayment();
        
    }        
            
            
            
            
    
    
    
    
    
    
}
