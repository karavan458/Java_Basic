package chapter18.sec02;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;

public class FinallyCase {
    public static void main(String[] args) {
        Path file = Paths.get("");
        BufferedWriter writer = null;

        try {
            writer = Files.newBufferedWriter(file);
            writer.write('A');
            writer.write('B');
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        finally {
            if(writer != null) writer.close();
        }
    }

}
