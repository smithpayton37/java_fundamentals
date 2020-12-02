package labs_examples.arrays.labs;

import java.util.Random;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        Random r = new Random();
        int height = r.nextInt(10);
        int[][] nums = new int[height][];
        int count = 0;

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
    }

}
