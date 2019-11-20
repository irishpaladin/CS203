/**
 * Displays the output needed for Question 3
 * 
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 1
 * last modified: 10/02 5pm
 */
public class Question3 {
    public static void main(String[] args){
        int[] list1={2,4,7,10};
        java.util.Arrays.fill(list1,7);
        System.out.println(java.util.Arrays.toString(list1));
    
        int[] list2={2,4,7,10};
        System.out.println(java.util.Arrays.toString(list2));
        System.out.println(java.util.Arrays.equals(list1,list2));
    }
}
