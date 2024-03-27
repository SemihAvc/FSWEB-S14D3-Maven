package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        super.startEngine();
        return getName();
    }

    @Override
    public String accelerate() {
        super.accelerate();
        return getName();
    }

    @Override
    public String brake() {
        super.brake();
        return getName();
    }
}
