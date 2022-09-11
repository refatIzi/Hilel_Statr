package homwork.homework10;

import java.io.Serializable;

public class People implements Serializable {
    int id;
    String name;
    private transient int  age;
    People(int id, String name,int age) {
        this.id = id;
        this.name = name;
        this.age=age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return id + " : " + name+" : "+age;
    }
}
