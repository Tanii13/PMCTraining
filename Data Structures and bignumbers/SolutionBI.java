import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionBI {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner input = new Scanner(System.in);

    BigInteger A = input.nextBigInteger();
    BigInteger B = input.nextBigInteger();

    System.out.println(A.add(B));
    System.out.println(A.multiply(B));    
    }
}
