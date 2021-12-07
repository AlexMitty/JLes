public class SuperTest {
    private static class Executive {

        public static void main(String[] args) {
            Executive ex = new Executive();
            System.out.println(ex.toString());
            Programmer pr = new Programmer();
            Employee e = new Employee();
        }

        public Executive() {
            System.out.println("Empty");
        }
    }
        private static class Programmer extends Executive {
            private static int x = 42;
            public Programmer() {

                super();
            }
            void print () {

                System.out.println(x);

            }
        }
            private static class Employee extends Programmer {
                private static int x = 10;
                public Employee() {

                    super.print();
                }
                void print() {

                    System.out.println("другое число " + x);
                }

            }
        }
