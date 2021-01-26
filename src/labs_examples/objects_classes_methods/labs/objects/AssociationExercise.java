package labs_examples.objects_classes_methods.labs.objects;

class Vehicle{

    String make;
    String model;
    Vehicle(String make, String model){
        this.make = make;
        this.model = model;
    }

}

class Person{

    String name;
    Person(String name){
        this.name = name;
    }

}

class Association{
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("GMC","Sierra 2500HD Denali");
        Person person = new Person("Payton");

        System.out.println(person.name + " drives a " + vehicle.make + " " + vehicle.model + ".");

    }
}
