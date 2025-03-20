public class NumberincreasingreversePyramidPattern {

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            int counter = 0;
            for (int j = 0; j < (7 - i); j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

}
