package Polymorphsim;

public class SavingAccount extends Account2 {
    private double interestrate;
    public SavingAccount(String accountNO,double balance,int tenureyear,double interestrate){
        super(accountNO,balance);
        this.interestrate=interestrate;
    }
    public void setinterestrate(double interestrate){
        this.interestrate=interestrate;
    }
    public double getinterestrate(){
        return interestrate;
    }
    public void display(){
        super.display();
        System.out.println(interestrate);
    }

    
}
