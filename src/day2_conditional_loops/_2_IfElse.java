package day2_conditional_loops;

public class _2_IfElse {

    public static void main(String[] args) {
        // harga barang
        int beras = 100;
        int minyak = 200;
        int telur = 100;
        var uangSaya = 500;
        var totalBelanja = 400;

        if (uangSaya >= totalBelanja) {
            System.out.println("Cukup untuk berbelanja :)");
        } else {
            System.out.println("Tidak cukup untuk berbelanja :(");
        }

        System.out.println("==========");

        if (uangSaya > beras) {
            System.out.println("Cukup untuk beli Beras dengan uang kembalian");
        } else if (uangSaya == beras) {
            System.out.println("Pas untuk beli beras tanpa uang kembalian");
        } else {
            System.out.println("Tidak cukup untuk beli beras");
        }

        System.out.println("==========");

        if (uangSaya > telur) {
            System.out.println("Cukup untuk beli telur dengan uang kembalian");
        }
        if (uangSaya > minyak) {
            System.out.println("Cukup untuk beli minyak dengan uang kembalian");
        } else if (uangSaya <= minyak) {
            System.out.println("Uang saya bisa jadi kurang atau ngepas untuk beli minyak");
        }
    }
}
