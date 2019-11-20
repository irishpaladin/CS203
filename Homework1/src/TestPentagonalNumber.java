/**
 * Displays the first 100 pentagonal numbers with 10 numbers on each line
 * 
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 1
 * last modified: 10/02 5pm
 */
public class TestPentagonalNumber {
    public static int getPentagonalNumber(int n){
        //returns pentagonal number
        return (n*((3*n)-1))/2;
    }

    public static void main(String[] args) {
        //displays result
        for (int i = 1;i<=100;i++){
            if(i%10==0){
                System.out.printf("%-6d\n",getPentagonalNumber(i));
            }
            else{
                System.out.printf("%-6d",getPentagonalNumber(i));
            }
        }
    }    
}
