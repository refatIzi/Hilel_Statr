package hillel;

import java.io.IOException;
import java.util.Arrays;

public class Sjkas {
    public static void main(String[] args) throws IOException {
        System.out.println("before");
        byte[] buff = new byte[1024];
        int read = System.in.read(buff);
        System.out.println(new String(Arrays.copyOf(buff, read)));
        System.out.println("after");
    }
}
