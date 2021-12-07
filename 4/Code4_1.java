class Code4_1 {
      private static int nextId = 1;
          private int id;
          public void setId() {
             id = nextId;
             nextId++;
            }
  public static void main(String[] args) {
      System.out.println(nextId);
       Code4_1 c = new Code4_1();
       c.setId();
       System.out.println(nextId);
  }
}
