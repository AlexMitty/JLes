class StringBuilderDemo {  
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();
    sb.append(new Integer(2))
            .append("; ")
            .append(false)
            .append("; ");
    System.out.println(sb.toString());
  }
}
