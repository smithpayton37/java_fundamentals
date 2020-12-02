package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] calculator = new int[10];
        int sum = 0;

        for(int i = 0; i < calculator.length; i++){
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            calculator[i] = number;

            sum += number;

        }

        int average = sum / calculator.length;
        System.out.println(sum);
        System.out.println(average);

    }

}