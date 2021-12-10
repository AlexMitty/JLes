public class GenericDemo<T> {
    private T first;
    private T second;
    public GenericDemo() { first = null; second = null; }
    public GenericDemo(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() { return first; }
    public T getSecond() { return second; }
    public void setFirst(T newValue) { first = newValue; }
    public void setSecond(T newValue) { second = newValue; }

    public static void main(String[] args) {
        GenericDemo<String> genericDemo = new GenericDemo<String>("Ваня", "Маша");
        GenericDemo<String> nullGenericDemo = new GenericDemo<String>();
        System.out.println(genericDemo.getFirst());
    }
}
