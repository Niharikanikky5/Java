package sept20092024;
//
//Ternary Operators to handle multiple conditions.
//
//// Input → int score = 85
//// String grade →
////  score >= 90 → A
////  score >= 80 → B
////  score >= 70 → C
public class Task_2 {
    public static void main(String[] args) {
        int score = 85;

        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "F";
        System.out.println(grade);
    }
}