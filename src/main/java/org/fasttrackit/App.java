package org.fasttrackit;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name= "Puffy";
        animal.age = 10;
        animal.healthLevel = 9;
        animal.hungerLevel = 7;
        animal.moodLevel = 6;
        animal.favoriteFood = "Whiskas";
        animal.recreationalActivity="play";

        Adopter adopter = new Adopter();
        adopter.name = "Ioana";
        adopter.availableAmountOfMoney = 100;

        Food food = new Food();
        food.name = "Friskies";
        food.price = 15.50;
        food.quantity = 10;
        food.availability = true;

        ReacreationalActivity recreationalActivity = new ReacreationalActivity();
        recreationalActivity.name = "play";

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.name = "Mihai";
        veterinarian.specialization = "surgery";





    }
}
