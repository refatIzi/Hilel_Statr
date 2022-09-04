package homwork.homwork9;

import java.io.Serializable;

public class People implements Serializable {
    int id;
    String name;
    People(int id,String name){
        this.id=id;
        this.name=name;
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
    public String toString(){
        return id+" : "+name;
    }
}
