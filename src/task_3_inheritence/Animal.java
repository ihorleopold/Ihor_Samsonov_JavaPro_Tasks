package task_3_inheritence;

public abstract class Animal {

    private static int animalCount;
    protected int maxDistance;
    protected boolean swim;

    public Animal() {
        incrementAnimalCount();
    }

    void run(int distance) {
        if (distance > 0 && distance <= maxDistance) {
            System.out.println("It's running");
        } else {
            System.out.println("Try again");
        }

    }

    void swim(int distance) {
        if (swim && (distance > 0 && distance <= maxDistance)) {
            System.out.println("It's swimming");
        } else {
            System.out.println("It's not swimming");
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public static void incrementAnimalCount() {
        Animal.animalCount = animalCount++;
    }
}
