package org.example.company.arge;

public class GasPoweredCar extends CarSkeleton {

    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLiter, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public void setAvgKmPerLiter(double avgKmPerLiter) {
        this.avgKmPerLiter = avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public String startEngine() {
        return getName() + " gas engine started.";
    }

    @Override
    public String drive() {
        return getName() + " is being driven.";
    }

    @Override
    protected void runEngine(CarSkeleton carSkeleton) {
        System.out.println("Gas engine is running.");
    }
}
