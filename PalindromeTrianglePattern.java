public class PalindromeTrianglePattern {

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            int counter = 0 + i;
            int counter1 = 1;
            for (int j = 0; j < (7 - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(counter);
                counter--;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(counter1);
                counter1++;
            }
            System.out.println();
        }
    }

}
