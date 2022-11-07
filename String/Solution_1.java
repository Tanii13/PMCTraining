import java.io.*;
import java.util.*;

public class Solution_1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
         System.out.println(A.length() + B.length());
        

        if(A.compareTo(B) >0)
            System.out.println("Yes");
        else System.out.println("No");
        
        char a = Character.toUpperCase(A.charAt(0));
        char b = Character.toUpperCase(B.charAt(0));
        System.out.println(a + A.substring(1)+" "+ b + B.substring(1));
    }
}



