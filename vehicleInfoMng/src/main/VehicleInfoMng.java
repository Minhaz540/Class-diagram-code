package main;

import Bike.Bike;
import car.Car;

public class VehicleInfoMng {

    public static void main(String[] args) {
        System.out.println("<------First object for car------->");
        Car car1 = new Car(8, 4, "Volvo", "3HA56", "red", 50, 122.3);
        car1.show();
        System.out.println("<------Second object for car------->");
        Car car2 = new Car(10, 6,"TATA", "1H3HA56", "black", 40, 152.9);
        car2.show();
        System.out.println("\n<--------First object for bike------->");
        Bike bike1 = new Bike("Rim break ", "Honda", "43pg-13", "Blue", 300, 230.34);
        bike1.show();
        System.out.println("<---------Second object for bike------->");
        Bike bike2 = new Bike("Disk break ", "TATA", "3pg-13", "Red", 340, 260.34);
        bike2.show();
    }
    
}
