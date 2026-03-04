import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		// Read the number of test cases
		if (sc.hasNextInt()) {
		    int T = sc.nextInt();
		    
		    while (T-- > 0) {
		        // Read N (number of friends) and X (cost per subscription)
		        int N = sc.nextInt();
		        int X = sc.nextInt();
		        
		        // Calculate subscriptions needed: ceil(N / 6)
		        // Using (N + 5) / 6 is the integer math way to get the ceiling
		        int subscriptionsNeeded = (N + 5) / 6;
		        
		        // Calculate total cost
		        int totalCost = subscriptionsNeeded * X;
		        
		        // Output the result
		        System.out.println(totalCost);
		    }
		}
		
		sc.close();
	}
}