package org.fasttrackit;

public class Adopter {

    private String name;
    private int availableAmountOfMoney;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailableAmountOfMoney() {
        return availableAmountOfMoney;
    }

    public void setAvailableAmountOfMoney(int availableAmountOfMoney) {
        this.availableAmountOfMoney = availableAmountOfMoney;
    }

    public Adopter(String name) {
        this.name = name;
    }

    public void feed(Animal animal, Food food) {

        System.out.println(name +" just gave some " + food.name + " food to " + animal.getName());

        /* System.out.println(String.format("%s just gave some %s food to %s", name, food.name, animal.name)); */

    }

    public void doRelaxingActivity (Animal animal, RecreationalActivity recreationalActivity){
        System.out.println(name + " " + recreationalActivity.name + " with " + animal.getName()  );

        /*System.out.println(String.format("%s %s with %s", name, animal.recreationalActivity, animal.name));*/
    }
}
