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
        Scanner s = new Scanner(System.in);
        double temp = s.nextDouble();
        double max = temp;
        double min = temp;
        double sum = temp;
        int num = 1;

        while(s.hasNextDouble())
        {
            temp = s.nextDouble();
            sum = sum + temp;
            num++;
        
            if(temp > min)
            {
                min = temp;
            }

            else if(temp < max)
            {
                max = temp;
            }
        }

        double average = sum/num;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
    }
}
