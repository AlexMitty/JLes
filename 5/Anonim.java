public class Anonim {
    public static void main(String[] args){
        var d = new SomeInner() {
            void show() {
                super.show();
                System.out.println("subclass");
            }
        };
        d.show();
    }
}
