package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Hello!");
        list.add("My");
        list.add("name");
        list.add("is");
        list.add("Payton!");

        System.out.println(list);

        System.out.println(list.contains("name"));
        System.out.println(list.get(0));
        System.out.println(list.indexOf("Payton!"));

        if(list.isEmpty()){
            System.out.println("Empty");
        }
        else{
            System.out.println("Not Empty");
        }

        list.remove(0);
        System.out.println(list);

        list.add(0, "Merry Christmas!");
        System.out.println(list);

        list.set(0, "Happy Holidays!");
        System.out.println(list);


    }

}
