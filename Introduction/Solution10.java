import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution10 {
static int B, H; static boolean flag = true;

static{ Scanner sc = new Scanner(System.in); B = sc.nextInt(); H = sc.nextInt(); try { if (B <= 0 || H <= 0){ flag = false; throw new Exception("Breadth and height must be positive"); } } catch(Exception ex){ System.out.println(ex); } }



public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class