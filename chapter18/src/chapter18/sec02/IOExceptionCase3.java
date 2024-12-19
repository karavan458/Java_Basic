package chapter18.sec02;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;

public class IOExceptionCase3 {
    public static void main(String[] args) {
        try {
            md1();
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        public static void md1() throws IOException {
            md2();
        }

        public static void md2() throws IOException {
            Path file = Paths.get("");
            BufferedWriter writer = null;

            writer = Files.newBufferedWriter(file);
            writer.write('A');
            writer.write('Z');

            if(writer != null) writer.close();
        }
    }
}
