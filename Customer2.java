package Polymorphsim;

public class Customer2 {
	private String name;
	private int nid;
	private Account2 ac[];
	
	public Customer2(int nid, String name, int size) {
        this.nid = nid;
        this.name = name;
        this.ac = new Account2[size];
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public int getNid() {
        return nid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account2 a) {
        for (int i = 0; i < ac.length; i++) {
            if (ac[i] == null) {
                ac[i] = a;
                break;
            }
        }
    }

    public void removeAccount(Account2 a) {
        for (int i = 0; i < ac.length; i++) {
            if (ac[i] == a) {
                ac[i] = null;
                break;
            }
        }
    }

    public void showAllAccounts() {
        for (Account2 acc : ac) {
            if (acc != null) {
                acc.display();
            }
        }
    }


	}


        

