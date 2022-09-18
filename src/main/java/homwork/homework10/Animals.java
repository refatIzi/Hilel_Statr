package homwork.homework10;

public enum Animals {
    CAT("КОШКА"),DOG("СОБАКА"),FROG("ЛЯГУШКА");
    public String translate;

    Animals(String translate){
        this.translate=translate;
    }
    public String toString(){
        return translate;
    }
}
