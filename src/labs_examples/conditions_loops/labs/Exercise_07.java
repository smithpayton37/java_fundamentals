package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a word, any word, to find the first vowel in the word: ");
        String word = scanner.next();

        int end = 0;
        int letter = 0;
        int length = word.length();

        int index = 0;
        String vowels = "aeiou";

        while(index < length){

            char c = word.charAt(index);

            if(vowels.indexOf(c) != -1){

                System.out.println("The first vowel in " + word + " is: " + c);
                break;

            }
            index++;
        }

        while (end < length) {

            if(word.indexOf("a") == letter){

                System.out.println("a");
                System.out.println(word);
                return;

            }
            if(word.indexOf("e") == letter){

                System.out.println("e");
                System.out.println(word);
                return;

            }
            if(word.indexOf("i") == letter){

                System.out.println("i");
                System.out.println(word);
                return;

            }
            if(word.indexOf("o") == letter){

                System.out.println("o");
                System.out.println(word);
                return;

            }
            if(word.indexOf("u") == letter){

                System.out.println("u");
                System.out.println(word);
                return;

            }

            letter++;
            end++;

        }

    }

}
