package com.cbfacademy.accounts;
public class Account {

    protected int accountNumber;
    protected double balance;

    public Account (int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
public double getBalance(){
    return balance;
}
public int getAccountNumber(){
    return accountNumber;
}

public double deposit(double amount){
    balance += amount;
    return balance;
}

public double withdraw(double requested) {
    if (requested < 0 || this.balance < requested) {
      return 0;
    } else {
      this.balance -= requested;
      return requested;
    }
  }
}


  /* 
Inside the `com.cbfacademy.accounts` package under the `accounts` module, create a class called `Account` with the following members:
- `public Account(int accountNumber, double balance)` - constructor that accepts parameters representing the new account number and starting balance
- `public double getBalance()` - returns the current account balance
- `public int getAccountNumber()` - returns the account number
- `public double deposit(double amount)` - deposits funds to the account and returns the new balance
- `public double withdraw(double requested)` - withdraws funds from the account and returns the requested amount or `0` if the account has an insufficient balance

#### Notes
- This account doesn't have an overdraft facility.
- The balance of an account may only be modified through the `deposit()` and `withdraw()` methods.
- Consider the necessary instance variables and the appropriate access modifiers to allow any sub-classes to access those values
*/  

