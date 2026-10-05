import java.util.Scanner;

public class WeatherSummary {
    /**
     * Reads newline-delimted temperatures from System.in and prints summary
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
        // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!

        Scanner input = new Scanner(System.in);

        double max = input.nextDouble();
        double min = max;

        double sum = max;
        int count = 1;

        while (input.hasNextDouble()) {
            double temperature = input.nextDouble();
            
            if (temperature > max) {
                max = temperature;
            }
            if (temperature < min) {
                min = temperature;
            }

            sum += temperature;
            count++;
        }

        double average = sum / count;

        // looked at the link below to remember how to round outputs
        // https://www.geeksforgeeks.org/java/java-program-to-round-a-number-to-n-decimal-places/
        System.out.println("Max: " + String.format("%.2f", max));
        System.out.println("Min: " + String.format("%.2f", min));
        System.out.println("Average: " + String.format("%.2f", average));

        input.close();
    }
}
