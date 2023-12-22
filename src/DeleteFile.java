//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.FileWriter;
import java.io.IOException;

public class DeleteFile {
    public DeleteFile() {
    }

    public static void clearFileContent() {
        String path = "dsr.txt";

        try {
            FileWriter fileWriter = new FileWriter(path, false);

            try {
                fileWriter.write("");
            } catch (Throwable var5) {
                try {
                    fileWriter.close();
                } catch (Throwable var4) {
                    var5.addSuppressed(var4);
                }

                throw var5;
            }

            fileWriter.close();
        } catch (IOException var6) {
            var6.printStackTrace();
        }

    }
}
