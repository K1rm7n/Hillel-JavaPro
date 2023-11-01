package HW3;

public class Cat extends Animal{
    static int catCounter = 0;
    public Cat(String name) {
        super(name, 200, 0);
        catCounter++;
    }

    public static int getCatCounter() {
        return catCounter;
    }
}

