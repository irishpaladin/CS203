/**
 * Testing out user defines Exception classes 
 * with hierarchy
 * 
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 2
 * last modified: 11/02 2pm
 */

package Question7;



public class ExceptionHierarchy {
    
    
    public static void main(String[] args){
        //Question7 part1
        try{
            System.out.println("\nThrows ExceptionB");
            throw new ExceptionB();
        }
        catch (ExceptionA e){
            System.err.println("ExceptionA caught"); 
        }
        
        try{
            System.out.println("\nThrows ExceptionC");
            throw new ExceptionC();
        }
        catch (ExceptionA e){
            System.err.println("ExceptionA caught"); 
        }
        
        System.out.println();
        //Question7 part2
        
    }
}

/**
 * @Exception classes
 */
class ExceptionA extends Exception
    {}
class ExceptionB extends ExceptionA
    {}
class ExceptionC extends ExceptionB
    {}
