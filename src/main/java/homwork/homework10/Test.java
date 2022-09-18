package homwork.homework10;

public class Test {
    public static void main(String[] args) {
        Animals animals = Animals.DOG;
        switch (animals) {
            case CAT -> System.out.println("CAT Это " + animals);
            case DOG -> System.out.println("DOG Это " + animals);
            case FROG -> System.out.println("FROG Это " + animals);
            default -> System.out.println("На животное " + animals + " это не похоже");
        }
    }
}
