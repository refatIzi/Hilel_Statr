package HomeWork6.forest;

public class Tree {
    private String who;
    public Tree(String who){
        this.who=who;
    }
    public void walking(){
        System.out.println(this.who+" walking in the forest");
    }
    public void hide(){
        System.out.println(this.who+" hiding in the forest");
    }
    protected void gotLost(){
        System.out.println(this.who+" got lost!");
    }
}
