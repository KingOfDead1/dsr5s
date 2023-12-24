
import java.io.*;
import java.util.Iterator;
import java.util.List;

public class RemoveObjectFromFile {
    
    public static void removeObject(String brand, double processorSpeed, double storage) {
        try {
            File inputFile = new File("dsr.txt");
            File tempFile = new File("temp.txt");
        
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
        
            String lineToRemove = "Brand=" + brand + " ProcessorSpeed=" + processorSpeed + " StorageCapacity=" + storage;
        
            String currentLine;
            boolean objectFound = false;
            boolean insideObject = false;
        
            while ((currentLine = reader.readLine()) != null) {
                if (currentLine.contains(lineToRemove)) {
                    objectFound = true;
                    insideObject = true;
                    continue;
                }
            
                if (insideObject) {
                    if (currentLine.contains("]")) {
                        insideObject = false;
                    }
                    continue;
                }
            
                writer.write(currentLine + System.getProperty("line.separator"));
            }
        
            writer.close();
            reader.close();
        
            if (!objectFound) {
                System.out.println("Object not found.");
            } else {
                if (!inputFile.delete()) {
                    throw new IOException("Could not delete the original file");
                }
                
                if (!tempFile.renameTo(inputFile)) {
                    throw new IOException("Could not rename the temporary file to the original file name");
                }
                System.out.println("Object removed successfully.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
