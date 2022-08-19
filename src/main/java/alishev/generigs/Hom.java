package alishev.generigs;

import java.util.ArrayList;
import java.util.List;

public class Hom {
    public static void main(String[] args) {
        List list=new ArrayList();
        Dog dog=new Dog("Rex");
        Cat cat=new Cat("Barsik");
        list.add(dog);
        list.add(cat);
        for (Object a:list){
            System.out.println(a);
        }
    }
}
