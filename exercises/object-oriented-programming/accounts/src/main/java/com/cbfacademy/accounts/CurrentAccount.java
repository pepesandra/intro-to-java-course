package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    protected double overdraftLimit;
  

public CurrentAccount(int accountNumber, double balance, double overdraftLimit){
super(accountNumber, balance);
this.overdraftLimit = overdraftLimit;
    }
    public double getOverdraftLimit(){
        return overdraftLimit;
    }
    @Override
  
    public double withdraw(double requested) {
        if (this.balance + this.overdraftLimit < requested) {
           return 0;
        } else {
           this.balance -= requested;
           return requested;
        }
     }
   public void setOverdraftLimit(double overdraftLimit) {
    if (overdraftLimit >= 0) {
       this.overdraftLimit = overdraftLimit;
    }
       
    
}
}

/* public void setOverdraftLimit(double limit) {
    this.overdraftLimit = limit;
} */
//if (interestRate >= 0 ) {
    //this.interestRate = interestRate;
    /*CurrentAccount with the following members, in addition to the attributes of the Account class:

public CurrentAccount(int accountNumber, double balance, double overdraftLimit) - constructor that accepts parameters representing the new account number, starting balance and overdraft limit
public double getOverdraftLimit() - returns the current overdraft limit
public void setOverdraftLimit() - sets the overdraft limit */


