package ZPRACTICE;

public class Pyramid {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < 5; i++) {

            for (int j = (i * 2); j >= 0; j--) {

                System.out.print("*");
            }

            System.out.println();
        }

    }
}
