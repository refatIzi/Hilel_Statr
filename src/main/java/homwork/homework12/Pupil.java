package homwork.homework12;

public class Pupil {
    private String nama;

    Pupil(String nama) {
        this.nama = nama;
    }

    public void study() {
        System.out.println("Учится");
    }

    public void read() {
        System.out.println("Читает");
    }

    public void write() {
        System.out.println("Пишет");
    }

    public void relax() {
        System.out.println("Отдыхает");
    }

    public void getNama() {
        System.out.println(nama);
    }
}
