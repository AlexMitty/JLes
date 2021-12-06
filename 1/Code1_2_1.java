public class Code1_2_1 {
    String name;
    int age;

    Code1_2_1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.printf("Name: %s \t Age: %d \n", name, age);
    }
}
