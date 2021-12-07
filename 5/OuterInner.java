class OuterInner {
  int field = 42;
  class Inner {
      //поле вложенного класса перекрывает поле внешнего класса
        int field = 18;
        public void show() {
          System.out.println(OuterInner.this.field);
          }
      }
}
