package task_3_inheritence;

public class Dog extends Animal {
    private final int maxDistance = 300;
    private static int dogCount;

    public Dog() {
        super.maxDistance = this.maxDistance;
        super.swim = true;
        incrementDog();
    }

    public static void incrementDog() {
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }


}

