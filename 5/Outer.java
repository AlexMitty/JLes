class Outer {
  private static void outerMethod() {
      System.out.println("inside outerMethod");
  }
  static class Inner {
      public static void main(String[] args) {
          System.out.println("inside inner class Method");
          outerMethod();
      }
    }
  Outer.Inner x = new Outer.Inner();

}