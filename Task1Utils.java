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
public final class Task1Utils {

    /**
     * @param question string to display to user
     * @param isDouble if we want an integer(example: we want 1 not 1.5) or a
     * double
     * @param inputScanner Scanner object with System.in
     * @return double value
     */
    public static double validateInput(String question, boolean isDouble, Scanner inputScanner) {

        double returnResult;

        //Ask a question
        System.out.print(question);

        //Check if the input is in correct format(numbers)
        if (inputScanner.hasNextDouble()) {
            //Read value from scanner
            returnResult = inputScanner.nextDouble();
            //Months value cannot be decimal
            if (!isDouble && returnResult != Math.floor(returnResult)) {
                returnResult = validateInput("Please enter an integer: ", isDouble, inputScanner);
            }
            //Check if the value is not negative
            if (returnResult <= 0) {
                returnResult = validateInput("Please enter positive numbers: ", isDouble, inputScanner);
            }

        } else {
            //if the user input is string they'll have to try again
            returnResult = validateInput("Please enter numbers: ", isDouble, inputScanner);
        }

        return returnResult;
    }
}
