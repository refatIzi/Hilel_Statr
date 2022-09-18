package homwork.homework13;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public abstract class AbstractHandler {

    String url;
    public String open(String url) {
        this.url = url;
        String txt = "";
        try (FileReader reader = new FileReader(url)) {
            int c;
            while ((c = reader.read()) != -1) {
                txt = txt + (char) c;
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        return txt;
    }

    public void create(String url) throws IOException {
        this.url =url;
        File file = new File(url);
        file.createNewFile();
    }

    public void change(String url) {

    }

    public void save(String txt) throws IOException {
        FileWriter writer = new FileWriter(this.url, false);
        writer.write(txt);
        writer.flush();
    }

    public boolean check(String name) {
        return new File(name).exists();
    }
}
