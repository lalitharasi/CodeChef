import java.util.*;
import java.lang.*;
import java.io.*;

class Assignment
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
		    int T = sc.nextInt();
		    while (T-- > 0) {
		        int X = sc.nextInt();
		        
		        // He needs 3 hours. Deadline is 10.
		        // So X + 3 must be less than or equal to 10.
		        if (X + 3 <= 10) {
		            System.out.println("Yes");
		        } else {
		            System.out.println("No");
		        }
		    }
		}
		sc.close();
	}
}