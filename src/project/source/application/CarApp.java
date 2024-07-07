package project.source.application;

import project.source.data.Car;
import project.source.data.Toyota;

public class CarApp {
    public static void main(String[] args) {

        //ENKAPSULATION
        Car car = new Toyota();

        car.jalan();
        System.out.println("get tier is " + car.getTier());

        System.out.println("brand is " + car.brand());
        System.out.println("maintenance is " + car.isMaintenance());

    }
}
