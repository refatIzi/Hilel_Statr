package homwork.homework7.test;

public class Dog extends Animals{
    private String want;
    public Dog(){
        super("no name");
    }
    public Dog(String name) {
        super(name);
    }

    public void setWant(String want){
        this.want=want;
    }
    public String getWant(){
        return want;
    }
}
