public class ExceptionTest {
    static class MyException extends Exception {
    }
    static void test() throws MyException {
        throw new MyException();
    }
    public static void main(String[] args) {//throws MyException {
//        try {
            test();
//        } catch (MyException e) {
//            e.printStackTrace();  
//        }
    }
}
