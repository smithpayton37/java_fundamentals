package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 4: Even numbers
 *
 *      Using a "for-loop", print out all even numbers from 1-100.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

//        simpler:
        for(int i = 2; i <= 100; i += 2){

            System.out.println(i);

        }

//        more complicated:
        for(int x = 1; x <= 100; x++){

            if(x % 2 == 0){

                System.out.println(x);

            }

        }

    }

}
