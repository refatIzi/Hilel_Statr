package homwork.homework7;

import homwork.homework7.test.Animals;

public class Anonymous {
    public static void main(String[] args) {
        Animals animals = new Animals() {
            @Override
            public String showInfo() {
                return getName() + " want to drink. It is " + getAge() + " years old.";
            }
        };
        animals.setName("Rex");
        animals.setAge(6);
        System.out.println(animals.showInfo());

    }
}
