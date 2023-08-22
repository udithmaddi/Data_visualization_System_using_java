import java.util.Scanner;

public class PieChart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the data from the user.
        System.out.println("Enter the number of categories: ");
        int n = scanner.nextInt();

        String[] categories = new String[n];
        int[] values = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the category name: ");
            categories[i] = scanner.next();
            System.out.println("Enter the value for " + categories[i] + ": ");
            values[i] = scanner.nextInt();
            sum += values[i];
        }

        // Create the pie chart.
        System.out.println("Pie chart:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%s: %d (%.2f%%)\n", categories[i], values[i], (values[i] / (double) sum) * 100);
        }
    }

}