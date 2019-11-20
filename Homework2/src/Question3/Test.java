/**
 * The String, StringBuilder, and 
 * StringBuﬀer Classes 
 * 
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 2
 * last modified: 11/02 2pm
 */
package Question3;
public class Test {
    public static void main(String[] args){
        //Question 3.1.a
        String s1 = "Welcome";
        String s2 = "welcome";
        System.out.println("Original values: s1 = " + s1 + ", s2 = " + s2);
        s2 = s1.replace('e', 'E');
        System.out.println("After replace: s1 = " + s1 + ", s2 = " + s2);
        
        //Question 3.1.b
        String[] tokens = "Welcome to Java and HTML".split(" ");
        s1 = tokens[0];
        s2 = tokens[1];
        System.out.println("After split: s1 = " + s1 + ", s2 = " + s2);
        //end of Question 3.1.b
        
        System.out.println();
        
        //Question 3.2
        System.out.println("Hi, ABC, good".matches("ABC "));
        System.out.println("Hi, ABC, good".matches(".*ABC.*"));
        System.out.println("A,B;C".replaceAll(",;", "#"));
        System.out.println("A,B;C".replaceAll("[,;]", "#"));
        
        String[] tokens2 = "A,B;C".split("[,;]");
        for(int i = 0; i <tokens2.length; i++){
            System.out.print(tokens2[i] + " ");
        }
        //end of Question 3.2
        
        System.out.println("\n");
        
        //Question 3.3
        String s = "Java";
        StringBuilder builder = new StringBuilder(s);
        change(s, builder);
        
        System.out.println(s);
        System.out.println(builder);
        //end of Question 3.3
    }
    
    //Question 3.3 function
    private static void change(String s, StringBuilder builder){
        s = s+ " and HTML";
        builder.append(" and HTML");
    }
    //end of Question 3.3 function
}
