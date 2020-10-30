import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter a String to figure out the longest streak.");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        longestStreak(str);
    }

    public static void longestStreak(String str) {
        // Declare a String to print (did not use in my implementation)
        // String returnString;
        // Declare an int to track longest streak =1
        System.out.println("Your string is " + str);
        int longStreak = 1;
        // Declare a String for which letter is repeated the most, init to first letter
        String longLetter = str.substring(0,1);
        // Declare an int for current streak =1
        int currentStreak = 1;
        // Declare a String for current letter
        String currentLetter;
        // Loop for String str
        for (int i = 1; i < str.length(); i++) {
            // See if current letter equals previous letter
            // If equals
            if (str.substring(i, i+1).equals(str.substring(i-1, i))) {
                // Increment current streak
                currentStreak++;
                // If current streak > longest streak
                if (currentStreak>longStreak) {
                    // Set longest streak to current streak
                    longStreak = currentStreak;
                    // Set longest letter to current letter
                    longLetter = str.substring(i, i+1);
                }
            }
            // If not equal
            else {
                // Set current streak to 1
                currentStreak = 1;
                // Reset current letter
                currentLetter = str.substring(i+1, i+2);
            }
        }
        System.out.println("The letter is \"" + longLetter + "\" with a streak of " + longStreak + ".");
    }

}
