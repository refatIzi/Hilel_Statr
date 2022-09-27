package testtsts;

public class Test {
    public static void main(String[] args) {
        Computer computer1=new Computer();
        Computer computer2=new Computer();
        Mobile mobile1=new Mobile();
        Mobile mobil2=new Mobile();
        Phone phone1=new Phone();
        Phone phone2=new Phone();
        Computer [] computers={computer1,computer2,mobile1};
        Phone [] phones={phone1,phone2, mobil2.getPhone()};
        for (Computer computer:computers){
            computer.process();
        }
        System.out.println("-------------------------");
        for (Phone phone:phones){
            phone.process();
        }
    }
}
