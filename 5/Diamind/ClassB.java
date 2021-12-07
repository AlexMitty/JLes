package test2.Diamind;

public interface ClassB extends ClassA {
    @Override
    default void doSomething() {
        System.out.println("SomeAnotherText");
    }
}
