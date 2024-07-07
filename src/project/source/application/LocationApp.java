package project.source.application;

import project.source.data.City;

public class LocationApp {
    public static void main(String[] args) {
        City city = new City();

        city.name = "Banyuwangi";
        System.out.println("alamat " + city.name);
    }
}
