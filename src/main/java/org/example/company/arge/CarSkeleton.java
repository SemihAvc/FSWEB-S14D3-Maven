package org.example.company.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine() {
        return getName() + " engine started.";
    }

    public String drive() {
        return getName() + " is being driven.";
    }

    protected void runEngine(CarSkeleton carSkeleton) {
        if (carSkeleton instanceof ElectricCar) {

            double kmPerCharge = ((ElectricCar)carSkeleton).getAvgKmPerCharge();
            double batterySize =  ((ElectricCar)carSkeleton).getBatterySize();
            System.out.println("Running electric engine. Avg km per charge: " + kmPerCharge + ", Battery size: " + batterySize);
        } else if (carSkeleton instanceof HybridCar) {
            HybridCar hybridCar = ((HybridCar) carSkeleton);


        } else if (carSkeleton instanceof GasPoweredCar) {
            GasPoweredCar gasPoweredCar = (GasPoweredCar) carSkeleton;

        }
    }
}
