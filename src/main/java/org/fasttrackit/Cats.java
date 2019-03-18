package org.fasttrackit;

public class Cats extends Animal {

   private String colorOfSkin;

    @Override
    public void mood() {
        System.out.println(getName()+ " is purring ");
    }

    public String getColorOfSkin() {
        return colorOfSkin;
    }

    public void setColorOfSkin(String colorOfSkin) {
        this.colorOfSkin = colorOfSkin;
    }

    public Cats(String name, String colorOfSkin) {
        super(name);
        this.colorOfSkin = colorOfSkin;
    }
}
