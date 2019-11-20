/**
 * Program for a improvisation of split method 
 * wherein delimiter is included in the return
 * 
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 2
 * last modified: 11/02 2pm
 */

package Question4;
import java.util.ArrayList;

public class NewSplit {
    public static void main(String[] args){
        //case 1
        System.out.print("split(\"ab#12#453\", \"#\")\nResult:");
        String[] str1 = split("ab#12#453", "#");
        System.out.print(str1[0]);
        for(int i = 1; i<str1.length; i++){
            System.out.print(","+str1[i]);
        }
        //case 2
        System.out.print("\n\nsplit(\"a?b?gf#e##\", \"[?#]\")\nResult:");
        String[] str2 = split("a?b?gf#e##", "[?#]");
        System.out.print(str2[0]);
        for(int i = 1; i<str2.length; i++){
            System.out.print(","+str2[i]);
        } 
        
        System.out.println();
    }
    
    public static String[] split(String s, String regex){
        //takes the substrings that is not delimeter
        String[] norm_split = s.split(regex); 
        //stores the array that will be returned
        ArrayList<String> arrayList = new ArrayList<>();

        //counters
        int size = (norm_split.length*2)-1; //to limit for loop
        int index = 0; //index of the char/substring loop is reading
        
        //traversing the string
        for(int i = 0;i<size;i++){
            //for non-delimeters
            if(i%2==0){
                arrayList.add(norm_split[i/2]);
            }
            //for the delimeters
            else {
                int endIndex = s.indexOf(norm_split[(i/2)+1],index);
                String delimeter = s.substring(index,endIndex);
                arrayList.add(delimeter);
            }
            //update counter
            index += arrayList.get(i).length();
        }
        
        //true if there's a delimeter at the end of the string
        if(s.matches(".*"+regex+"$")){
            //makes sure that to catch even 2 or more regex at the end
            arrayList.add(s.substring(index,s.length()));
        }
        
        //convert array list to string array
        String[] new_split = new String[arrayList.size()];
        for(int i=0;i<arrayList.size();i++){
            new_split[i]= arrayList.get(i);
        }
        
        //return
        return new_split;
    }
}
