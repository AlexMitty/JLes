import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriter {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("input-file.txt");
        try (PrintWriter printWriter = new PrintWriter(
                Files.newBufferedWriter(
                        path, StandardCharsets.UTF_8))) {
            printWriter.println("Hello");
        }
    }
}
