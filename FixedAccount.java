package Polymorphsim;

public class FixedAccount extends Account2 {
    private int tenureyear;
    public FixedAccount(String acccouont,double balance,int tenureyear){
        super(acccouont,balance);
        this.tenureyear=tenureyear;
    }
    public void settenureyear(int tenureyear){
        this.tenureyear=tenureyear;

    }
    public int gettenureyear(){
        return tenureyear;
    }
    public void display(){
        super.display();
        System.out.println(tenureyear);
    }
}