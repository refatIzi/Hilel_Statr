package Interface;

import hillel.Main;

public class World implements Information {
    public static void main(String[] args) {
        World world = new World();
        Animals animals = new Animals(world, "Bob", 5);
        animals.run();
        Information cat=new Cat();
        cat.animalsMessage("Колян","еще");

    }

    public void animalsMessage(String name, String message) {
        System.out.println("Животное " + name + " хочет " + message);
    }

    public void peopleMessage(String name) {
        System.out.println("Человек покормил " + name + "a");
    }
}
