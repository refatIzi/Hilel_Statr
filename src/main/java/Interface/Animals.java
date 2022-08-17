package Interface;

public class Animals extends Thread {
    private String name;
    private int age;
    Information information;
    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animals(World object, String name, int age) {
    information=object;
    }
    public void run(){
        int a=0;
        while (true){
        try {
            Thread.sleep(400);
            information.animalsMessage("Есть");
            a++;
            if(a==10)break;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }}
    }

}