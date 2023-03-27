package day2_conditional_loops;

public class _1_ComparisonOperators
{
    public static void main(String[] args) {
        // harga barang
        int beras = 100;
        int minyak = 200;
        int telur = 100;

        System.out.println("apakah beras > minyak: " + (beras > minyak));
        System.out.println("apakah beras < minyak: " + (beras < minyak));
        System.out.println("apakah beras == minyak: " + (beras == minyak));
        System.out.println("apakah beras != minyak: " + (beras != minyak));
        System.out.println("apakah beras >= telur: " + (beras >= telur));
        System.out.println("apakah beras <= telur: " + (beras <= telur));

        var minyakPalingMahal = minyak > beras && minyak > telur;
        System.out.println("apakah minyak paling mahal: " + minyakPalingMahal);

        System.out.println("negasi dari minyakPalingMahal: " + !minyakPalingMahal);

        var uangSaya = 120;
        System.out.println("apakah saya bisa beli salah satu dari sembako: " +  (uangSaya >= beras || uangSaya >= minyak || uangSaya >= telur));
    }
}


