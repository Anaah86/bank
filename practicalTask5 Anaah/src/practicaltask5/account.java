/*
 * Name : Anaah Mohamed Farook
 
 * Course: Computer Science
 * Module : Programming
 
 */
package practicaltask5;


//import date class
import java.util.Date;

public class account {
    
    //class properties
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new java.util.Date();
    

    //defaul constructor
    public account()
    { 
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
        

    }
    
    
    
    

    // perameterised constructor
    public account(int accountId , double accountBalance ){
        id =  accountId;
        balance = accountBalance;
        
        
    }
    
    
    
    
    
    //mutator(set) method is used for id, balance and annual interest rate.
    public void setId(int accountId)
    {
        id =  accountId;
    }
    
    
    public void setBalance(double accountBalance)
    {
        balance = accountBalance;
    }
    
    public void setAnnualInterestRate(double accountAnnualInterestRate)
    {
        annualInterestRate = accountAnnualInterestRate;
    }
    
    
    //Accessor method is used for id,balance, annual interest rate and date created.
    public int getId()
    {
        return id;
    }
    public double getBalance()
    {
        return balance ;
    }
    public double getAnnualInterestRate()
    {
        return annualInterestRate ;
    }
    
    public Date getDateCreated()
    {
        return dateCreated;
    }
    
    
    //Monthly interest rate is found using this method
    public double MonthlyInterestRate()
    {
        return annualInterestRate/12;
    }
    
    
    
    //Balance after withdrawal can be found using this method 
    public double withdraw(double amount)
    {
        
        return balance = balance - amount;
    }
    
    //Balance after deposit can be found using this method.
    public double deposit(double amount)
    {
        
        return balance = balance + amount;
    }
    
    //Print method to output id, balance and annual interest rate
    public void print(){
        System.out.println("Your Account ID is : "+ id);
        System.out.println("Your Balance is : $ " + balance );
        System.out.println("Your Annual Interest Rate is : " + annualInterestRate + "%");
        
        
    }
    
    
}

    
