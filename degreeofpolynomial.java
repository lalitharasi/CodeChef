import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            
            while (T-- > 0) {
                int N = sc.nextInt();
                int maxDegree = 0;
                
                for (int i = 0; i < N; i++) {
                    int coefficient = sc.nextInt();
                    
                    // If the coefficient is non-zero, this index is a candidate for the degree
                    if (coefficient != 0) {
                        maxDegree = i;
                    }
                }
                
                // After checking all N terms, maxDegree holds the highest index with a non-zero value
                System.out.println(maxDegree);
            }
        }
        
        sc.close();
    }
}