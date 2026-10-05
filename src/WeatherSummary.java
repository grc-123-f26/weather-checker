import java.util.Scanner;

public class WeatherSummary {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      double max = Double.NEGATIVE_INFINITY;
      double min = Double.POSITIVE_INFINITY;

      while (scanner.hasNextDouble()){
        double temp = scanner.nextDouble();
        if (temp > max) {
            max = temp;
        }
        if (temp < min) {
            min = temp;
        }
      }

      System.out.println("Max: " + max);
      System.out.println("Min: " + min);
    }
}
