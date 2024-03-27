package org.example.company.arge;

public class CarFactory {

    public static void main(String[] args) {
        // Elektrikli araç oluşturma
        ElectricCar electricCar = new ElectricCar("Tesla", "Electric car", 100, 4);
// Corrected method call
        GasPoweredCar gasPoweredCar = null;
        double avgKmPerLiter = gasPoweredCar.getAvgKmPerLiter();

        // Oluşturulan elektrikli aracın davranışlarını test etme
        System.out.println("Electric Car:");
        System.out.println(electricCar.startEngine());
        System.out.println(electricCar.drive());
        System.out.println("Average Km per Charge: " + electricCar.getAvgKmPerCharge());
        System.out.println("Battery Size: " + electricCar.getBatterySize());
    }
}
