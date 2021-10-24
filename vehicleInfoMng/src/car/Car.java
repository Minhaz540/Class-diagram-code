package car;

import common.Engine;
import common.Vehicle;

public class Car extends Vehicle {
    private int numOfSeat, numOfDoors;
    private Engine engine = new Engine();
    public Car(int numOfSeat, int numOfDoors, String company, String model, String color, int numOfCc, double numOfMileAge) {
        super(company, model, color);
        this.numOfSeat = numOfSeat;
        this.numOfDoors = numOfDoors;
        engine.setMileage(numOfMileAge);
        engine.setNumOfCc(numOfCc);
    }

    public void show() {
        System.out.println("Number of seat: "+numOfSeat+" Number of doors: "+numOfDoors);
        super.showVehicleInfo();
        engine.showEngineInfo();
    }
    
}
