package homwork.homework16;

public class TETS {

    static int k=8;
    public static void main(String[] args) {
  TT tt=new TT() {
      int l=k;
      @Override
      public int print(int a, int b) {
          return a+b;
      }
  };
    }
}
interface  TT{
    public int print(int a,int b);
}
