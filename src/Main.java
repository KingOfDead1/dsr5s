//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        runApplication();
    }
    
    private static void runApplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kakvo deistvie jelaete da predpriemete?");
        System.out.println("Dobavqne");
        System.out.println("Tursene");
        System.out.println("Chetene");
        System.out.println("Premahvane");
        System.out.println("Exit");
        AddingFile addingFile = new AddingFile();
        String operation = scanner.nextLine();
        
        while(true) {
            switch (operation) {
                case "Dobavqne":
                    addingFile.add(scanner);
                    break;
                case "Tursene":
                    chooseComputer(scanner);
                    break;
                case "Chetene":
                    ReadObject.readAllObjects();
                    break;
                case "Premahvane":
                    RemoveObjectFromFile.remove();
                    break;
                case "Exit":
                    WriteFile.writeToFile(addingFile.getComputers());
                    return;
                default:
                    System.out.println("Greshna Operaciq");
            }

            System.out.println("Kakvo deistvie jelaete da predpriemete?");
            System.out.println("Dobavqne");
            System.out.println("Tursene");
            System.out.println("Chetene");
            System.out.println("Premahvane");
            System.out.println("Exit");
            operation = scanner.nextLine();
        }
    }
    
    private static void chooseComputer(Scanner scanner) {
        System.out.println("Choose a computer type to search (laptop, workstation, server):");
        String computerType = scanner.nextLine().toLowerCase();
        
        switch (computerType) {
            case "laptop":
                SearchObject.searchForLaptop();
                break;
            case "workstation":
                SearchObject.searchForWorkstation();
                break;
            case "server":
                SearchObject.searchForServer();
                break;
            default:
                System.out.println("Invalid computer type");
        }
    }
}
