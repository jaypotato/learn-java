package day5_oop;

public class _1_Class {
    public static void main(String[] args) {
        Car jazz;
        jazz = new Car();
        jazz.brand = "Honda";
        jazz.color = "Red";
        jazz.model = "Jazz";

        jazz.accelerate();
        System.out.println(jazz.brand);
    }
}
