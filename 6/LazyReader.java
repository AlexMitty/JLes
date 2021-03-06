import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class LazyReader {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("input-file.txt");

        try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
            lines.filter(line -> line.startsWith("a"))
                    .forEach(System.out::println);
        }

//        List<String> strings =
//                Files.readAllLines(path, StandardCharsets.UTF_8);

    }

}
