package homwork.homwork9;

public abstract class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object object) {
        Animals animals = (Animals) object;
        return this.name == animals.name && this.age == animals.age;
    }

    public abstract void showSound();

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + "," + age;
    }
}