package labs_examples.datatypes_operators.labs;

import java.util.Scanner;

public class LogicalDemo {

    public static void main(String[] args) {

        boolean test = false;
        boolean test2 = true;
        String test3 = "something";

        if(!test && test2){
            System.out.println("anything");
        }

        if(!test3.equalsIgnoreCase("something")){
            System.out.println("something");
        }

        String input = "";

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Type something or q to quit");
            input = scanner.next();
            System.out.println("You typed " + input);
        } while(!input.equalsIgnoreCase("q"));

        System.out.println("Goodbye");

        int i = 10;
        double x = 50.5;
        double z = i / x;
        System.out.println(z);
    }

}
