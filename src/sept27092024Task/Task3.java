package sept27092024Task;
//Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop.
public class Task3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 100){
            sum += i ; i++;
        }
        System.out.println("The sum is" +sum);
    }
}
