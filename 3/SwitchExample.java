class SwitchExample {
  public static void main(String[] args) {
    Days day = Days.FRIDAY;
    int numLetters = switch(day) {
    case MONDAY, FRIDAY, SUNDAY -> 6; 
    case TUESDAY -> 7; 
    case THURSDAY, SATURDAY -> 8;
    default -> 9; 
    }
  }
} 
