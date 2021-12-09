import java.io.*;

public class TryWithResourcesClose {
    public static void main(String[] args) throws IOException {
        try (InputStream in = new FileInputStream("input-file.txt");
             OutputStream out = new FileOutputStream("output-file.txt")) {
            in.transferTo(out);
        }
    }
}
