package sept25092024Task;
//Prime Number from 1 to 100. (for loop)
public class Lab003 {
    public static void main(String[] args) {
        int num = 2;
        System.out.println("Prime numbers between 1 and 100 are:");
        for (num = 2; num <= 100; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
