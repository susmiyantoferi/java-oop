package project.source.application;

import project.source.anotation.Fancy;
import project.source.data.Animal;
import project.source.data.Cat;

@Fancy(name = "AnimalApp", tags = {"animal", "application"})
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();

        animal.name = "Milo";
        animal.cat();
    }
}
