package HW3;

public class Main {
    public static void main(String[] args) {
        Cat Bart = new Cat("Bart");
        Dog Bobik = new Dog("Bobik");

        //random distances
        Bart.run(200);
        Bart.swim(100);
        Bobik.run(500);
        Bobik.swim(9);

        System.out.println("Animals in total: " + Animal.getAnimalCounter());
        System.out.println("Cats in total: " + Cat.getCatCounter());
        System.out.println("Dogs in total: " + Dog.getDogCounter());
    }
}