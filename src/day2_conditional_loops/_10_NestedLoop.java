package day2_conditional_loops;

public class _10_NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int n = 5;

        String pattern = "";
        for (int i = 0; i < 5; i++) {
            pattern += "*";
            System.out.println(pattern);
        }
    }
}
