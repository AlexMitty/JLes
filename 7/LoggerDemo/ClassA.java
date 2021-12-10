import java.util.logging.Logger;

public class ClassA {
    private static final Logger LOGGER = Logger.getLogger(ClassA.class.getName());

    public void foo(){
        LOGGER.fine("Helo from ClassA (fine)");
        LOGGER.config("Helo from ClassA (config)");
        LOGGER.info("Helo from ClassA (info)");
    }
}
