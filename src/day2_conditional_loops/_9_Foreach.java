package day2_conditional_loops;

public class _9_Foreach {
    public static void main(String[] args) {
        String[] sembako = {"beras", "gula", "telur"};

        for(int i = 0; i < sembako.length; i++) {
            System.out.println(sembako[i]);
            if (sembako[i] == "gula") {
                System.out.println("gula itu manis");
            }
        }

        System.out.println("==========");

        for(String barang: sembako) {
            System.out.println(barang);
            if (barang == "gula") {
                System.out.println("gula itu manis");
            }
        }
    }
}
