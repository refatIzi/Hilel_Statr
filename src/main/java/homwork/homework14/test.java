package homwork.homework14;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        MyList<People> list = new MyArraylist();
        System.out.println("Start");
        list.add(new People("Maks"));
        list.add(new People("Rifat"));
        list.add(new People("Yorick"));
        list.add(new People("Den"));
        list.show();
        System.out.println("Size " + list.size());
        list.remove(2);
        System.out.println("Remove " + 2);
        list.show();
        System.out.println("Size " + list.size());
        list.add(new People("Emma"));
        list.add(new People("Deniz"));
        list.add(new People("Keti"));
        list.add(new People("Robert"));
        list.show();
        System.out.println("Size " + list.size());
        System.out.println("Show object " + list.get(4));
        System.out.println("Clear ");
        list.clear();
        list.show();
        System.out.println("Size " + list.size());
        //List a=new ArrayList<>();

    }
}
