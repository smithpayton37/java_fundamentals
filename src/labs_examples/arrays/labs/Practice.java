package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.Random;

public class Practice {

    public static void main(String[] args) {

        int[][] aP = new int[5][5];

        int count = 0;

        for (int x = 0; x < aP.length; x++) {

            for (int y = 0; y < aP[x].length; y++) {

                aP[x][y] = count;
                count++;

            }
        }

        for (int x = 0; x < aP.length; x++) {

            for (int y = 0; y < aP[x].length; y++) {

                System.out.print(aP[x][y]);

            }

            System.out.println();

        }

        Random r = new Random();
        int height = r.nextInt(10);
        int[][] nums = new int[height][];
        count = 0;
        System.out.println();
        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            int width = r.nextInt(10);
            nums[i] = new int[width];
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = count;
                count++;
            }
        }

        for (int[] vals : nums) {
            for (int i : vals) {
                System.out.print(i);
            }
            System.out.println();
        }


        //YOUR CODE BELOW

        /*  1.  First create and initialize an ArrayList called guests.
                Remember, the syntax to create an ArrayList is:
                ArrayList<type> name = new ArrayList<type>();   */

        ArrayList<String> guests = new ArrayList<String>();

        /*  2.  Now add the following names to the list using .add() :
                Arnold, Gerald, Eugene, Helga, Phoebe in that order */

        guests.add("Arnold");
        guests.add("Gerald");
        guests.add("Eugene");
        guests.add("Helga");
        guests.add("Phoebe");

        /*  3.  Print the names using a ForEach loop.
                Remember, the syntax for the ForEach loop is:
                for(type element: collection) { code }          */

        for (String names : guests) {
            System.out.println(names);
        }

        /*  4.  Eugene wont be able to make it.
                Remove him from the list using .remove() */

        guests.remove(2);

        /*  5. Print the list again  */

        for (String names : guests) {
            System.out.println(names);
        }


        //YOUR CODE ABOVE


    }

}
