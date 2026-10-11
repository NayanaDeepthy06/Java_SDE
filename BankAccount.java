/*
Some important points must be taken care of while implementing real-world entities using Object-oriented programming:

Accessing Attributes: Use methods (getters and setters) to access private attributes to ensure controlled modification of data.
Example, getBalance() retrieves the current balance.
Encapsulation: Keep attributes private and provide controlled access using public methods to ensure data integrity.
In Java, the private keyword strictly restricts outside access.
Default Values: Attribute initialization rules depend on the language. In Java, class fields receive default values automatically (0, null, false, etc.).
Method Parameters: Methods can take parameters to modify attributes (e.g., deposit(amount)).
Error Handling: Always validate inputs inside methods (e.g., disallow negative deposits or withdrawals exceeding balance).
 */

// in this we discussed attributes and metjods 



   
    

public class BankAccount{
    private String name;
    private double balance;

    public BankAccount(String name, double balance ) {
        this.name = name;
        this.balance  = balance; // here when the object is created its attribute values get intializedb by the constructor 
    }

    // bank has certain functions check the balance ,add the money ,withdfraw the money that can be deposit or withdraw 
    // set the name of the bank acoount and get the name of the bank account 
    public String getname(){
        return name;
    }
    public void setname(String name ){
        this.name = name;
    }

    public void addMoney(double amount){
          balance += amount;
    }

    public boolean withdraw(double amount){
        if(balance >=amount){
            System.out.println("amount withdrawn is : "+amount);
            System.out.println("remaining balance is :"+(balance-amount));
            return true;
        }
        else{
            System.out.println("insufficient balance to withdraw the amount ");
            return false;
            
        }
    }

    // default declaration is also important or default constructor is alos important 
    public BankAccount() {
        name = "";
        balance = 0;
    }
    

    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount("RND", 98000);
        obj1.addMoney(2000);
        obj1.withdraw(98000);

    }
    
    

}
