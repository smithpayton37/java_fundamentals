package labs_examples.objects_classes_methods.labs.classes;

public class Wolf {

    int weight;
    String species;
    String denLocation;

    @Override
    public String toString() {
        return "Wolf{" +
                "weight=" + weight +
                ", species='" + species + '\'' +
                ", denLocation='" + denLocation + '\'' +
                '}';
    }
}

class WolfPack {

    Wolf[] wolves = new Wolf[10];

}

class Demo {

    public static void main(String[] args) {

        Wolf w1 = new Wolf();
        w1.weight = 150;
        w1.species = "Gray Wolf";
        w1.denLocation = "Under Log";

        Wolf w2 = new Wolf();
        w2.weight = 190;
        w2.species = "Arctic Wolf";
        w2.denLocation = "Under Rock";

        WolfPack pack = new WolfPack();
        pack.wolves[0] = w1;
        pack.wolves[1] = w2;

        surveyWolfPack(pack);

    }

    public static void surveyWolfPack(WolfPack wolfPack){

        for(Wolf w : wolfPack.wolves) {
            System.out.println(w.toString());

        }

    }

}
