package HomeWork6;

import HomeWork6.forest.Tree;

public class World implements Information {
    public static void main(String[] args) {

        World world = new World();
        Animals animals = new Animals(world, "Bob", 5);
        animals.run();
        animals.gotLost();


        Information cat = new Cat();
        cat.animalsMessage("Колян", "еще");
        cat.peopleMessage("Колян");

        Tree tree = new Tree("Bob");
        tree.walking();
        tree.hide();





    }

    public void animalsMessage(String name, String message) {
        System.out.println("Животное " + name + " хочет " + message);
    }

    public void peopleMessage(String name) {
        System.out.println("Человек покормил " + name + "a");
    }
    public void myMethod(){
        System.out.println("Мой метод");
    }
}
