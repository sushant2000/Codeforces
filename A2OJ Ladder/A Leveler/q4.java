import java.io.*;
import java.util.*;
public class q4{
    public static Scanner scn = new Scanner(System.in);

    public static void equalorNot(String str1 , String str2){
        StringBuilder sb = new StringBuilder();
        String temp1 = str1.toLowerCase();
        String temp2 = str2.toLowerCase();
        
        if(temp1.equals(temp2)) System.out.print("0");
            for(int i = 0; i < temp1.length(); i++){
                if(temp1.charAt(i) < temp2.charAt(i)){ System.out.print("-1"); break;}
                else if (temp1.charAt(i) > temp2.charAt(i)){ System.out.print("1");break;}
        }
    } 
    public static void main(String[] args){
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        equalorNot(str1 , str2);
    }
}