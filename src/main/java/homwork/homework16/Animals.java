package homwork.homework16;

public enum Animals {

    CAT(1000){
        @Override
        public String toString() {
            return "Около "+this.num+" видов "+super.toString()+" живут в природе";
        }
    },
    DOG(500){
        @Override
        public String toString() {
            return "Все "+this.num+" видов "+super.toString()+" приучаемы";
        }
    },
    FROG(100){
        @Override
        public String toString() {
            return "Всего "+this.num+" видов "+super.toString()+" впадают в спячку";
        }
    };

    int num;

    Animals(int num) {
        this.num=num;
    }
}
