class ObjectCreation {
      private static int nextId = 1;
          private int id;
          public void setId() {
             id = nextId;
             nextId++;
            }
  public static void main(String[] args) {
      System.out.println(nextId);
       ObjectCreation o = new ObjectCreation();
       o.setId();
       System.out.println(nextId);
  }
}
