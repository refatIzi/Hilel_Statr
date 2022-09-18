package hillel;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MyScanner {
    private final InputStream in;

    public MyScanner(InputStream in) {
        this.in = in;
    }

    /**
     * класс ConcurrentLinkedQueue использовал вместо ArrayList так как изначально я его использовал
     * удобвство в том что с помошью метода offer() ми добовляем данние в list а уже с помощью метода poll()
     * ми забираем данние из list и при єто он удаляет то что забрали начиная с начала
     */
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
        String floAt = returns();
        return Float.parseFloat(floAt);
    }

    public String next() throws IOException {
        String nexT = returns();
        return nexT;
    }

    public String nextLine() throws IOException {
        byte[] buff = new byte[1024];//создаю массив байт размером 1024
        int read = in.read(buff);//записываю в buff то что пришло от потока InputStream
        // System.out.println("Size buffer "+read);
        /**Добавляем в buff данние уменшая ращмер на -1 та как последний єлемен Команда для опускания каретки на одну строку вниз
         * она нам не нужна*/
        return new String(Arrays.copyOf(buff, read - 1));// записываем в массив Arrays удаляем постдний элемент и преоброзуем в строку
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
        /**Добавляем в buff данние уменшая ращмер на -1 та как последний єлемен Команда для опускания каретки на одну строку вниз
         * она нам не нужна и разбиваем на части через split " " */
        String[] st = new String(Arrays.copyOf(buff, read - 1)).split(" ");

        for (int i = 0; i < st.length; i++) {
            list.offer(st[i]);
        }

    }
}
