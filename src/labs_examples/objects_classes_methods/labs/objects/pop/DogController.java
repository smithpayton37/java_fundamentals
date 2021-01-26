package labs_examples.objects_classes_methods.labs.objects.pop;

public class DogController {

    public static void main(String[] args) {

        Dog dog1 = new Dog("German Shepherd", 5, "Black");
        Dog dog2 = new Dog("Staffy", 1, "Fawn");

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

    }

}
