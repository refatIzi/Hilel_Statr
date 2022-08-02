package hillel;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MyScaner {
    private final InputStream in;

    public MyScaner(InputStream in) {
        this.in = in;
    }


    ArrayList<String> arrayList = new ArrayList<>();

    public int nextInt() throws IOException {

        String t = "";
        if (arrayList.size() < 1) {
            read();
            t = arrayList.get(0);
        } else {
            t = arrayList.get(0);
        }
        arrayList.remove(0);
        return Integer.parseInt(t);
    }

    private void read() throws IOException {
        byte[] buff = new byte[1024];
        int read = in.read(buff);
        String[] st = new String(Arrays.copyOf(buff, read - 1)).split(" ");

        for (int i = 0; i < st.length; i++) {
            arrayList.add(st[i]);
        }

    }
}
