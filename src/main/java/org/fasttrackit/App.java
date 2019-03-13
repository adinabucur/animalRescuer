package org.fasttrackit;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal("Puffy");
        //  animal.name = "Puffy";
        animal.age = 10;
        animal.healthLevel = 9;
        animal.hungerLevel = 7;
        animal.moodLevel = 6;
        animal.favoriteFood = "Whiskas";
        animal.recreationalActivity = "play";


        Adopter adopter = new Adopter("Ioana");
        //adopter.name = "Ioana";
        adopter.availableAmountOfMoney = 100;



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
        veterinarian.specialization = "surgery";

        Cats cats = new Cats("Piky", "white");
        // cats.name = "Piky";
        cats.healthLevel = 8;
        cats.hungerLevel = 5;
        cats.moodLevel = 9;
        cats.favoriteFood = "Abc";
        // cats.colorOfSkin = "white";
        cats.recreationalActivity = "play";

        Dogs dogs = new Dogs("Cdef", "Teddy Bear");
        //dogs.name = "Cdef";
        //dogs.favoriteToy = "Teddy Bear";


    }
}
