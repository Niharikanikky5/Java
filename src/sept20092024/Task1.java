package sept20092024;
// By using Ternary Operators max between 3 numbers.

//// Input int - a,b,c - a = 10, b = 20, c = 45

//// Max → a,b,c → c
public class Task1 {
    public static void main(String [] args) {
        int a = 10;
        int b = 20;
        int c = 45;
        String max = (a > b && a > c) ? "a" : (b > a && b > c) ? "b" : (c > a && c > b) ? "c" : "Two numbers are equal";
        System.out.println(max);
    }

}
