import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int pow=0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int j=0;j<n;j++){
                //j=0 >pow= 3(b)*2^0(1)=3
               pow=b*(int)Math.pow(2,j);
               //a = 5(a)+3(pow)=8
               a+=pow;
               System.out.print(a+" ");
            }
        System.out.println();
        }
        
        in.close();
       
    }
}