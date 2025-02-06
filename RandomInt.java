import java.util.concurrent.ThreadLocalRandom;

public class RandomInt {

    public static void RandomNo(int no1, int no2) {

        System.out.println("Random number is " + ThreadLocalRandom.current().nextInt(no1, no2));
    }

    public static void main(String args[]) {
        int no1 = 12;
        int no2 = 88;

        RandomNo(no1, no2);
    }
}
