//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadObjectsFromFile {
    public ReadObjectsFromFile() {
    }

    public static List<Computer> readObjectsFromFile(String path) {
        List<Computer> computerList = new ArrayList();

        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            StringBuilder content = new StringBuilder();
            Iterator var4 = lines.iterator();

            while(var4.hasNext()) {
                String line = (String)var4.next();
                content.append(line);
            }

            String jsonContent = content.toString().trim();
            if (jsonContent.startsWith("[") && jsonContent.endsWith("]")) {
                String[] objectStrings = jsonContent.substring(1, jsonContent.length() - 1).split(",");
                String[] var6 = objectStrings;
                int var7 = objectStrings.length;

                for(int var8 = 0; var8 < var7; ++var8) {
                    String objectString = var6[var8];
                    computerList.add(ReadFile.jsonToObject(objectString));
                }
            }
        } catch (IOException var10) {
            var10.printStackTrace();
        }

        return computerList;
    }
}
