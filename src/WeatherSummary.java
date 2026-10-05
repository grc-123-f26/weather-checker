import java.io.*;
import java.util.*;

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
    public static void main(String[] args) throws FileNotFoundException{
        // Implement this method!
        // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!
        File tempsFile = new File("temps");
        Scanner input = new Scanner(tempsFile);

        while (input.hasNextDouble()) {
            double temperatures = input.nextDouble();

            System.out.println(temperatures);
        }

        System.out.println("Done reading!");

    }
}
