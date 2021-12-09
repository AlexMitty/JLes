import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        Path usrbin = Paths.get("/users");
        Files.exists (usrbin); // true
        Files.isDirectory (usrbin); // true
        try (DirectoryStream<Path> dirStream =
                     Files.newDirectoryStream(usrbin)) {
            for (Path child : dirStream) {
                System.out.println (child);
            }
        }
    }
}
