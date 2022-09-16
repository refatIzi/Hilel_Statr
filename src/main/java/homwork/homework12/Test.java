package homwork.homework12;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Room room = new ClassRoom();
        room.addPupil(new ExcellentPupil("Alex"));
        room.addPupil(new GoodPupil("Max"));
        room.addPupil(new BadPupil("Katia"));
        room.addPupil(new GoodPupil("Angelika"));
        room.PupilInfo();

    }
}
