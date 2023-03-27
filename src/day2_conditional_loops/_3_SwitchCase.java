package day2_conditional_loops;

public class _3_SwitchCase {

    public static void main(String[] args) {
        String nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Kerja bagus");
                break;
            case "AB":
                System.out.println("Bagus");
                break;
            case "B":
                System.out.println("Cukup");
                break;
            case "BC":
                System.out.println("Tingkatkan lagi");
                break;
            case "C":
                System.out.println("Yang penting lulus");
                break;
            case "D": //fall-trough
            case "E":
                System.out.println("Waduh");
                break;
            default:
                System.out.println("Bukan nilai yang valid");
                break;
        }

//        int nilai = 100;
//
//        switch (nilai) {
//            case (int) 100.0:
//                System.out.println("Kerja bagus");
//                break;
//            case "100":
//                System.out.println("Bagus");
//                break;
//            case "B":
//                System.out.println("Cukup");
//                break;
//            case "BC":
//                System.out.println("Tingkatkan lagi");
//                break;
//            case "C":
//                System.out.println("Yang penting lulus");
//                break;
//            case "D": //fall-trough
//            case "E":
//                System.out.println("Waduh");
//                break;
//            default:
//                System.out.println("Bukan nilai yang valid");
//                break;
//        }

        System.out.println(100 == Integer.parseInt("100"));
    }
}
