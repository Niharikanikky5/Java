package sept270920204Task;
//Create a Java program that prints the first 5 even numbers using a do-while loop.
public class Task1 {
    public static void main(String[] args) {
        int i = 1;
            while (i <= 10) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }
    }

