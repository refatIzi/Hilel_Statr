package alishev;

public class Class_and_Fun {
    public static void main(String[] args) {
        Information information = new Information("Лиля", "Заболотна", 25);
        information.showInfo();

    }
}

class Information {
    private String firstName;
    private String lastName;
    private int age;

    public Information(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public void showInfo() {
        for (int i = 0; i < 4; i++)
            System.out.println("My Name " + firstName + " " + lastName + " age " + age);
    }
}