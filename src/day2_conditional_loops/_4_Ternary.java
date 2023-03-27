package day2_conditional_loops;

public class _4_Ternary {

    public static void main(String[] args) {
        var uangSaya = 500;
        var totalBelanja = 400;

        if (uangSaya >= totalBelanja) {
            System.out.println("Cukup untuk berbelanja :)");
        } else {
            System.out.println("Tidak cukup untuk berbelanja :(");
        }

        var kesimpulan = uangSaya >= totalBelanja ? "Cukup untuk berbelanja :)" : "Tidak cukup untuk berbelanja :(";
        System.out.println(kesimpulan);

        // not valid
//        uangSaya >= totalBelanja ? System.out.println("cukup") : System.out.println("kurang");
    }
}
