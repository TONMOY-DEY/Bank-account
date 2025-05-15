package Polymorphsim;

public class Start {
    public static void main(String[] args) {
        Customer2 c1=new Customer2(56245, "TONMOY", 2);
        FixedAccount F1=new FixedAccount("F23459", 56478930, 2);
        SavingAccount S1=new SavingAccount("S56254", 8900000, 3,5.3);
        c1.addAccount(F1);
        c1.addAccount(S1);
        Account2 ac[]={F1,S1};
        for(Account2 acc:ac){
            acc.display();

        }
        c1.showAllAccounts();



        
    }
    
}
