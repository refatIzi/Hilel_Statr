package homwork.homework16;


interface AbleToEat{
    void eat();
}

class ToEat implements AbleToEat{
    public void eat(){
        System.out.println("You want eat");
    }
}

public class Test {
    public static void main(String[] args) {

        AbleToEat ableToEat=new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("I want to eat");
            }
        };
        ableToEat.eat();
        AbleToEat ableToEat1=new ToEat(){
            @Override
            public void eat(){
                System.out.println("You don`t want eat");
            }
        };
        ableToEat1.eat();
    }
}
