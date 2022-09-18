package homwork.homework13;

import hillel.MyScanner;

import java.io.IOException;

public class DOCHandler extends AbstractHandler{
    String text = "";

    DOCHandler(String file, MyScanner scanner) throws IOException {
        System.out.println("Check");
        file = file + ".doc";
        if (!check(file)) {
            create(file);
        } else {
            text = open(file);
        }
        System.out.print(text);
        Writer(scanner);
    }

    private void Writer(MyScanner scanner) throws IOException {
        while (true) {
            String string = scanner.nextLine();
            if (string.equals("exit")) {
                save(text);
                break;
            } else text = text + string + "\n";
        }
    }
}
