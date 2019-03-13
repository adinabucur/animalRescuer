package org.fasttrackit;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal("Puffy");
        //  animal.name = "Puffy";
        animal.setAge(10);
        animal.setHealthLevel(9);
        animal.setHungerLevel(7);
        animal.setMoodLevel(6);
        animal.setFavoriteFood("Whiskas");
        animal.setRecreationalActivity("play");


        Adopter adopter = new Adopter("Ioana");
        //adopter.name = "Ioana";
        adopter.setAvailableAmountOfMoney(100);



        Food food = new Food("Friskies");
        //food.name = "Friskies";
        food.price = 15.50;
        food.quantity = 10;
        food.availability = true;


        adopter.feed(animal, food);

        RecreationalActivity recreationalActivity = new RecreationalActivity();
        recreationalActivity.name = "play";
        recreationalActivity.durationActivity = 10;

        adopter.doRelaxingActivity(animal, recreationalActivity);

        Veterinarian veterinarian = new Veterinarian("Mihai");
        //veterinarian.name = "Mihai";
        veterinarian.setSpecialization("surgery");

        Cats cats = new Cats("Piky", "white");
        // cats.name = "Piky";
        cats.setHealthLevel(8);
        cats.setHungerLevel(5);
        cats.setMoodLevel(9);
        cats.setFavoriteFood("Abc");
        // cats.colorOfSkin = "white";
        cats.setRecreationalActivity("play");

        Dogs dogs = new Dogs("Cdef", "Teddy Bear");
        //dogs.name = "Cdef";
        //dogs.favoriteToy = "Teddy Bear";


    }
}
