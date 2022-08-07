package alishev;

public class Class_and_Fun {
    public static void main(String[] args) {
        Information person1 = new Information("Лиля", "Заболотна", 25);
        person1.showInfo();
        System.out.println("######################################################");
        System.out.println(person1.CalculationYearsToRetirement() + " лет осталось до пенсии ");
        System.out.println("######################################################");

        Information person2 = new Information();
        person2.showInfo();
        System.out.println("######################################################");

        person2.setFirstName("Лиля");
        person2.setLastName("Загребелная");
        person2.setAge(26);
        person2.showInfo();
        System.out.println(person2.CalculationYearsToRetirement() + " лет осталось до пенсии ");
        System.out.println("######################################################");

        System.out.println("Name " + person2.getFirstName());
        System.out.println("last Name " + person2.getLastName());
        System.out.println("Age " + person2.getAge());


    }
}

class Information {
    private String firstName;
    private String lastName;
    private int age;

    public Information() {
        this.firstName = "Безимянный";
        this.lastName = "Безфамильный";
        this.age = 666;

    }

    public Information(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 666;

    }


    public Information(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public void setFirstName(String firstName) {
        if (firstName.isEmpty()) {
            System.out.println("Ты ввел путсое поле");
            this.firstName = "Безимянный";
        } else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (firstName.isEmpty()) {
            System.out.println("Ты ввел путсое поле");
            this.lastName = "Безфамильный";

        } else {
            this.lastName = lastName;
        }
    }

    public void setAge(int age) {
        if (age == 0) {
            System.out.println("Ты ввел путсое поле");
            this.age = 666;

        } else {
            this.age = age;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    public void showInfo() {
        // for (int i = 0; i < 4; i++)
        System.out.println(firstName + " " + lastName + " age " + age);
    }

    public int CalculationYearsToRetirement() {
        return 65 - age;
    }
}