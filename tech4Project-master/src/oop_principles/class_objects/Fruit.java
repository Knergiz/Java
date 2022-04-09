package oop_principles.class_objects;

public class Fruit {

    public static boolean hasColor;
    public String name;
    public String shape;
    public boolean isSweet;


    public static void main(String[] args) {
        Fruit fruit1 = new Fruit();

        System.out.println(Fruit.hasColor);
        System.out.println(fruit1.name);
        System.out.println(fruit1.shape);
        System.out.println(fruit1.isSweet);
    }


}
