import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherSummary {
    /**
     * Reads newline-delimited temperatures from System.in and prints summary
     * statistics to System.out.
     * 
     * Example input:
     * 66.4
     * 77.1
     * 72.6
     * 
     * Example output:
     * Max: 66.4
     * Min: 77.1
     * Average: 72.03333333333333
     * 
     * @param args command line arguments (ignored)
     */
    public static void main(String[] args) {
        // Implement this method!
        // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!
        try (Scanner scanner = new Scanner(new java.io.File("temps"))) {
            double max = Double.NEGATIVE_INFINITY;
            double min = Double.POSITIVE_INFINITY;
            double avg = 0;
            double total = 0;
            int entries = 0;
            while(scanner.hasNextDouble()) {
                double current = scanner.nextDouble();
                if (current > max) {
                    max = current;
                }
                else if (current < min) {
                    min = current;
                }
                total += current;
                entries++;
            }
            avg = total / entries;
            System.out.println("Maximum Temp = " + max);
            System.out.println("Minimum Temp = " + min);
            System.out.printf("The Average Temp = %.2f", avg);
        } catch (FileNotFoundException error) {
            System.out.println("File not found.");
        }
    }
}
