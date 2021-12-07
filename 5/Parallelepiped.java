public class Parallelepiped implements Prism {
    private double a;
    private double b;
    private double h;
    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getHeight() {
        return h;
    }

    public static void main(String[] args) {
        var p = new Parallelepiped();
        System.out.println(p.getArea() + " " + p.getHeight() + " " + p.getVolume());
    }
