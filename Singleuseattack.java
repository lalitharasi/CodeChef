import java.util.*;
import java.lang.*;
import java.io.*;

class Singleuseattack
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
		    int T = sc.nextInt();
		    while (T-- > 0) {
		        int H = sc.nextInt();
		        int X = sc.nextInt();
		        int Y = sc.nextInt();
		        
		        // Use the special attack once
		        int remainingHealth = H - Y;
		        int totalAttacks = 1;
		        
		        // If the boss is still alive, use normal attacks
		        if (remainingHealth > 0) {
		            // Calculate ceiling of remainingHealth / X
		            int normalAttacksNeeded = (remainingHealth + X - 1) / X;
		            totalAttacks += normalAttacksNeeded;
		        }
		        
		        System.out.println(totalAttacks);
		    }
		}
		sc.close();
	}
}