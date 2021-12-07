public class Modifiers {
    public String f = "public";
    private String f1 = "private";
    protected String f2 = "protected";
    String f3 = "default";

    public static void main(String[] args) {
        Modifiers f = new Modifiers();
        System.out.println(f.f + " " + f.f1 + " " + f.f2 + " " + f.f3);
    }
}
