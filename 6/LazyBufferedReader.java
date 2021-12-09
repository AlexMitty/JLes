import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class LazyBufferedReader {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("input-file.txt");
        BufferedReader br = Files.newBufferedReader(path);
        Stream<String> stream = br.lines();
        stream //
                .filter(line -> line.startsWith("a"))
                .forEach(System.out::println);

        br.close();
    }
}
