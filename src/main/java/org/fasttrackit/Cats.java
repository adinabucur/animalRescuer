package org.fasttrackit;

public class Cats extends Animal {

   private String colorOfSkin;

    @Override
    public String mood(String moodLevel) {
        return super.mood(moodLevel);
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
