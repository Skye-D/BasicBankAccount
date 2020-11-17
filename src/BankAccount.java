

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String name;
    private String email;
    private String phoneNumber;


    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return this.balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setPhonenumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getphoneNumber() {
        return phoneNumber;
    }

    public void dbalance(){
        System.out.println("Your balance is: " + balance);
    }

    public int deposit(int add){
            System.out.println("Your previous balance was " + balance + ". you added $" + add);
            balance = balance + add;
            System.out.println("Your new balance is " + balance);
            return balance;

    }
    public int withdrawel(int wd){
        if (balance - wd >= 0){
            System.out.println("Success! You withdrew " + wd + " from your starting balance of " + balance + "." + "Your new balance is: " + (balance - wd));
            balance =- wd;
        } else{
            System.out.println("you do not have enough funds to make that withdrawel.");
        }
        return 0;
    }
}
