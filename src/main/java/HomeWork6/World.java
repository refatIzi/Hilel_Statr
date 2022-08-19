package HomeWork6;

import HomeWork6.forest.Tree;

public class World implements Information {
    public static void main(String[] args) {

        World world = new World();
        Animals animals = new Animals(world, "Рекс", 5);
        animals.start();
        animals.gotLost();
        test(animals);

        System.out.println("--------------------------");
        Information cat = new Cat();
        cat.animalsMessage("Колян", "еще");
        cat.peopleMessage("Колян");

        System.out.println("--------------------------");

        Cat cat1 = new Cat(world, "Мурка", 5);
        cat1.start();

        System.out.println("--------------------------");
        test(cat1);

        System.out.println();
        Tree tree = new Tree("Белка");
        tree.walking();
        tree.hide();
        System.out.println("--------------------------");


    }

    public void animalsMessage(String name, String message) {
        System.out.println("Животное " + name + " хочет " + message);
    }

    public void peopleMessage(String name) {
        System.out.println("Человек покормил " + name + "a");
    }

    public void myMethod() {
        System.out.println("Мой метод");
    }

    public static void test(Animals animals) {
        animals.sleep();
    }
}
