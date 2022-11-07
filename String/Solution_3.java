import java.util.Scanner;

public class Solution_3 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
         StringBuilder sb = new StringBuilder();
    for(int i =0; i < s.length(); i++){
        if(s.substring(i).length() >= k){
            sb.append(s.substring(i).substring(0, k) + ",");
        }
    }


    // Sorting the array of sub-strings generated.
    String[] arrOfStrs = sb.toString().split(",", 0);
    int n = arrOfStrs.length;
    while(n > 0){
        for(int i =0; i < arrOfStrs.length - 1; i++){
            if(arrOfStrs[i].compareTo(arrOfStrs[i+1]) > 0){
                final String temp = arrOfStrs[i+1];
                arrOfStrs[i+1] = arrOfStrs[i];
                arrOfStrs[i] = temp;
            }
        }
        n--;
    }

    smallest = arrOfStrs[0];
    largest = arrOfStrs[arrOfStrs.length -1];
    return smallest + "\n" + largest;

}




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}