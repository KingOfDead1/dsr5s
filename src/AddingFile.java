
// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AddingFile {
    private java.util.List<Computer> computers;

    public AddingFile() {
        this.computers = new ArrayList<>();
    }

    public void add(Scanner scanner) {
        System.out.println("Input computer brand: ");
        String brand = scanner.nextLine();
        System.out.println("Input computer processor sped: ");
        double processorSpeed = Double.parseDouble(scanner.nextLine());
        System.out.println("Input computer storage: ");
        double storage = Double.parseDouble(scanner.nextLine());

        System.out.println("Input computer type: ");
        System.out.println("1. Laptop");
        System.out.println("2. Workstation");
        System.out.println("3. Server");
        String type = scanner.nextLine();

        switch (type) {
            case "Laptop":
                addingPC(brand, processorSpeed, storage, type, scanner);
                break;
            case "Workstation":
                addingPC(brand, processorSpeed, storage, type, scanner);
                break;
            case "Server":
                addingPC(brand, processorSpeed, storage, type, scanner);
                break;
        }
    }

    public List<Computer> getComputers() {
        return Collections.unmodifiableList(this.computers);
    }

    private void addingPC(String brand, double processorSpeed, double storageCapacity, String type, Scanner scanner) {
        switch (type) {
            case "Laptop":
                System.out.println("Input laptop screen size: ");
                double screenSize = Double.parseDouble(scanner.nextLine());
                System.out.println("Input laptop battery size: ");
                double batterySize = Double.parseDouble(scanner.nextLine());
                Laptop laptop = new Laptop(brand, processorSpeed, storageCapacity, screenSize, batterySize);
                this.computers.add(laptop);break;
            case "Workstation":
                System.out.println("Input workstation monitors: ");
                int numMonitor = Integer.parseInt(scanner.nextLine());
                System.out.println("Input workstation processing units: ");
                int processingUnits = Integer.parseInt(scanner.nextLine());
                Workstation workstation = new Workstation(brand, processorSpeed, storageCapacity, numMonitor, processingUnits);
                this.computers.add(workstation);
                break;
            case "Server":
                System.out.println("Input server rack size: ");
                String rackSize = scanner.nextLine();
                System.out.println("Input server data center location: ");
                String dataCenterLocation = scanner.nextLine();
                Server server = new Server(brand, processorSpeed, storageCapacity, rackSize, dataCenterLocation);
                this.computers.add(server);
                break;
        }
    }
}