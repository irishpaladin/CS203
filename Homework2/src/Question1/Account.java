/**
 * A class that calculates simulates simple 
 * bank account operation
 * 
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 2
 * last modified: 11/02 2pm
 */
    
package Question1;
import java.util.Date;

public class Account {
    private int id; 
    private double balance;
    static private double annualInterestRate;
    private Date dateCreated;
    
    /**
     * @constructors
     */
    public Account(){
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.012;
        dateCreated = new Date();
    }
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0.012;
        dateCreated = new Date();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the annualInterestRate
     */
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * @param annualInterestRate1 the annualInterestRate to set
     */
    public static void setAnnualInterestRate(double annualInterestRate1) {
        annualInterestRate = annualInterestRate1;
    }

    /**
     * @return the dateCreated
     */
    public Date getDateCreated() {
        return dateCreated;
    }
    
    /**
     * @return the monthly interest rate
     */
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    
    /**
     * @return the monthly interest
     */
    public double getMonthlyInterest(){
        return balance*getMonthlyInterestRate();
    }
    
    /**
     * can lessen the value of the balance
     */
    public void withdraw(double amount){
        //true if user input a valid amount 
        if(amount>balance)
            System.out.println("Your balance is not enough");
        else{
            balance -= amount;
            System.out.println("Withdraw successfully");
        }
    }
    
    /**
     * adds value to the balance
     */
    public void deposit(double amount){
        balance += amount;
    }
    
}
