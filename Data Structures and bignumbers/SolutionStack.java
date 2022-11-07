import java.util.*;
class SolutionStack{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            String input = sc.next();

        int length1 = input.length();        
        int length2 = -1;    

        while (length2 < length1) {
            length1 = input.length();
            input = 
                Pattern.compile("[(][)]|[{][}]|[\\[][\\]]")
                .matcher(input)
                .replaceAll("");
            length2 = input.length();
        }

        System.out.println(input.length() == 0);
            //Complete the code
		}
		
	}
}



