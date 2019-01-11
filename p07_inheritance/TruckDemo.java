package p07_inheritance;

class Vehicle {
    private int passengers;
    private int fuelCap;
    private double lkm;

    Vehicle(int p, int f, double l) {
        passengers = p;
        fuelCap = f;
        lkm = l;
    }

    int range() {
        return (int) (fuelCap / 100 * lkm);
    }

    double fuelNeeded(int km) {
        return (double) km / 100 * lkm;
    }

    int getPassengers() {
        return passengers;
    }

    int getFuelCap() {
        return fuelCap;
    }

    double getLkm() {
        return lkm;
    }

    void setPassengers(int p) {
        passengers = p;
    }

    void setFuelCap(int f) {
        fuelCap = f;
    }

    void setLkm(double l) {
        lkm = l;
    }
}

class Truck extends Vehicle {
    private int cargoCap;

    Truck(int p, int f, double l, int cargoCap) {
        super(f, p, l);
        this.cargoCap = cargoCap;
    }

    int getCargo(){
        return cargoCap;
    }

    void setCargo(int cargoCap){
        this.cargoCap = cargoCap;
    }
}


public class TruckDemo {

    public static void main(String[] args) {

        Truck semi = new Truck(2,200,25,4);
        Truck pickup =new Truck(3,55,5,1);
        double liters;
        int dist = 300;



        System.out.println("CargoLoad of semitruck is " + semi.getCargo() + " tons.");
        System.out.println("To reach " + dist + " km of distance it needs " + semi.fuelNeeded(dist) + " of fuel.");


        System.out.println("CargoLoad of pickup is " + pickup.getCargo() + " tons.");
        System.out.println("To reach " + dist + " km of distance it needs " + pickup.fuelNeeded(dist) + " of fuel.");



    }
}
