import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerDemo {
    public static void main(String[] args) throws IOException {
//        Logger logger = Logger.getLogger("test.Practice.LoggerDemo");
//        logger.setLevel(Level.FINE);
//        FileHandler fileHandler = new FileHandler("logging-demo.txt");
//        fileHandler.setFormatter(new SimpleFormatter());
//        logger.addHandler(fileHandler);
        new ClassA().foo();
        new ClassB().bar();

    }

}
