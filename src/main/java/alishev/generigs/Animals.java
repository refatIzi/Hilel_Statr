package alishev.generigs;

public class Animals {
    private String name;
    public Animals(String name){
        this.name=name;
    }
    public String eat(){
        return name+ " want eat";
    }
    public String sleep(){
        return name+" want sleep";
    }
}
