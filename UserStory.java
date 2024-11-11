import java.util.Scanner;

public class UserStory {
  //Instance variables
    private int[] Year;
    private String[] Winner;

    // Constructor: initializes Year and Winner arrays from file inputs
    public UserStory(String YearFile, String WinnerFile) {
        Year = FileReader.toIntArray(YearFile);    
        Winner = FileReader.toStringArray(WinnerFile);  
    }

   //toString Method to convert our data to a string
    public String toString() {
        StringBuilder sb = new StringBuilder("Year and Winner List:\n");
        for (int i = 0; i < Year.length; i++) {
            sb.append("Year: ").append(Year[i]).append(", Winner: ").append(Winner[i]).append("\n");
        }
        return sb.toString();
    }

    // Method to get winner information based on user input
    public int getWinner() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year to look up the winner:");
        int option = input.nextInt();
        input.nextLine();
        input.close();
        return option;
    }
}