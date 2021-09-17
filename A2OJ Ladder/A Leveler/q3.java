import java.io.*;
import java.util.*;

public class q3{
    public static Scanner scn = new Scanner(System.in);
    
    public static void removeVowel(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I' && str.charAt(i) != 'O' && str.charAt(i) != 'U'&& str.charAt(i) != 'Y' && str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u' && str.charAt(i) != 'y')
         sb.append("." + str.charAt(i));
         

        
        }
        System.out.print(sb.toString().toLowerCase());
    }
    
    public static void main(String[] args){
        String str = scn.nextLine();
        removeVowel(str);
    }
}