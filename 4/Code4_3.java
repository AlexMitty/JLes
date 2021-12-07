public class Code4_3 {
    String s = "поле класса";
    Code4_3(String v) {
        this.s = s;
        System.out.println("c параметром " + v);
    }

    public static void main(String[] args) {
        Code4_3 i2 = new Code4_3("один");
        System.out.println(i2.s);
    }
}
