package HW3;

public class Animal {
    String name;
    int runDistance = 0, swimDistance = 0;
    static int animalCounter = 0;

    public Animal(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        animalCounter++;
    }
    public void run(int distance){
        if(distance < runDistance)
            System.out.println(name + " run " + distance + "m");
        else
            System.out.println(name + " can't run this distance");
    }

    public void swim(int distance){
        if(distance < swimDistance)
            System.out.println(name + " swim " + distance + "m");
        else
            System.out.println(name + " can't swim this distance");
    }

    public static int getAnimalCounter() {
        return animalCounter;
    }
}