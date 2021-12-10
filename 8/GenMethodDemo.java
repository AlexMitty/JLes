public class GenMethodDemo {
    public static <T, V> boolean isIn(T x, V[] array) {
        for (V element : array) {
            if (x.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};

        if (isIn(2, intArray)) {
            System.out.println("2 входит в массив intArray");
        }
    }
}
