import java.io.*;
import java.util.*;

public class Solution_4 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuffer sb = new StringBuffer(A);
        String B= sb.reverse().toString();
        System.out.println(A.equals(B)?"Yes":"No");
    }
}



