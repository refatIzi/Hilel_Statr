package homwork.homwork9;

public class Test {

    public static void main(String[] args) {
        Cat murka = new Cat("Barsisk", 6, "evil", "Fish");
        murka.showSound();
        System.out.println(murka);
        Dog dog = new Dog("Rex", 12, "kind", "Beef");
        dog.showSound();
        System.out.println(dog);
        System.out.println(murka.equals(dog));
        Electrocar.Battery battery = new Electrocar.Battery();
        battery.charging(100);
        System.out.println(Electrocar.Battery.showBattery());

    }

}
