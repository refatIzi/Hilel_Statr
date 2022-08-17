package HomeWork6.forest;

public class Tree {
    private String who;

    public Tree(String who) {
        this.who = who;
    }

    public void walking() {
        System.out.println(this.who + " гуляет по лесу");
    }

    public void hide() {
        System.out.println(this.who + " прячется в лесу");
    }

    protected void gotLost() {
        System.out.println(this.who + " потерялся!");
    }
}
