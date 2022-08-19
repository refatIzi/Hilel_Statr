package alishev;

import java.util.ArrayList;
import java.util.List;

public class Ceneriks {
    public static void main(String[] args) {
        List animals=new ArrayList<>();
        Animal dog=new Animal("dog");
        Animal cat=new Animal("cat");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Frog");
        animals.add(dog);
        animals.add(cat);
        String animal=animals.get(3).toString();
        //System.out.println(animal);
        for (Object a:animals){
                System.out.println(a);
        }

    }
}
class Animal{
    private String animal;
    public Animal(String animal){
        this.animal=animal;
    }
    public void setAnimal(String animal){
        this.animal=animal;
    }
    public String toString(){
        return animal;
    }
}
