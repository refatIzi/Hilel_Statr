package hillel;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MyScanner_ {
    private final InputStream in;

    public MyScanner_(InputStream in) {
        this.in = in;
    }

    ConcurrentLinkedQueue<String> list = new ConcurrentLinkedQueue<>();

    public int nextInt() throws IOException {
        String iNt = returns();
        return Integer.parseInt(iNt);
    }

    public double nextDouble() throws IOException {
        String doBl = returns();
        return Double.parseDouble(doBl);
    }

    public double nextFloat() throws IOException {
        String doBl = returns();
        return Float.parseFloat(doBl);
    }
    public String next() throws IOException {
        String doBl = returns();
        return doBl;
    }
    public String nextLine() throws IOException {
        byte[] buff = new byte[1024];
        int read = in.read(buff);
        // System.out.println("Size buffer "+read);
        /**Добавляем в buff данние уменшая ращмер на -1 та как последний єлемен Команда для опускания каретки печатающего устройства на одну строку вниз
         * она нам не нужна*/
        return new String(Arrays.copyOf(buff, read - 1));
    }

    private String returns() throws IOException {
        String t = "";
        if (list.size() < 1) {
            read_to_Array();
            t = list.poll();
        } else t = list.poll();
        return t;
    }


    private void read_to_Array() throws IOException {
        byte[] buff = new byte[1024];
        int read = in.read(buff);
        // System.out.println("Size buffer "+read);
        /**Добавляем в buff данние уменшая ращмер на -1 та как последний єлемен Команда для опускания каретки  на одну строку вниз
         * она нам не нужна и разбиваем на части через split " " */
        String[] st = new String(Arrays.copyOf(buff, read - 1)).split(" ");

        for (int i = 0; i < st.length; i++) {
            list.offer(st[i]);
        }

    }
}
