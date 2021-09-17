import java.io.*;
import java.util.*;

public class q1{
    public static Scanner scn = new Scanner(System.in);
    
    public static void watermelon(int n){
        if(n == 2) System.out.print("NO");
        else if(n % 2 == 0)System.out.print("YES");
        else System.out.print("NO");
    }
    
    public static void main(String[] args){
        int n = scn.nextInt();
        watermelon(n);
    }
}