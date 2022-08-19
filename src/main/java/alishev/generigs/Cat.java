package alishev.generigs;

public class Cat extends Animals{
    private String cat;
    public Cat(String cat){
        super(cat);
        this.cat=cat;
    }
    public void setCat(String cat){
        this.cat=cat;
    }
    public String getCat(){
        return cat;
    }
}
