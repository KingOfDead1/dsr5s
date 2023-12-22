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

        try {
            FileWriter fileWriter = new FileWriter(path, true);

            label56: {
                try {
                    if (computers.isEmpty()) {
                        break label56;
                    }

                    fileWriter.append("[");
                    int i = 0;

                    while(true) {
                        if (i >= computers.size()) {
                            fileWriter.append("]");
                            break;
                        }

                        String jsonRepresentation = objectToJson((Computer)computers.get(i));
                        fileWriter.append(jsonRepresentation);
                        ++i;
                    }
                } catch (Throwable var6) {
                    try {
                        fileWriter.close();
                    } catch (Throwable var5) {
                        var6.addSuppressed(var5);
                    }

                    throw var6;
                }

                fileWriter.close();
                return;
            }

            fileWriter.close();
        } catch (IOException var7) {
            var7.printStackTrace();
        }
    }
}
