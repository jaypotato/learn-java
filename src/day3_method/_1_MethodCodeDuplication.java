package day3_method;

public class _1_MethodCodeDuplication {
    public static void main(String[] args) {
        double suhu = 10; // dalam celcius
        double suhuFahrenheit = (suhu * 9.0/5.0) + 32;
        System.out.println("Suhu saat ini: " + suhu + "°C/" + suhuFahrenheit + "°F");

        suhu = 20;
        suhuFahrenheit = (suhu * 9.0/5.0) + 32;
        System.out.println("Suhu saat ini: " + suhu + "°C/" + suhuFahrenheit + "°F");

        suhu = 30;
        suhuFahrenheit = (suhu * 9.0/5.0) + 32;
        System.out.println("Suhu saat ini: " + suhu + "°C/" + suhuFahrenheit + "°F");
    }
}
