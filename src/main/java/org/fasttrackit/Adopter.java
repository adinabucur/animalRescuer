package org.fasttrackit;

public class Adopter {
    String name;
    int availableAmountOfMoney;

    public void feed(Animal animal, Food food) {

        System.out.println(name +" just gave some " + food.name + " food to " + animal.name);

        /* System.out.println(String.format("%s just gave some %s food to %s", name, food.name, animal.name)); */

    }

    public void doRelaxingActivity (Animal animal, RecreationalActivity recreationalActivity){
        System.out.println(name + " " + recreationalActivity.name + " with " + animal.name  );

        /*System.out.println(String.format("%s %s with %s", name, animal.recreationalActivity, animal.name));*/
    }
}
