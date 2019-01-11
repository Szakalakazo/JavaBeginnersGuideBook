package p07_inheritance;

class VehicleTest {
    private int passengers;
    private double lkm;
    private int fuelCap;

    VehicleTest(int passengers, int fuelCap, double lkm) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.lkm = lkm;
    }

    int range() {
        return (int) (fuelCap / 100 * lkm);
    }

    double fuelNeeded(int km) {
        return (double) km / 100 * lkm;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getLkm() {
        return lkm;
    }

    public void setLkm(double lkm) {
        this.lkm = lkm;
    }

    public int getFuelCap() {
        return fuelCap;
    }

    public void setFuelCap(int fuelCap) {
        this.fuelCap = fuelCap;
    }
}

class TruckTest extends VehicleTest {
    private int cargoCap;

    TruckTest(int passengers, int fuelCap, double lkm, int cargoCap) {
        super(fuelCap, passengers, lkm);
        this.cargoCap = cargoCap;
    }

    int getCargo(){
        return cargoCap;
    }

    void setCargo(int cargoCap){
        this.cargoCap = cargoCap;
    }
}


public class TruckDemoTest {

    public static void main(String[] args) {

        TruckTest semi = new TruckTest(2,200,25,4);
        TruckTest pickup =new TruckTest(3,55,5,1);
        double liters;
        int dist = 300;



        System.out.println("CargoLoad of semitruck is " + semi.getCargo() + " tons.");
        System.out.println("To reach " + dist + " km of distance it needs " + semi.fuelNeeded(dist) + " of fuel.");


        System.out.println("CargoLoad of pickup is " + pickup.getCargo() + " tons.");
        System.out.println("To reach " + dist + " km of distance it needs " + pickup.fuelNeeded(dist) + " of fuel.");



    }
}
