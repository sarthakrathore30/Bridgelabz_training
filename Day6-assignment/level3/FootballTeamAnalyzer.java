import java.util.Random;

public class FootballTeamAnalyzer {

    public static int[] generateHeights() {
        Random random = new Random();
        int[] heights = new int[11];
        for (int i = 0; i < 11; i++) {
            heights[i] = random.nextInt(101) + 150;
        }
        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void displayResults(int[] heights) {
        System.out.println("Football Team Height Analysis");
        System.out.println("============================");

        System.out.print("Player heights (cm): ");
        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i] + " ");
        }

        System.out.println("\n\nStatistics:");
        System.out.println("Sum of heights: " + findSum(heights) + " cm");
        System.out.println("Mean height: " + String.format("%.2f", findMean(heights)) + " cm");
        System.out.println("Shortest player: " + findShortest(heights) + " cm");
        System.out.println("Tallest player: " + findTallest(heights) + " cm");
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();
        displayResults(heights);
    }
}