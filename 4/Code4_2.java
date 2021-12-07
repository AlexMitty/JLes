package test;

public class Code4_2 {
    private static int g = 9;
    final static int g1 = g+1;
    private final static int g2 = g1+1;

    public static void main(String[] args) {
        Code4_2 gInst = new Code4_2();
        Code4_2 gInst1 = new Code4_2();
        System.out.println(Code4_2.g1);
        System.out.println(Code4_2.g2);
        Code4_2.g = 10;
        System.out.println(Code4_2.g);
        int f = gInst.g1;
        System.out.println(f);
        System.out.println(Code4_2.g2);

    }
}
