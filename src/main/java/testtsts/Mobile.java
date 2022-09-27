package testtsts;

public class Mobile extends Computer{
    Phone getPhone(){
      return new Phone(){
          @Override
          public void process(){
              super.process();
              System.out.println("Mobile");
          }
          
      };
    }
    @Override
    public void process(){
        System.out.println("Mobile");
    }
}
