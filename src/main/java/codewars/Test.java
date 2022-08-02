package codewars;

public class Test {
    public static void main(String[] args) {
        int a =7;
        int b =8;
        String c="hello";
        String e="hello";
        String cc=new String("hello");
        String cb=new String("hello");

        System.out.println(a%b+" "+ "Rifat");
        System.out.println(c==e);
        System.out.println(cc==cb);

        for(int j=0;j!=10;j++){
            System.out.println("hello "+j);
        }
        System.out.println();
        int i=0;
        while (i!=10){
            System.out.println("hello "+i); i++;
        }
        System.out.println();

        int m=0;
        while (true){
            System.out.println("hello "+m); m++;
            if(m==10)break;
        }
    }
}
