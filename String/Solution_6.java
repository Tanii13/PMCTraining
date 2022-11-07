import java.util.Scanner;

public class Solution_6 {

     static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() == b.length()) {
            //anagram logic
            char [] c1 = a.toCharArray();
            char [] c2 = b.toCharArray();
            Sort(c1);
            Sort(c2);
            boolean x =true;
            for (int i = 0; i < c2.length; i++) {
                if(c1[i] != c2[i]){
                    x = false;
                    break;
                }
            }
            if (x == true) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
        
    
    }
    public static void Sort(char []c) {
        for (int i = 0; i < c.length; i++) {
            for (int j = i+1; j < c.length; j++) {
                if(c[i] > c[j]){
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}