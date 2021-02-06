import java.util.*;
public class Solution
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int input = sc.nextInt();
	    pattern_print(input);
	}
	
	static void pattern_print(int n)
	{
	   for (int i = n; i > 0; i--) 
        { 
          for (int j = n; j > i; j--) 
            System.out.print(j); 
 
          for (int j = i; j > 0; j--) 
             System.out.print(i); 
 
          System.out.println(); 
        }
	    
	}
}
