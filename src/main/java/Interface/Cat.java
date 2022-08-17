package Interface;

import alishev.Animals;

public class Cat extends Animals implements Information {
    private String character;
    private String favoriteFood;

    public Cat() {
        super(null, 0);
        character = "No Name";
        favoriteFood = "no favorite food";
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name, int age, String character, String favoriteFood) {
        super(name, age);
        this.character = character;
        this.favoriteFood = favoriteFood;
    }

    protected void gotLost() {
        System.out.println("got lost!");
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getCharacter() {
        return character;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String toString() {
        return getName() + "," + getAge() + "," + character + "," + favoriteFood;
    }

    @Override
    public void animalsMessage(String name, String message) {
        System.out.println(name + " дай покушать " + message);
    }

    @Override
    public void peopleMessage(String name) {
        System.out.println(name + " я еще хочу!!!");
    }

    protected void showMe() {
        System.out.println("Он спит в лесу");
    }
}
