package day3_method;

public class _3_MethodWithReturnValue {
    public static void main(String[] args) {
        reportSuhu(10);
        reportSuhu(20);
        reportSuhu(30);
    }

    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0/5.0) + 32;
    }

    static void reportSuhu(double suhu) {
        System.out.println("Suhu saat ini: " + suhu + "°C/" + celsiusToFahrenheit(suhu) + "°F");
    }
}
