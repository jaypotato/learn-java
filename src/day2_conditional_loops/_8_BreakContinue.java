package day2_conditional_loops;

public class _8_BreakContinue {
    public static void main(String[] args) {
        for(var counter = 1;counter <= 10; counter++) {
            if (counter == 9) {
                System.out.println("Berhenti di angka 9");
                break;
            }

            if(counter%2 == 0) {
                System.out.println("Saya genap pada counter " + counter);
            } else {
                continue;
            }
            System.out.println("Hanya dijalankan saat genap " + counter);
        }
    }
}
