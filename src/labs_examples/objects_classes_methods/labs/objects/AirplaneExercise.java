package labs_examples.objects_classes_methods.labs.objects;

class AirplaneExercise{

    public static void main(String[] args) {

        Engines engines = new Engines(4);
        Pilots pilots = new Pilots(2);
        Seats seats = new Seats(150, "cloth");
        Cabins cabins = new Cabins(3);
        Airplane airplane = new Airplane(engines, pilots, seats, cabins, 300, .5);

        System.out.println("Last week, I flew on an airplane with " + airplane.engines.engineQuantity + " engines, " + airplane.pilots.pilotQuantity + " pilots, " + airplane.seats.seatQuantity + " seats made of " + airplane.seats.material + ", and " + airplane.cabins.cabinQuantity + " cabins. It had a fuel capacity of " + airplane.fuelCapacity + " gallons, and by the end of the trip its current fuel level was " + airplane.currentFuelLevel + ".");

        System.out.println(engines.toString());
        System.out.println(pilots.toString());
        System.out.println(seats.toString());
        System.out.println(cabins.toString());
        System.out.println(airplane.toString());

    }

}

class Engines{

    int engineQuantity;

    Engines(int engineQuantity){

        this.engineQuantity = engineQuantity;

    }

    @Override
    public String toString() {
        return "Engines{" +
                "engineQuantity=" + engineQuantity +
                '}';
    }
}

class Pilots{

    int pilotQuantity;

    Pilots(int pilotQuantity){

        this.pilotQuantity = pilotQuantity;

    }

    @Override
    public String toString() {
        return "Pilots{" +
                "pilotQuantity=" + pilotQuantity +
                '}';
    }
}

class Seats{

    double seatQuantity;
    String material;

    Seats(double seatQuantity, String material){

        this.seatQuantity = seatQuantity;
        this.material = material;

    }

    @Override
    public String toString() {
        return "Seats{" +
                "seatQuantity=" + seatQuantity +
                ", material='" + material + '\'' +
                '}';
    }
}

class Cabins{

    int cabinQuantity;

    Cabins(int cabinQuantity){

        this.cabinQuantity = cabinQuantity;

    }

    @Override
    public String toString() {
        return "Cabins{" +
                "cabinQuantity=" + cabinQuantity +
                '}';
    }
}

class Airplane{

    Engines engines;
    Pilots pilots;
    Seats seats;
    Cabins cabins;

    double fuelCapacity;
    double currentFuelLevel;

    Airplane(Engines engines, Pilots pilots, Seats seats, Cabins cabins, double fuelCapacity, double currentFuelLevel){

        this.engines = engines;
        this.pilots = pilots;
        this.seats = seats;
        this.cabins = cabins;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;

    }

    @Override
    public String toString() {
        return "Airplane{" +
                "\nengines=" + engines +
                ", \npilots=" + pilots +
                ", \nseats=" + seats +
                ", \ncabins=" + cabins +
                ", \nfuelCapacity=" + fuelCapacity +
                ", \ncurrentFuelLevel=" + currentFuelLevel +
                '}';
    }
}
