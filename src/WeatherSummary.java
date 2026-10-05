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
        Scanner input = new Scanner(System.in);
        double holder = input.nextDouble();
        double sum = holder;
        int count = 1;
        double min = holder;
        double max = holder;

        while(input.hasNextDouble()){
            holder = input.nextDouble();
            //stats for min and max
            if(holder < min){
                min = holder;
            } else if (holder > max){
                max = holder;
            }


            //stats for the average
            sum += holder;
            count++;

        }
        double avg = sum / count;

        //output
        System.out.println("Min:" + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + avg);

        input.close();




    }
}
