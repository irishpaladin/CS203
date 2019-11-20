/**
 * Program that gets 10 user input of double data type and returns the 
 * average of that 10 numbers
 * 
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 1
 * last modified: 10/02 5pm
 */
import java.util.Scanner;

public class AverageOfArray {
    public static int average(int[] array){
        //runs when given arguments are int
        int length = array.length;
        int sum = 0;
        for(int i = 0; i < length; i++){
            sum += array[i];
        }
        return sum/length;
    };
    public static double average(double[] array){
        //runs when given arguments are double
        int length = array.length;
        double sum = 0;
        for(int i = 0;i < length; i++){
            sum += array[i];
        }
        return sum/(double)length;
    };
    
    public static void main(String[] args){
        //getting input
        Scanner scanner = new Scanner(System.in);
        double array[] = new double[10];
        System.out.println("Enter 10 double values: ");
        for (int i=0;i<10;i++){
            array[i] = scanner.nextDouble();
        }
        
        //displays the result of two funtion
        System.out.println("The Average is "+ average(array));
    }
}
