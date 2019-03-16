package org.fasttrackit;

public class Dogs extends Animal {

   private String favoriteToy;

    @Override
    public String mood(String moodLevel) {
        return super.mood(moodLevel);
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    public Dogs(String name, String favoriteToy) {
        super(name);
        this.favoriteToy = favoriteToy;


    }
}
