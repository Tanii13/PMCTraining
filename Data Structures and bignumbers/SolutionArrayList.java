import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<List<Integer>> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            List<Integer> subArr = new ArrayList<>();
            String[] nums = sc.nextLine().split(" ");
            for(int j=1; j<nums.length; j++){
                subArr.add(Integer.parseInt(nums[j]));
            }
            arr.add(subArr);
        }
        int queryNum = sc.nextInt();
        for (int k=0; k<queryNum; k++){
            int q1 = sc.nextInt();
            int q2 = sc.nextInt();
            if(q1>n || q2>arr.get(q1-1).size()){
                System.out.println("ERROR!");
            }else{
                System.out.println(arr.get(q1-1).get(q2-1));
            }
        }
    }
    }

