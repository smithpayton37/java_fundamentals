package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a number to serve as a lower bound: ");
        int lowerBound = scanner.nextInt();

        System.out.println("Choose a number to serve as an upper bound: ");
        int upperBound = scanner.nextInt();

        int y = 0;

        for(int x = lowerBound; x <= upperBound; x++){

            y += x;

        }
        System.out.println(y);

        int z = upperBound - lowerBound + 1;
        int average = y / z;

        System.out.println(average);


    }
}
