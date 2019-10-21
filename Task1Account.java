/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author PPuarat
 */
public class Task1Account {

    private double balance;
    private double annualRate;
    private double totalAmount = 0;
    private double savingsMonths;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualRate(double annualRate) {
        this.annualRate = annualRate;
    }

    public double getTotalAmount() {

        //calculate monthly interest rate
        double monthlyRate = (annualRate / 12) / 100;
        //calculate interest per month
        for (int i = 1; i <= savingsMonths; i++) {

            totalAmount = (totalAmount + balance) * (1 + monthlyRate);
            //System.out.println(totalAmount + " RATE:" + monthlyRate);

        }

        return totalAmount;
    }

    public void setSavingsMonths(double savingsMonths) {
        this.savingsMonths = savingsMonths;
    }

    public int getSavingsMonths() {
        return (int) savingsMonths;
    }

}
