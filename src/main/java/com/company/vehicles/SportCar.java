package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    double speed;

    public SportCar(String marka, String carClass, int weight, Driver driver, Engine engine) {
        super(marka, carClass, weight, driver, engine);
    }




    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }


    @Override
    public String toString() {
        return "SportCar{" +
                "marka='" + marka + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                ", speed=" + speed +
                '}';
    }
}
