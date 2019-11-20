/**
 * Program that simulates ATM Machine using 
 * the defined Account class
 * 
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 2
 * last modified: 11/02 2pm
 */
package Question2;
import Question1.Account;
import java.util.Scanner;

public class ATMWithAccount {
    public static void main(String[] args){
        //initialize class object
        Account[] accounts = new Account[11];
        Scanner scanner = new Scanner(System.in);
        
        //assigning id and balance to the accounts
        for (int i = 1; i<11;i++){
            accounts[i] = new Account(i,100);
        }
        
        //assigning first element as NULL
        accounts[0]=null;
        
        //start simulation
        //will stop using break
        while(true){ 
            //Entering ID
            System.out.print("Enter an account id (1-10): ");
            int id = scanner.nextInt();
            
            //If id entered is zero(0), terminates the program
            if(id==0){
                System.out.println("Here is a summary  of your accounts: ");
                for(int i = 1; i<11;i++){
                    System.out.printf("Account %d: balance is $%.2f \n", i, accounts[i].getBalance());
                }
                System.out.println("You exit the ATM");
                break;
            }
            
            //if id entered is invalid
            if(id < 1 || id >10){
                System.out.println("Invalid id");
                continue;
            }
            
            
            //If id entered is valid
            boolean endMainMenu = false;
            while(!endMainMenu){
                System.out.println("\nMain menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.print("Enter a choice: ");
                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        System.out.printf("The balance is $%.2f \n" , accounts[id].getBalance());
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        accounts[id].withdraw(scanner.nextDouble());
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        accounts[id].deposit(scanner.nextDouble());
                        break;
                    case 4:
                        System.out.println("You exit this account.\n");
                        endMainMenu = true;
                        break;
                    default:
                        System.out.println("You have entered invalid choice.");
                        break;
                }
            }
        }
    }
}
