package Interface;

import hillel.Main;

public class World implements Information{
    public static void main(String[] args) {
        World world=new World();
        Animals animals=new Animals(world,"",5);
        animals.run();

    }
    public void animalsMessage(String message){
        System.out.println("Животное хочет "+message);
    }
}
