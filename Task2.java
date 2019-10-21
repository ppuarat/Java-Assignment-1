/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author PPuarat
 */
public class Task2 {

    public static void main(String[] args) {
        //Create customer object
        Task2Customer customer = new Task2Customer();
        //Create Scanner object
        Scanner inputScanner = new Scanner(System.in);
        
        //Ask question and set value to customer object
        customer.setAccountNumber(
                Task2Utils.validateInput("Please enter your account number: ", inputScanner));
        customer.setBalance(
                Task2Utils.validateInput("Please enter your balance at the begining of the month: ", inputScanner));
        customer.setAllChargeds(
                Task2Utils.validateInput("Please enter total charged this month: ", inputScanner));
        customer.setCreditsApplied(
                Task2Utils.validateInput("Please enter total of credits applied this month: ", inputScanner));
        customer.setCreditLimit(
                Task2Utils.validateInput("Please enter your credit limit: ", inputScanner));
        
        //Check the credit limit
        if(customer.isCreditLimitExceeded()){
            System.out.println("CREDIT LIMIT EXCEEDED!!");
            System.out.println("Your Account Number: " + customer.getAccountNumber());
            System.out.println("Your Credit Limit: " + customer.getCreditLimit());
            System.out.println("Your New Balance: " + customer.getNewBalance());
        }else{
            System.out.println("You are good to go!!");
        }
    }
}
