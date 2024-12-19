package chapter18.sec02;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        Path file = Paths.get("");

        try(BufferedWriter writer = Files.newBufferedWriter(file)) {
            writer.write('a');
            writer.write('z');
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
