package com.cbfacademy.accounts;

public class SavingsAccount extends Account {

    protected double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate){
super(accountNumber, balance);
this.interestRate = interestRate;


}
    public void applyInterest(){
       deposit(getBalance() * interestRate);
    }
    public double getInterestRate(){
        return interestRate;
    }
public void setInterestRate(double interestRate){
    if (interestRate >= 0 ) {
 this.interestRate = interestRate;
}
}}




/*public void applyInterest() {

  }

  public double getInterestRate() {
    return this.interestRate;
  }

  public void setInterestRate(double interestRate) {
    this.interestRate = interestRate;
  } */

    /*Using the Account class as a base class, create two derived classes:

SavingsAccount with the following members, in addition to the attributes of the Account class:

public SavingsAccount(int accountNumber, double balance, double interestRate) - constructor that accepts parameters representing the new account number, starting balance and interest rate
public void applyInterest() applies interest to the account
public double getInterestRate() - returns the current interest rate
public void setInterestRate() - sets the interest rate
CurrentAccount with the following members, in addition to the attributes of the Account class:

public CurrentAccount(int accountNumber, double balance, double overdraftLimit) - constructor that accepts parameters representing the new account number, starting balance and overdraft limit
public double getOverdraftLimit() - returns the current overdraft limit
public void setOverdraftLimit() - sets the overdraft limit
 */
