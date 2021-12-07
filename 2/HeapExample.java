   
public class HeapExample {
public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = new Integer(100);
        Integer d = new Integer(100);
        Integer e = 1000;
        Integer f = 1000;
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(c==d);
        System.out.println(e==f);
    }
}
