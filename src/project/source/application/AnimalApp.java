package project.source.application;

import project.source.data.Animal;
import project.source.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();

        animal.name = "Milo";
        animal.cat();
    }
}
