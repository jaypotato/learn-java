package day3_method;

public class _2_MethodParameter {
    public static void main(String[] args) {
        reportSuhu(10);
        reportSuhu(20);
        reportSuhu(30);
    }

    static void reportSuhu(double suhu) {
        double suhuFahrenheit = (suhu * 9.0/5.0) + 32;
        System.out.println("Suhu saat ini: " + suhu + "°C/" + suhuFahrenheit + "°F");
    }
}
