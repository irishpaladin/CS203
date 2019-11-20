/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;


/**
 *
 * @author Irish Paladin
 */
//public class TestPentagonalNumber{
    


public class main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.printf("\nYour bill: ");
        System.out.printf("amount is %f %e\n", 32.32,32.32);
        System.out.printf("amount is %5.2f%% %5.4e\n", 32.327,32.32);
        System.out.printf("%6b\n", (1>2));
        System.out.printf("%6s\n", "Java");
        System.out.printf("%-6b%s\n", (1>2),"Java");
        
        int[] list1={2,4,7,10};
        java.util.Arrays.fill(list1,7);
        System.out.println(java.util.Arrays.toString(list1));
    
        int[] list2={2,4,7,10};
        System.out.println(java.util.Arrays.toString(list2));
        System.out.println(java.util.Arrays.equals(list1,list2));

    }
    
}
