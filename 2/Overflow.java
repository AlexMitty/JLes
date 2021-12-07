class Overflow {
  public static void main(String[] args) {
    final int i = 2 + 2 * 2;
    byte b = i;
    byte b = Integer.MAX_VALUE + Integer.MAX_VALUE;

  }
}
