import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s= new Scanner(System.in);
        int N =s.nextInt();
        List<Integer> l = new LinkedList<>();
        for(int i=0;i<N;i++){ l.add(s.nextInt());  }
        int q=s.nextInt(); 
        while(q!=0){
        String g=s.next();
        if(g.equalsIgnoreCase("Insert")){
            l.add(s.nextInt(),s.nextInt());}
            else if(g.equalsIgnoreCase("Delete")){
            l.remove(s.nextInt());}
            q--;}
        for (Integer integer : l) { System.out.print(integer+" ");}
        }
}
    
