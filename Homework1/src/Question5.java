/**
 * Displays the output needed in Question 5
 * 
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 1
 * last modified: 10/02 5pm
 */
public class Question5 {
    public static void main(String[] args){
        //displays values in the index 00,10,20
        int [][] array = {{1,2},{3,4},{5,6}};
        int sum = 0;
        for (int i =0;i<array.length;i++){
            sum+=array[i][0];
        }
        System.out.println(sum);
        
        
    }
}
