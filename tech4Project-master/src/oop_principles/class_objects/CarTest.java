package oop_principles.class_objects;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println(car1);

        car1.make = "Tesla";
        car1.model = "S";
        car1.year = 2022;
        car1.color = "Red";

        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        Car car2 = new Car();

        car1.honks();

    }
}
