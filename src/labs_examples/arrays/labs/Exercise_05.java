package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        int[] array = new int[10];
        int count = 0;

        for(int x = 0; x < array.length; x++){
            array[x] = count;
            count++;
        }

        for(int x = 9; x >= 0; x -= 2){
            System.out.print(array[x] + " ");
        }

    }

}
