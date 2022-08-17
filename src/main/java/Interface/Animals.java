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
        information = object;
        this.name = name;
        this.age = age;
    }

    public void run() {
        int a = 0;
        while (true) {
            try {
                Thread.sleep(400);
                information.animalsMessage(this.name, "Есть");
                a++;
                if (a == 10) {
                    information.peopleMessage(this.name);
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}