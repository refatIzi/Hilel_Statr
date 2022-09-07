package homwork.homwork9;

public class Cat extends Animals {
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

    @Override
    public void showSound() {
        System.out.println("Дай поесть");
    }

    public Cat(String name, int age, String character, String favoriteFood) {
        super(name, age);
        this.character = character;
        this.favoriteFood = favoriteFood;
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
}
