public enum Enumerator {
    English(26), Russian(33), Ukrainian(33), Italian(26);
    int numChar;
    Enumerator() {
        numChar = 0;
    }
    Enumerator(int numChar) {
        this.numChar = numChar;
    }

    public static void main(String[] args) {
        Enumerator lng = Enumerator.valueOf("Russian");
        System.out.println("Language contains " + lng + ": " + lng.numChar);
    }
}
