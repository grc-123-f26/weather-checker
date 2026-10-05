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
        Scanner input = new Scanner(System.in);

        if (input.hasNextDouble()) {
            double firstTemperature = input.nextDouble();
            double max = firstTemperature;
            double min = firstTemperature;
            double total = firstTemperature;
            int count = 1;

            while (input.hasNextDouble()) {
                double temperature = input.nextDouble();
                total = total + temperature;
                count++;
                if (temperature > max) {
                    max = temperature;
                }

                if (temperature < min) {
                    min = temperature;
                }
            }

            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
            double average = total / count;
            System.out.println("Average: " + average);
        }
    }
}