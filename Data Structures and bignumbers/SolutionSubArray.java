import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionSubArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int sum = 0;
        int j = 1;

        for (int i=0; i<arr.length; i++){
            sum =  arr[i];
            if (sum<0){count++;}
            while(i+j< arr.length){
                sum = sum + arr[i+j];
                j++;
                if (sum<0){count++;}
            }
            if(i+j==arr.length){j=1;}  
        }
        System.out.println(count);
    }
    }

