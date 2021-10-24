package common;

public class Engine {
    private int numOfCc;
    private double mileage;

    public int getNumOfCc() {
        return numOfCc;
    }

    public void setNumOfCc(int numOfCc) {
        this.numOfCc = numOfCc;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    
    public void showEngineInfo() {
        System.out.println("Number of CC: "+getNumOfCc()+" Mileage: "+getMileage());
    }
}
