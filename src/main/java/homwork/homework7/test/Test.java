package homwork.homework7.test;

public class Test {
    public static void main(String[] args) {
        //восходяшее пероброзование
        Animals dog=new Dog();
        dog.setName("Rex");
        System.out.println(dog.getName());
        //нисходяшее преоброзование
        //Animals animals=new Animals();
       // Dog dog1= (Dog) animals;// нельзя преоброзовать Animals в Dog будет ошибка
        Dog dog1= (Dog) dog;
        dog1.setName("Pex");
        System.out.println(dog.getName());

    }
}
