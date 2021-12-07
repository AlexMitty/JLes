public class Constructor {
    String s = "поле класса";
    Constructor(String v) {
        this.s = s;
        System.out.println("c параметром " + v);
    }

    public static void main(String[] args) {
        Constructor i2 = new Constructor("один");
        System.out.println(i2.s);
    }
}
