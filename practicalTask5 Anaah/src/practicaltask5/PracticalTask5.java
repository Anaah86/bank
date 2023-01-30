/*
* Name : Anaah Mohamed Farook
 
 * Course: Computer Science
 * Module : Programming
 
 
 * This Java program is based on object oriented programming , creates an Account object usig java class. 
   Accessors and mutators are used to output account such as account 
   date the acount was created, account id, balance, annual interest rate, balance after withdrawal and deposit. 
*/
package practicaltask5;


public class PracticalTask5 {

    
    public static void main(String[] args) {
        
        //Customer object is created using default constructor
        account customer = new account();
       
        //get method to print the date the accountwas created.
        System.out.println("The Date when your account was created : " + customer.getDateCreated());
        
        //set method is used to set values to properties.
        customer.setId(1122);
        customer.setBalance(20000);
        customer.setAnnualInterestRate(4.5);
        
        //print() method is called to print properties of customer object.
        customer.print();
        
        // prints balance after withdrawal of $2500
        System.out.println("Your balance after withdrawal of $2500 $: " + customer.withdraw(2500));
        
        //prints the balance after deposit of $3000
        System.out.println("Your balance after deposit of $3000 : $" + customer.deposit(3000));
        
        //prints monthly interest rate
        System.out.println("Your monthly interest rate is : "+customer.MonthlyInterestRate() + "%");

    }
    
}
