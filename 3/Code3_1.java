class Code3_1 {
  public static void main(String[] args) {
    int numLetters = switch(day) {
    case MONDAY, FRIDAY, SUNDAY -> 6; 
    case TUESDAY -> 7; 
    case THURSDAY, SATURDAY -> 8;
    default -> 9; 
    }
  }
} 
