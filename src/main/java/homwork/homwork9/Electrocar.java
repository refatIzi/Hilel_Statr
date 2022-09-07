package homwork.homwork9;

public class Electrocar {
    int id;


    Electrocar(int id) {
        this.id = id;
    }

    public static class Battery {
        int battery;

        public void charging(int battery) {
            this.battery = battery;
        }

        public static int showBattery() {
            return 100;
        }

        public int battery() {
            return battery;
        }
    }
}
