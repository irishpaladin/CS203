/**
 * Program that identifies what is the biggest
 * number user gave before running the class file 
 * 
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 1
 * last modified: 10/02 5pm
 */
public class MaximumIntegerWithCommandLine {
    public static void main(String[] args){
        int max = Integer.parseInt(args[0]);
        int num;
        for(int i=1;i<args.length;i++){
            num=Integer.parseInt(args[i]);
            if(num >max) max=num;
        }
        System.out.println("The maximum integer is "+max);
    }
}
