package alishev.generigs;

public class Dog extends Animals{
    private String dog;

    public Dog(String dog) {
        super(dog);
        this.dog = dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }
    public String getDog(){
        return dog;
    }
}

