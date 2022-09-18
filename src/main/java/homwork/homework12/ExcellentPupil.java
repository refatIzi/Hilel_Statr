package homwork.homework12;

public class ExcellentPupil extends Pupil{
    ExcellentPupil(String nama) {
        super(nama);
    }

    @Override
    public void study() {
        System.out.print("  Очень хорошо ");
        super.study();
    }

    @Override
    public void read() {
        System.out.print("  Очень хорошо ");
        super.read();
    }

    @Override
    public void write() {
        System.out.print("  Очень хорошо ");
        super.write();
    }

    @Override
    public void relax() {
        System.out.print("  Очень редко ");
        super.relax();
    }
}
