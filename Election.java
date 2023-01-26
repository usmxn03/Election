// This code was created by Usman 2152992

//Start of program

import java.util.ArrayList;
import java.util.Scanner;

public class Election {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a vote (or -1 to finish): ");
            String vote = scan.nextLine().trim();
            if (vote.equals("-1") || vote.isEmpty()) {
                break;
                
                // Input votes until -1 is entered
                
            }
            int index = names.indexOf(vote);
            if (index >= 0) {
                counts.set(index, counts.get(index) + 1);
            } else {
                names.add(vote);
                counts.add(1);
                
                // Check if name is on the list of votes and If a name isn't in a list add a vote
                
            }
        }

        int maxCount = 0;
        int maxIndex = 0;
        for (int i = 0; i < names.size(); i++) {
            if (counts.get(i) > maxCount) {
                maxCount = counts.get(i);
                maxIndex = i;
            }
        }
     
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " received " + counts.get(i) + " votes.");
        }
        
        // Find who has the most votes    
        
        System.out.println("-------------------------------------");
        System.out.println("The winner is: " + names.get(maxIndex));
        System.out.println("With a total of " + maxCount + " votes.");
        
        // Print the winner who has the most votes
    }
}

//End of program