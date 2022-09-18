package homwork.homework12;

public class BadPupil extends Pupil{
    BadPupil(String nama) {
        super(nama);
    }

    @Override
    public void relax() {
        System.out.print("  Постоянно ");
        super.relax();
    }

    @Override
    public void study() {
        System.out.print("  Плохо ");
        super.study();
    }

    @Override
    public void read() {
        System.out.print("  Плохо ");
        super.read();
    }

    @Override
    public void write() {
        System.out.print("  Плохо ");
        super.write();
    }
}
