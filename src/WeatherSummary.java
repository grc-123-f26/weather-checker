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
        Scanner scan = new Scanner(System.in);

        double min = 99999; //crazy large temp
        double max = -99999; //crazy small temp
        double sum = 0; //all temps
        int count = 0; //counter

        while (scan.hasNextDouble()) {
            double temp = scan.nextDouble();

            if (temp > max) { //weather max check
                max = temp;
            }

            if (temp < min) { //weather min check
                min = temp;
            }
            sum += temp;
            count++;
            
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + (sum / count));

        scan.close();
        
    }
}
