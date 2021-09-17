import java.util.Scanner;
public class q4{
    public static Scanner scn = new Scanner(System.in);

    public static void equalorNot(String str1 , String str2){
        if(str1.equals(str2)) System.out.print("0");
            for(int i = 0; i<str1.length(); i++){
                if(str1.charAt(i) < str2.charAt(i)) System.out.print("-1");
                else System.out.print("1");
        }
    } 
    public static void main(String[] args){
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        equalorNot(str1 , str2);
    }
}