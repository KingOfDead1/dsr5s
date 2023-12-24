//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    public WriteFile() {
    }
    
    private static String objectToJson(Computer computer) {
        return computer.toString();
    }
    
    public static void writeToFile(List<Computer> computers) {
        String path = "dsr.txt";
        
        try (FileWriter fileWriter = new FileWriter(path, true)) {
            if (computers.isEmpty()) {
                return;
            }
            
            fileWriter.append("[");
            for (int i = 0; i < computers.size(); i++) {
                
                String jsonRepresentation = objectToJson(computers.get(i));
                fileWriter.append(jsonRepresentation);
            }
            fileWriter.append("]");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
