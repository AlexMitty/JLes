public class FieldTest {
    private static int g = 9;
    final static int g1 = g+1;
    private final static int g2 = g1+1;

    public static void main(String[] args) {
        FieldTest gInst = new FieldTest();
        FieldTest gInst1 = new FieldTest();
        System.out.println(FieldTest.g1);
        System.out.println(FieldTest.g2);
        FieldTest.g = 10;
        System.out.println(FieldTest.g);
        int f = gInst.g1;
        System.out.println(f);
        System.out.println(FieldTest.g2);

    }
}
