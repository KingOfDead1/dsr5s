//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Iterator;
import java.util.List;

public class RemoveObjectFromFile {
    public RemoveObjectFromFile() {
    }

    public static void remove() {
        String path = "dsr.txt";
        List<Computer> computers = ReadObjectsFromFile.readObjectsFromFile(path);
        WriteFile.writeToFile(computers);
        System.out.println("Before removal:");
        Iterator var2 = computers.iterator();

        while(var2.hasNext()) {
            Computer computer = (Computer)var2.next();
            System.out.println(computer);
        }

        Computer computerToRemove = (Computer)computers.get(0);
        computers.remove(computerToRemove);
        WriteFile.writeToFile(computers);
        List<Computer> afterRemovalComputers = ReadObjectsFromFile.readObjectsFromFile(path);
        System.out.println("After removal:");
        Iterator var4 = afterRemovalComputers.iterator();

        while(var4.hasNext()) {
            Computer computer = (Computer)var4.next();
            System.out.println(computer);
        }

    }
}
