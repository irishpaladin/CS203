/**
 * Program that demonstrates that the importance of 
 * the order of catch block to specifically catch every
 * exception in the same hierarchy
 * 
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 2
 * last modified: 11/02 2pm
 */

package Question7;
import java.util.Random;

public class CatchDifferentExceptions {
    public static void main(String[] args){
        System.out.println("Throwing 5 random exceptions");
        for(int i = 0; i<5 ; i++){
            try{
                someMethod();
            }
            catch(ExceptionC e){
                System.err.println("ExceptionC caught"); 
            }
            catch(ExceptionB e){
                System.err.println("ExceptionB caught"); 
            }
            catch(ExceptionA e){
                System.err.println("ExceptionA caught"); 
            }
        }
    }
    
    /**
     * @method that throws random exception
     */
    public static void someMethod()throws ExceptionA{
        Random rand = new Random();
        int randNumber = rand.nextInt(3)+1;
        System.out.println("RandomNumber: "+randNumber);
        
        switch(randNumber){
            case 1:
                throw new ExceptionA();
            case 2:
                throw new ExceptionB();
            case 3:
                throw new ExceptionC();
        }
        
    }
}
