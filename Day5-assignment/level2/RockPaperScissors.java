import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static String getComputerChoice() {
        Random random = new Random();
        int choice = random.nextInt(3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "tie";
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "user";
        } else {
            return "computer";
        }
    }

    public static double[] calculateStats(String[] results) {
        int userWins = 0;
        int computerWins = 0;
        int ties = 0;

        for (String result : results) {
            if (result.equals("user")) userWins++;
            else if (result.equals("computer")) computerWins++;
            else ties++;
        }

        double userPercentage = (double) userWins / results.length * 100;
        double computerPercentage = (double) computerWins / results.length * 100;

        return new double[]{userWins, computerWins, ties, userPercentage, computerPercentage};
    }

    public static void displayResults(String[] userChoices, String[] computerChoices, String[] results) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\t\tComputer\tWinner");
        System.out.println("----\t----\t\t--------\t------");

        for (int i = 0; i < results.length; i++) {
            String winner = results[i].equals("tie") ? "Tie" : 
                           results[i].equals("user") ? "User" : "Computer";
            System.out.println((i+1) + "\t" + userChoices[i] + "\t\t" + 
                             computerChoices[i] + "\t\t" + winner);
        }
    }

    public static void displayStats(double[] stats) {
        System.out.println("\nStatistics:");
        System.out.println("User wins: " + (int)stats[0] + " (" + String.format("%.1f", stats[3]) + "%)");
        System.out.println("Computer wins: " + (int)stats[1] + " (" + String.format("%.1f", stats[4]) + "%)");
        System.out.println("Ties: " + (int)stats[2]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of games to play: ");
        int numGames = scanner.nextInt();
        scanner.nextLine();

        String[] userChoices = new String[numGames];
        String[] computerChoices = new String[numGames];
        String[] results = new String[numGames];

        for (int i = 0; i < numGames; i++) {
            System.out.print("Game " + (i+1) + " - Enter your choice (rock/paper/scissors): ");
            userChoices[i] = scanner.nextLine().toLowerCase();
            computerChoices[i] = getComputerChoice();
            results[i] = findWinner(userChoices[i], computerChoices[i]);
        }

        displayResults(userChoices, computerChoices, results);
        double[] stats = calculateStats(results);
        displayStats(stats);

        scanner.close();
    }
}