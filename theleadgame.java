import java.util.*;
import java.lang.*;
import java.io.*;

class theleadgame
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        // Check if there is input available
        if (sc.hasNextInt()) {
            int n = sc.nextInt(); // Number of rounds
            
            int p1_cum = 0; // Cumulative score for Player 1
            int p2_cum = 0; // Cumulative score for Player 2
            
            int winner = 0;
            int maxLead = 0;
            
            for (int i = 0; i < n; i++) {
                int s1 = sc.nextInt(); // Round score Player 1
                int s2 = sc.nextInt(); // Round score Player 2
                
                // Update cumulative scores
                p1_cum += s1;
                p2_cum += s2;
                
                int currentLead = 0;
                int currentLeader = 0;
                
                // Calculate current lead and who is leading
                if (p1_cum > p2_cum) {
                    currentLead = p1_cum - p2_cum;
                    currentLeader = 1;
                } else {
                    currentLead = p2_cum - p1_cum;
                    currentLeader = 2;
                }
                
                // If this lead is the largest seen so far, update records
                if (currentLead > maxLead) {
                    maxLead = currentLead;
                    winner = currentLeader;
                }
            }
            
            // Output the overall winner and the maximum lead they attained
            System.out.println(winner + " " + maxLead);
        }
        
        sc.close();
    }
}