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
public class Task2Customer {

    private int accountNumber;
    private int balance;
    private int allChargeds;
    private int creditsApplied;
    private int creditLimit;
    private int newBalance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAllChargeds(int allChargeds) {
        this.allChargeds = allChargeds;
    }

    public void setCreditsApplied(int creditsApplied) {
        this.creditsApplied = creditsApplied;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getNewBalance() {
        return (this.balance + this.allChargeds) - this.creditsApplied;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public boolean isCreditLimitExceeded() {
        
        if (this.getNewBalance() > this.creditLimit) {
            return true;
        } else {
            return false;
        }
    }

}
