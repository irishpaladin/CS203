/**
 * Displays the output needed for Question 5.2&3
 * 
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 1
 * last modified: 10/02 5pm
 */
public class Question5B {
    public static void main(String[] args){
        System.out.println("Question 5.2");
        int[][] array = {{1,2,3,4},{5,6,7,8}};
        System.out.println(m1(array)[0]);
        System.out.println(m1(array)[1]);
        
        System.out.println("Question 5.3");
        int [][][] array2 = {{{1,2},{3,4}},{{5,6},{7,8}}};
        System.out.println(array2[0][0][0]);
        System.out.println(array2[1][1][1]);
    }
     public static int[] m1(int[][] m){
         int[] result = new int[2];
         result[0] = m.length;
         result[1] = m[0].length;
         return result;
     }
}
