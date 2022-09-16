package homwork.homework12;

public class GoodPupil extends Pupil{
    GoodPupil(String nama) {
        super(nama);
    }

    @Override
    public void study() {
        System.out.print("  Хорошо ");
        super.study();
    }

    @Override
    public void write() {
        System.out.print("  Хорошо ");
        super.write();
    }

    @Override
    public void read() {
        System.out.print("  Хорошо ");
        super.read();
    }

    @Override
    public void relax() {
        System.out.print("  Редко ");
        super.relax();
    }
}
