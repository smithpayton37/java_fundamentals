package labs_examples.arrays.labs;

import java.util.Random;

public class Practice {

    public static void main(String[] args) {

        int[][] aP = new int[5][5];

        int count = 0;

        for(int x = 0; x < aP.length; x++){

            for(int y = 0; y < aP[x].length; y++){

                aP[x][y] = count;
                count++;

            }
        }

        for(int x = 0; x < aP.length; x++){

            for(int y = 0; y < aP[x].length; y++){

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

        for(int i = 0; i < nums.length; i++){
            int width = r.nextInt(10);
            nums[i] = new int[width];
            for(int j = 0; j < nums[i].length; j++){
                nums[i][j] = count;
                count++;
            }
        }

        for(int[] vals : nums){
            for(int i : vals){
                System.out.print(i);
            }
            System.out.println();
        }

    }

}
