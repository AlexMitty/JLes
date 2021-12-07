class VariableTest {
  static int b;
  public static void main(String[] args) {
      int a;
      System.out.println(a); // compile error: variable 'a' might not have been initialized
      System.out.println(b); // 0
  }
}
