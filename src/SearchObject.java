import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchObject {
    public static void searchForLaptop() {
        String brand = getUserInput("Enter laptop brand:");
        double processorSpeed = getDoubleUserInput("Enter processor speed:");
        double storage = getDoubleUserInput("Enter storage capacity:");
        double screenSize = getDoubleUserInput("Enter screen size:");
        double batteryCapacity = getDoubleUserInput("Enter battery capacity:");
        
        searchAndPrint("Laptop", brand, processorSpeed, storage, screenSize, batteryCapacity);
    }
    
    public static void searchForWorkstation() {
        String brand = getUserInput("Enter workstation brand:");
        double processorSpeed = getDoubleUserInput("Enter processor speed:");
        double storage = getDoubleUserInput("Enter storage capacity:");
        int numMonitors = getIntUserInput("Enter number of monitors:");
        int numProcessingUnits = getIntUserInput("Enter number of processing units:");
        
        searchAndPrint("Workstation", brand, processorSpeed, storage, numMonitors, numProcessingUnits);
    }
    
    public static void searchForServer() {
        String brand = getUserInput("Enter server brand:");
        double processorSpeed = getDoubleUserInput("Enter processor speed:");
        double storage = getDoubleUserInput("Enter storage capacity:");
        double rackSize = getDoubleUserInput("Enter rack size:");
        String dataCenterLocation = getUserInput("Enter data center location:");
        
        searchAndPrint("Server", brand, processorSpeed, storage, rackSize, dataCenterLocation);
    }
    
    private static String getUserInput(String prompt) {
        System.out.print(prompt + " ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim();
    }
    
    private static double getDoubleUserInput(String prompt) {
        while (true) {
            try {
                String input = getUserInput(prompt);
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
    
    private static int getIntUserInput(String prompt) {
        while (true) {
            try {
                String input = getUserInput(prompt);
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }
    
    private static void searchAndPrint(String type, String brand, double processorSpeed, double storage, double additionalParam1, double additionalParam2) {
        try (BufferedReader br = new BufferedReader(new FileReader("dsr.txt"))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                Pattern pattern = Pattern.compile(type + "\\{Brand=(\\w+) ProcessorSpeed=(\\d+\\.\\d+) StorageCapacity=(\\d+\\.\\d+)");
                Matcher matcher = pattern.matcher(line);
                
                if (matcher.find()) {
                    String foundBrand = matcher.group(1);
                    double foundProcessorSpeed = Double.parseDouble(matcher.group(2));
                    double foundStorage = Double.parseDouble(matcher.group(3));
                    
                    if (foundBrand.equalsIgnoreCase(brand) && foundProcessorSpeed == processorSpeed && foundStorage == storage) {
                        // Pretty print the result
                        System.out.println("Object found:");
                        System.out.println("Type: " + type);
                        System.out.println("Brand: " + foundBrand);
                        System.out.println("Processor Speed: " + foundProcessorSpeed);
                        System.out.println("Storage Capacity: " + foundStorage);
        
                        if (type.equalsIgnoreCase("laptop")) {
                            System.out.println("Screen Size: " + additionalParam1);
                            System.out.println("Battery Capacity: " + additionalParam2);
                        } else if (type.equalsIgnoreCase("workstation")) {
                            System.out.println("Number of Monitors: " + (int) additionalParam1);
                            System.out.println("Number of Processing Units: " + (int) additionalParam2);
                        } else if (type.equalsIgnoreCase("server")) {
                            System.out.println("Rack Size: " + additionalParam1);
                            System.out.println("Data Center Location: " + additionalParam2);
                        }
        
                        return;
                    }
                }
            }
            
            System.out.println("Object not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void searchAndPrint(String type, String brand, double processorSpeed, double storage, double additionalParam1, String additionalParam2) {
        try (BufferedReader br = new BufferedReader(new FileReader("objects.txt"))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                Pattern pattern = Pattern.compile(type + "\\{Brand=(\\w+) ProcessorSpeed=(\\d+\\.\\d+) StorageCapacity=(\\d+\\.\\d+)");
                Matcher matcher = pattern.matcher(line);
                
                if (matcher.find()) {
                    String foundBrand = matcher.group(1);
                    double foundProcessorSpeed = Double.parseDouble(matcher.group(2));
                    double foundStorage = Double.parseDouble(matcher.group(3));
                    
                    // Check if the current object matches the search criteria
                    if (foundBrand.equalsIgnoreCase(brand) && foundProcessorSpeed == processorSpeed && foundStorage == storage) {
                        System.out.println("Object found: " + line);
                        return;
                    }
                }
            }
            
            System.out.println("Object not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
