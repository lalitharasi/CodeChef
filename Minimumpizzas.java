import java.util.*;
import java.lang.*;
import java.io.*;

class Minimumpizzas
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        // Check if there's input available
        if (sc.hasNextInt()) {
            int T = sc.nextInt(); // Number of test cases
            
            while (T-- > 0) {
                int N = sc.nextInt(); // Number of friends
                int X = sc.nextInt(); // Slices per friend
                
                int totalSlices = N * X;
                
                // Calculate minimum pizzas needed: ceil(totalSlices / 4)
                // Using (totalSlices + 3) / 4 handles the rounding up automatically
                int pizzasNeeded = (totalSlices + 3) / 4;
                
                System.out.println(pizzasNeeded);
            }
        }
        
        sc.close();
    }
}