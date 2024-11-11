import java.util.Scanner;

public class DataRunner {
    public static void main(String[] args) {
        UserStory userStory = new UserStory("Year.txt", "Winner.txt");
        System.out.println(userStory);

        // Creates a variable to track the user's choice and sets it to "y"
        String choice = "y";
        Scanner scanner = new Scanner(System.in);

        // Repeats while the user's choice is not "n"
        while (!choice.equals("n")) {
            // Prompts user to choose which information to retrieve
            System.out.print("Enter an option (1-22): ");
            int option = scanner.nextInt();

            // Shows who won the World Cup
            if (option == 1) {
                System.out.println("Uruguay won the " + option + "st World Cup");
            } else if (option == 2) {
                System.out.println("Italy won the " + option + "nd World Cup");
            } else if (option == 3) {
                System.out.println("Italy won the " + option + "rd World Cup");
            } else if (option == 4) {
                System.out.println("Uruguay won the " + option + "th World Cup");
            } else if (option == 5) {
                System.out.println("West Germany won the " + option + "th World Cup");
            } else if (option == 6) {
                System.out.println("Brazil won the " + option + "th World Cup");
            } else if (option == 7) {
                System.out.println("Brazil won the " + option + "th World Cup");
            } else if (option == 8) {
                System.out.println("England won the " + option + "th World Cup");
             } else if (option == 9) {
                System.out.println("Brazil won the " + option + "th World Cup");
              } else if (option == 10) {
                System.out.println("West Germany won the " + option + "th World Cup");
              } else if (option == 11) {
                System.out.println("Argentina won the " + option + "th World Cup");
              } else if (option == 12) {
                System.out.println("Italy won the " + option + "th World Cup");
              } else if (option == 13) {
                System.out.println("Argentina won the " + option + "th World Cup");
              } else if (option == 14) {
                System.out.println("West Germany won the " + option + "th World Cup");
              } else if (option == 15) {
                System.out.println("Brazil won the " + option + "th World Cup");
              } else if (option == 16) {
                System.out.println("France won the " + option + "th World Cup");
              } else if (option == 17) {
                System.out.println("Brazil won the " + option + "th World Cup");
              } else if (option == 18) {
                System.out.println("Italy won the " + option + "th World Cup");
              } else if (option == 19) {
                System.out.println("Spain won the " + option + "th World Cup");
              } else if (option == 20) {
                System.out.println("Germany won the " + option + "th World Cup");
              } else if (option == 21) {
                System.out.println("France won the " + option + "th World Cup");
              } else if (option == 22) {
              System.out.println("Argentina won the " + option + "th World Cup");
            } else {
                System.out.println("Invalid option. Please select a number between 1 and 22.");
            }

            // Asks the user if they want to search again
            System.out.print("Do you want to search again? (y/n): ");
            choice = scanner.next();
        }

        scanner.close();
        System.out.println("Program ended.");
    }
}