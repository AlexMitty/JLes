public interface Prism {
    double PI = 3.14;
    double getArea();
    double getHeight();

    default double getVolume() {
        return getArea() * getHeight();
    }
}
