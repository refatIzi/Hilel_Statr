package homwork.homework12;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom implements Room {
    List<Pupil> pupils = new ArrayList<>();

    public void addPupil(Pupil pupil) {
        pupils.add(pupil);
    }

    public void getPupilName() {
        for (Pupil pupil : pupils) {
            pupil.getNama();
        }
    }

    public void PupilInfo() {
        for (Pupil pupil : pupils) {
            pupil.getNama();
            pupil.study();
            pupil.read();
            pupil.write();
            pupil.relax();
        }
    }

}
