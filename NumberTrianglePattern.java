public class NumberTrianglePattern {

    public static void main(String args[]) {

        int counter = 1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <= (7 - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(counter + " ");
            }

            System.out.println();
            counter++;
        }
    }
}
