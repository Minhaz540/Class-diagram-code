package Bike;
import common.Engine;
import common.Vehicle;

public class Bike extends Vehicle {
    private String breakType;
    private Engine engine2 = new Engine();
    public Bike(String breakType, String company, String model, String color, int numOfCc, double numOfMileAge) {
        super(company, model, color);
        this.breakType = breakType;
        engine2.setMileage(numOfMileAge);
        engine2.setNumOfCc(numOfCc);
    }
    
    public void show() {
        System.out.print("Break-Type: "+breakType);
        super.showVehicleInfo();
        engine2.showEngineInfo();
    }
    
}
