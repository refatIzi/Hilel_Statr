package homwork.homework8;

interface Animal {
    public void ead();
}

class Animals implements Animal {

    @Override
    public void ead() {
        System.out.println("I want Eat");
    }
}

public class Test {
    public static void main(String[] args) {
        Animals animals1 = new Animals();
        animals1.ead();

        Animals animals2 = new Animals() {
            @Override
            public void ead() {
                System.out.println("You want Eat");
            }
        };
        animals2.ead();
        Animal animal1 = new Animal() {
            @Override
            public void ead() {
                System.out.println("We want Eat");
            }
        };
        animal1.ead();
        Animal animal2 = new Animals() {
            @Override
            public void ead() {
                System.out.println("They want Eat");

            }
        };
        animal2.ead();

    }
}
