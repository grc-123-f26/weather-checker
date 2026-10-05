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
        // Implement this method!
        // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!
        double temp; //current temp
        double minTemp; //min
        double maxTemp; //max

        //scan temps
        Scanner scan = new Scanner(System.in);
        //assign first temp to both min and max
        minTemp = scan.nextDouble();
        maxTemp = minTemp;
        double totalTemp =minTemp; //continuous sum of temps
        int count=1; //counts num of temps

        //while there is another temp, check if bigger or smaller but not equal to current temp
        while(scan.hasNextDouble()) {
            temp = scan.nextDouble();
            if (temp < minTemp) {
                minTemp = temp;
            }
            if (temp > maxTemp) {
                maxTemp = temp;
            }
            totalTemp += temp;
            count++;
        } scan.close();
        System.out.printf("Max: %.2f\nMin: %.2f\n", maxTemp, minTemp);
        double avg = totalTemp/count;
        System.out.println("Average: " + avg); 

    }//end main

}//end class
