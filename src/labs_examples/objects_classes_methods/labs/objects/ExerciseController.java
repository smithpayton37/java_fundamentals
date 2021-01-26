package labs_examples.objects_classes_methods.labs.objects;

public class ExerciseController {
    public static void main(String[] args) {
        Animal tiger = new Animal("tiger", "orange");
        System.out.println("Payton likes this animal: " + tiger.species);
        System.out.println(tiger.toString());

        Animal wolf = new Animal("gray");
        System.out.println("Payton likes this animal: " + wolf.species);
        System.out.println(wolf.toString());

        Animal lizard = new Animal();
        System.out.println("Payton likes this animal: " + lizard.species);
        System.out.println(lizard.toString());
    }
}

class Animal{
    String species;
    String color;

    Animal(String species, String color){
        this.species = species;
        this.color = color;
    }

    Animal(String color){
        this.species = "wolf";
        this.color = color;
    }

    public Animal() {
        this.species = "lizard";
        this.color = "yellow";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
