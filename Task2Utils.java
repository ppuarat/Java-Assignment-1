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
public final class Task2Utils {
    
    /**
     * @param question string to display to user      
     * @param inputScanner Scanner Object    
     * @return int value
     */
    public static int validateInput(String question, Scanner inputScanner) {
        //Create Scanner object to get input from user
        //Scanner inputScanner = new Scanner(System.in);
        int returnResult;
        
        //Ask a question
        System.out.print(question);
        
        //Check if the input is in correct format(numbers)
        if (inputScanner.hasNextInt()) {
            //Read value from scanner
            returnResult = inputScanner.nextInt();
    
            //Check if the value is not negative
            if (returnResult <= 0) {
                returnResult = validateInput("Please enter positive numbers: ", inputScanner);
            }

        } else {
            //if the user input is string they'll have to try again
            returnResult = validateInput("Please enter numbers: ", inputScanner);
        }

        return returnResult;
    }
    
}
