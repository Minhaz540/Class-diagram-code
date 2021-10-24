package common;

public class Vehicle {
    protected String company, model, color;

    public Vehicle(String company, String model, String color) {
        this.company = company;
        this.model = model;
        this.color = color;
    }
    
    public void showVehicleInfo() {
        System.out.println("Company: "+company+" Model: "+model+" Color: "+color);
    }
    
}
