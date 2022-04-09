package oop_principles.class_objects;

public class Animal {


    public Animal(String name, String color, int age, boolean isHerbivore, boolean isCarnivore, boolean isOmnivore){
        this.name = name;
        this.color = color;
        this.age = age;
        this.isHerbivore = isHerbivore;
        this.isCarnivore = isCarnivore;
        this.isOmnivore = isOmnivore;
    }

    //fields of an animal instance
    public static int noOfAnimals = 0;
    public static final boolean hasEyes = true;
    public String name;
    public int age;
    public String color;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isCarnivore=" + isCarnivore +
                ", isHerbivore=" + isHerbivore +
                ", isOmnivore=" + isOmnivore +
                '}';
    }

    //testing animal
    public static void main(String[] args) {
        Animal a1 = new Animal("Cow", "Black", 3, true, false, false);

        System.out.println(a1);

        Animal a2 = new Animal("Cat", "Gray", 1, false, false, true);

        System.out.println(a2);



    }








}
