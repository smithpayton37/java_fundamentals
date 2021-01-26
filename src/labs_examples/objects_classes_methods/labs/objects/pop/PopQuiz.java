package labs_examples.objects_classes_methods.labs.objects.pop;

public class PopQuiz {

    public static void main(String[] args) {

        int[] nums = new int[50];

        int j = 3;

        for(int i = 0; i < nums.length; i++){

            nums[i] = j;
            j += 3;

        }

        for(int x = 0; x < nums.length; x += 2){

            System.out.println(nums[x]);

        }

        int[] vals = {2, 4, 6, 8, 10};
        int temp = 0;

        for(int i = 0; i < vals.length / 2; i++){
            temp = vals[i];
            int backPointer = vals.length - 1 - i;
            vals[i] = vals[backPointer];
            vals[backPointer] = temp;
        }

        for(int val : vals){
            System.out.print(val + " ");
        }

    }

}
