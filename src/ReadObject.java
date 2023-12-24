import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadObject {
    public static void readAllObjects() {
        try (BufferedReader br = new BufferedReader(new FileReader("dsr.txt"))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                if(line.equals("]")) {
                    return;
                }
                System.out.println("Computer:");
                parseAndPrintObject(line);
                System.out.println("------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void parseAndPrintObject(String line) {
        // Assuming each line represents an object in a custom format
        Pattern pattern = Pattern.compile("(\\w+)\\{Brand=(\\w+) ProcessorSpeed=(\\d+\\.\\d+) StorageCapacity=(\\d+\\.\\d+)");
        Matcher matcher = pattern.matcher(line);
        
        if (matcher.find()) {
            String type = matcher.group(1);
            String brand = matcher.group(2);
            double processorSpeed = Double.parseDouble(matcher.group(3));
            double storageCapacity = Double.parseDouble(matcher.group(4));
            
            System.out.println("Type: " + type);
            System.out.println("Brand: " + brand);
            System.out.println("Processor Speed: " + processorSpeed);
            System.out.println("Storage Capacity: " + storageCapacity);
            
            // Additional parameters based on the computer type
            if (type.equalsIgnoreCase("Laptop")) {
                // Assuming additional parameters are Screen Size and Battery Capacity
                System.out.println("Screen Size: " + extractAdditionalParam(line, "screenSize"));
                System.out.println("Battery Capacity: " + extractAdditionalParam(line, "batteryLife"));
            } else if (type.equalsIgnoreCase("Workstation")) {
                // Assuming additional parameters are Number of Monitors and Number of Processing Units
                System.out.println("Number of Monitors: " + extractAdditionalParam(line, "numMonitors"));
                System.out.println("Number of Processing Units: " + extractAdditionalParam(line, "processingUnits"));
            } else if (type.equalsIgnoreCase("Server")) {
                // Assuming additional parameters are Rack Size and Data Center Location
                System.out.println("Rack Size: " + extractAdditionalParam(line, "rackSize"));
                System.out.println("Data Center Location: " + extractAdditionalParam(line, "dataCenterLocation"));
            }
        }
    }
    
    private static String extractAdditionalParam(String line, String paramName) {
        // Extracting additional parameters using regex
        Pattern pattern = Pattern.compile(paramName + "=(\\S+)");
        Matcher matcher = pattern.matcher(line);
        
        return matcher.find() ? matcher.group(1) : "N/A";
    }
}
