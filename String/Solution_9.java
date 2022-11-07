import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution_9{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {
    
    public static String zeroTo255 = "([\\d]{1,2}|0[\\d]{1,2}|1[\\d]{1,2}|2[0-4][\\d]|25[0-5])";
    
    public static String pattern = 
    zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;
}
