package day3_method;

public class _7_VariableScope {
    public static void main(String[] args) {
        String name = "Joko";
        System.out.println("variable name di main: " + name);
        greet("Bambang");

        for (int i = 0; i < 10; i++) {
            System.out.println("variable i di for: " + i);
        }
        System.out.println(i); // Error variable i tidak berada di scope yang sama
    }

    static void greet(String name) {
        System.out.println("variable name di greet: " + name);
    }
}
