public class ZeroOneTrianglePattern {

    public static void main(String[] args) {
        int counter = 0;
        int d = 0;
        for (int i = 0; i < 7; i++) {

            if (d == 0) {
                counter = 1;
                d = 1;
            } else {
                counter = 0;
                d = 0;
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(counter + " ");
                if (counter == 0) {
                    counter = 1;
                } else {
                    counter = 0;
                }
            }
            System.out.println();
        }
    }

}
