package test;

public class Bank {
    private int kred;
    private int month=7;
    public Bank(int kred){
        this.kred=kred;
    }
    public void setMany(int many){
        month--;

        if(kred>0&&month>0){
            kred=kred-many;
            System.out.println("Вам соталось внести еще " + kred );
                setMany(many);
        }
        else if(kred<=many){
            month=0;
            System.out.println("End");
        }


    }
}
