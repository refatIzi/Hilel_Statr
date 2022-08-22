package homwork.homework7;

import homwork.homework7.test.Animals;
import homwork.homework7.test.Dog;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        List<Animals> list = new ArrayList<>();
        list.add(new Animals("Sirius"));
        list.add(new Animals("Arcturus"));
        list.add(new Animals("Altair"));
        list.add(new Animals("Aldebaran"));
        list.add(new Animals("Rigel"));
        list.add(new Animals("Betelgeuse"));
        System.out.println("[Animals]");
        show(list);
        List<Dog> list1 = new ArrayList<>();
        list1.add(new Dog("Eat"));
        list1.add(new Dog("Drink"));
        list1.add(new Dog("Walk"));
        list1.add(new Dog("Sleep"));
        System.out.println("[Dog]");
        show(list1);
    }

    public static void show(List<? extends Animals> list) {
        for (Animals animals : list) {
            System.out.println("        " + animals.getName());
        }
    }
}
