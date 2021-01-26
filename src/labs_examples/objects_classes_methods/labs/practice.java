package labs_examples.objects_classes_methods.labs;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class practice {
}

class Main {
    public static void main(String[] args) {

        // please write a custom constructor in the Person class
        // as directed below (in the Person class)

        // now use that new constructor to create two unique Person objects

        Person Payton = new Person("Payton", 25);
        Person Devon = new Person("Devon", 23);

        // now print the instance var values of each object

        System.out.println("The first person's name is " + Payton.name + " and she is " + Payton.age + " years old.");

        System.out.println("The first person's name is " + Devon.name + " and she is " + Devon.age + " years old.");

    }
}

class Person {

    String name;
    int age;

    // please create a fully qualified constructor
    // (which is a constructor that takes in "name" and "age")
    // and set the instance variables above from within the constructor

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

}
