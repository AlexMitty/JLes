public abstract class AbstractPerson {
    private final String name;
    public AbstractPerson(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract String getDescription();
}
