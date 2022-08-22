package homwork.homework7.test;

public class Animals {

    private String  name;
    int age;
    public Animals(){
        name="No Name";
    }

    public Animals(String name){
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public String showInfo(){
        return name+" want tp sleep";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
