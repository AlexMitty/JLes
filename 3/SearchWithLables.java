class SearchWithLables {
    static boolean found;

    public static void main(String[] args) {
        int[][] matrix = new int[][] {{4,2,4}, {23, 112, 442}};

        outer :
        for (int [] row : matrix) {
            for (int x : row) {
                if (x > 100) {
                    found = true ;
                    break outer ;
                }
            }
        }
        System.out.println(found);
    }
}
