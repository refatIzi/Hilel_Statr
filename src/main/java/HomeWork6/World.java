package HomeWork6;

import HomeWork6.forest.Tree;

public class World implements Information {
    public static void main(String[] args) {

        World world = new World();
        /**клас Animals наследует от Thread мы его вобьявляем и передеаем пареметры*/
        Animals animals = new Animals(world, "Рекс", 5);
        animals.start();
        animals.gotLost();
        test(animals);

        /**Клас Cat я имплеметрировал тоже
                кторый имеет тоже методы animalsMessage и peopleMessage*/
        Information cat = new Cat();
        cat.animalsMessage("Колян", "еще");
        cat.peopleMessage("Колян");

        /**тут я просто обьявил клас Cat который наследует от Animals, а Animals от Thread*/
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
