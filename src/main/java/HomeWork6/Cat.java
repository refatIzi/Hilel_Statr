package HomeWork6;


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
    public Cat(Information information, String name, int age) {
        super(information,name,age);
    }

    public Cat(String name, int age, String character, String favoriteFood) {
        super(name, age);
        this.character = character;
        this.favoriteFood = favoriteFood;
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

    protected void sleep() {
        System.out.println("Кот спит");
    }
}
