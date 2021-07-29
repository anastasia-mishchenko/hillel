package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {

        Driver driverFerrari = new Driver("Ivan",30,5);
        Driver driverLorry = new Driver("Misha",32,6);
        Engine engineFerrari = new Engine(7,"starCompany");
        Engine engineLorry = new Engine(5, "companyX");



        Lorry lorry1 = new Lorry("Gas","A",100,driverLorry,engineLorry,7);
        SportCar Ferrari = new SportCar("Ferrari","B",400,driverFerrari,engineFerrari);

        System.out.println(lorry1);
        System.out.println(Ferrari);
    }
}
