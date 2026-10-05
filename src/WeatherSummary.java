
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
      Scanner scanner = new Scanner(System.in);
      if (!scanner.hasNextDouble()) {
          System.out.println("No temperatures provided.");
          return;
      }
        double firstTemp = scanner.nextDouble();
          // Process the temperature value as needed
        double max = firstTemp; // Initialize max with the first temperature     
        double min = firstTemp; // Initialize min with the first temperature
        double sum = firstTemp; // Initialize sum with the first temperature
        int count = 1; // Initialize count with 1 for the first temperature
      while (scanner.hasNextDouble()) {
        double temp = scanner.nextDouble();
         if (temp > max) {
             max = temp;
         }
         if (temp < min) {
             min = temp;
        }
        sum += temp;
        count++;
        double average = sum / count;
        System.out.println("Average: " + average);

        // Implement this method!
        // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!
    
    }
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);
  
}
}
