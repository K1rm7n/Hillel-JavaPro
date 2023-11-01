package HW3;

public class Dog extends Animal{
    static int dogCounter = 0;
    public Dog(String name) {
        super(name, 500, 10);
        dogCounter++;
    }

    public static int getDogCounter() {
        return dogCounter;
    }
}
