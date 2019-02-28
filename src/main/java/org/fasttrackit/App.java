package org.fasttrackit;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Puffy";
        animal.age = 10;
        animal.healthLevel = 9;
        animal.hungerLevel = 7;
        animal.moodLevel = 6;
        animal.favoriteFood = "Whiskas";
        animal.recreationalActivity = "play";


        Adopter adopter = new Adopter();
        adopter.name = "Ioana";
        adopter.availableAmountOfMoney = 100;


        Food food = new Food();
        food.name = "Friskies";
        food.price = 15.50;
        food.quantity = 10;
        food.availability = true;

        adopter.feed(animal, food);

        RecreationalActivity recreationalActivity = new RecreationalActivity();
        recreationalActivity.name = "play";
        recreationalActivity.durationActivity = 10;

        adopter.doRelaxingActivity(animal, recreationalActivity);

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.name = "Mihai";
        veterinarian.specialization = "surgery";

        Cats cats = new Cats();
        cats.name = "Piky";
        cats.healthLevel = 8;
        cats.hungerLevel = 5;
        cats.moodLevel = 9;
        cats.favoriteFood = "Abc";
        cats.colorOfSkin = "white";
        cats.recreationalActivity = "play";

        Dogs dogs = new Dogs();
        dogs.name = "Cdef";
        dogs.favoriteToy = "Teddy Bear";


    }
}
