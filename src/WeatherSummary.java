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
       Scanner input = new Scanner(System.in);    // Implement this method!
                                                   // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!
       double max = Double.NEGATIVE_INFINITY;
       double min = Double.POSITIVE_INFINITY;
       double sum = 0;
       int count = 0;
    
       while (input.hasNextDouble()) {
        double currentTemp = input.nextDouble();

        if (currentTemp > max) {
            max = currentTemp;
        }
        if (currentTemp < min) {
            min = currentTemp;
        }
            sum += currentTemp;
            count++;

       }

       if (count > 0) {
         double average = sum / count;
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
       }

    }
}
