/**
 * Program that gets 9 double integer input and 
 * displays whether the input is MarcovMatrix or not
 * 
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 1
 * last modified: 10/02 5pm
 */
import java.util.Scanner;
public class MarkovMatrix {
    public static boolean isMarkovMatrix(double[][]m){
        //returns true of the given array is MatrovMatrix
        double sum;
        for(int i=0;i<3;i++){
            sum=m[0][i]+m[1][i]+m[2][i];
            if(sum!=1.0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        //getting inputs
        Scanner sc = new Scanner(System.in);
        double[][] array=new double[3][3];
        System.out.println ("Enter values for 3x3 Matrix: ");
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                array[i][j]=sc.nextDouble();
            }
        }
        //displays result
        if(isMarkovMatrix(array)) System.out.println("It is a Markov matrix");
        else System.out.println("It is not a Markov matrix");
        
    }
}
