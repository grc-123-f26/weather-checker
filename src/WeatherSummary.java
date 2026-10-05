import java.util.Scanner;

public class WeatherSummary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        double sum = 0;
        int count = 0;

        while (scanner.hasNextDouble()) {
            double temperature = scanner.nextDouble();

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

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
    }
}