/**
 * Program that tests Account class
 * 
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 2
 * last modified: 11/02 2pm
 */

package Question1;
public class TestAccount {
    public static void main(String[] args){
        Account account1 = new Account(1122, 2500);
        
        //deposit
        account1.deposit(3000);
        
        //display
        System.out.printf("The balance is $%.2f \n" , account1.getBalance());
        System.out.printf("The annual interest rate is %.2f%% \n", account1.getAnnualInterestRate()*100);
        System.out.printf("The monthly interest rate is %.2f%% \n", account1.getMonthlyInterestRate()*100);
        System.out.printf("The monthly interest is %.2f \n", account1.getMonthlyInterest());
        System.out.println("The account was created on "+ account1.getDateCreated());
        
    }
    
}
