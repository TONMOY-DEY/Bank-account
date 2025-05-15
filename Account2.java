package Polymorphsim;

public class Account2 {
    private String accountNo;
    private double balance;

    public Account2(){
        System.out.println("blanck ");
    }

    public Account2(String accouontNO,double balance){
        this.accountNo=accouontNO;
        this.balance=balance;
    }
    public void setaccountNO(String accountNO){
        this.accountNo=accountNO;

    }
    public  String getaccountNO(){
        return accountNo;

    }
    public void setbalance(double balance){
        this.balance=balance;
    }
    public double getbalance(){
        return balance;
    }
    public void display(){
        System.out.println(accountNo);
        System.out.println(balance);

    }

    
}
