//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kakvo deistvie jelaete da predpriemete?");
        System.out.println("Dobavqne");
        System.out.println("Tursene");
        System.out.println("Chetene");
        System.out.println("Premahvane");
        System.out.println("Exit");
        AddingFile adding = new AddingFile();
        String operation = scanner.nextLine();

        while(true) {
            switch (operation) {
                case "Dobavqne":
                    adding.add(scanner);
                case "Tursene":
                case "Chetene":
                    break;
                case "Premahvane":
                    RemoveObjectFromFile.remove();
                    break;
                case "Exit":
                    WriteFile.writeToFile(adding.getComputers());
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
}
