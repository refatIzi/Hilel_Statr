package hillel;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Queuetest {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> list =new ConcurrentLinkedQueue<>();
        list.offer("1");
        list.offer("2");
        list.offer("3");
        System.out.println( list.poll());
        System.out.println( list.poll());
        System.out.println( list.poll());
        System.out.println( list.poll());


    }
}
