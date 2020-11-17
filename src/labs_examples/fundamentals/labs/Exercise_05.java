package labs_examples.fundamentals.labs;


import java.sql.SQLOutput;

/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int i = str.length();
        
        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean equalStrings = str.equalsIgnoreCase(str2);
        System.out.println("Do str and str2 match? " + equalStrings);

        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = str + str2;
        System.out.println(str3);
        System.out.println("The length of the String is " + str.length());
        System.out.println("The length of the other String is " + str2.length());
        int l = str.length();

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        System.out.println("All uppercase: " + str.toUpperCase());
        System.out.println("All lowercase: " + str.toLowerCase());

        System.out.println("Also all uppercase: " + str2.toUpperCase());
        System.out.println("Also all lowercase: " + str2.toLowerCase());

        String replace = str3.replace('!', '*');
        System.out.println(replace);

        String substring = str2.substring(2);
        System.out.println(substring);

        String substring2 = str2.substring(2, 4);
        System.out.println(substring2);

        boolean contains = str.contains("al");
        System.out.println(contains);

        int index = str.indexOf('a');
        System.out.println(index);

    }


}