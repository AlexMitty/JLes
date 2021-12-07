public class AbstractRealisation extends AbstractPerson{
    private final String specialisation;
    public AbstractRealisation(String name, String specialisation) {
        super(name);
        this.specialisation = specialisation;
    }

    @Override
    public String getDescription() {
        return "students specialisation is " + specialisation;
    }
}
