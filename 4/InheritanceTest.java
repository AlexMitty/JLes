public class InheritanceTest {
    static Employee e = new Employee();
    static Programmer p = e;
    static Executive ex = p;
    static Programmer p1 = (Programmer) ex;

    public static void main(String[] args) {
        p.printA();
        p.printB();

    }

    private static class Executive {
        void printA() {
            System.out.println("I'm executive");
        }
    }

    private static class Programmer extends Executive {
        void printB() {
            System.out.println("I'm programmer");
        }
    }

    private static class Employee extends Programmer {
        void printC() {

            System.out.println("I'm employee");
        }

    }
}
