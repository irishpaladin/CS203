/**
 * Displays the output needed for Question 1
 * 
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 1
 * last modified: 10/02 5pm
 */
public class Question1 {
    public static void main(String[] args){
        System.out.printf("amount is %f %e\n", 32.32,32.32);
        System.out.printf("amount is %5.2f%% %5.4e\n", 32.327,32.32);
        System.out.printf("%6b\n", (1>2));
        System.out.printf("%6s\n", "Java");
        System.out.printf("%-6b%s\n", (1>2),"Java");
    }
}
