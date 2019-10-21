/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author PPuarat
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //declare object to display double in 3 decimal places
        DecimalFormat df3 = new DecimalFormat("#.###");
        
        //Create account object to store value
        Task1Account myAccount = new Task1Account();
        
        //Create Scanner Object
        Scanner inputScanner = new Scanner(System.in);
        
        //take amount of money from user
        myAccount.setBalance(
                Task1Utils.validateInput("Please enter your savings amount: ", true, inputScanner));
        //take annual interest from user
        myAccount.setAnnualRate(
                Task1Utils.validateInput("Please enter annual interest rate: ", true, inputScanner));
        //take number of months from user
        myAccount.setSavingsMonths(
                Task1Utils.validateInput("Please enter number of months: ", false, inputScanner));

        //Print the result
        System.out.println("You have $" + df3.format(myAccount.getTotalAmount())
                + " in the savings account after " + myAccount.getSavingsMonths() + " months");
    }

}
