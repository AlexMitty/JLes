public class MethodTest {
    static boolean integerLager(int i, double d)
    {
        if (i > d) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(MethodTest.integerLager(4,7));
    }
}
