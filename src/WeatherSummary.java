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
    public static void main(String[] args) 
    {
        double Max = 0;
        double Min = 0;
        double Total = 0;
        double NumberOfV = 0;
        Scanner ScannerD = new Scanner(System.in);
        while(ScannerD.hasNextDouble())
            {
                double NumberD; 
                NumberD = ScannerD.nextDouble();
                //Max and Min:
                if(NumberD > Max)
                {
                    Max = NumberD;
                }else if(NumberD < Min || Min == 0)
                { 
                    Min = NumberD;
                }

                //Average:
                NumberOfV = NumberOfV +1;
                Total = Total + NumberD;
            }
        System.out.println("Max: " + Max);
        System.out.println("Min: " + Min);
        System.out.println("Average: " + Total/NumberOfV);
        
        // Implement this method!
        // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!
    }
}
