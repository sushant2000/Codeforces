import java.util.Scanner;
public class q2{
    public static Scanner scn = new Scanner(System.in);
    public static void  solution(String str){
    StringBuilder sb = new StringBuilder();
    int n = str.length();
    if(n > 10){
    sb.append(str.charAt(0));
    sb.append(n - 2);
    sb.append(str.charAt(str.length() - 1));
    System.out.println(sb.toString());
}else{
    System.out.println(str);
}
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        String str = scn.nextLine();
        for(int i = 0; i < n; i++){
        String str2 = scn.nextLine();
         solution(str2);
        }
    }
}