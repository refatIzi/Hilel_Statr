package alishev;

public class Class_and_Object {
    public static void main(String[] args) {
        Info infoA = new Info();
        infoA.firstName = "Вадим";
        infoA.lastName = "Незабутній";
        infoA.age = 30;
        Info infoB = new Info();
        infoB.firstName = "Лиля";
        infoB.lastName = "Заболотна";
        infoB.age = 25;
        System.out.println("My Name " + infoA.firstName + " " + infoA.lastName + " age " + infoA.age);
        System.out.println("My Name " + infoB.firstName + " " + infoB.lastName + " age " + infoB.age);

    }
}

class Info {
    String firstName;
    String lastName;
    int age;
}
