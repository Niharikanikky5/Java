package sept20092024;
//Ternary Operators to handle multiple conditions.
//
//// Input → int score = 85
//// String grade →
////  score >= 90 → A
////  score >= 80 → B
////  score >= 70 → C
public class Task2 {
    public static void main(String[] args){
char Grade = 'p';
        int score = 85;

            if (score >= 90 && score <= 100){
            Grade = 'A';
        }

         else if (score >= 80 && score <= 90){
            Grade = 'B';
        }
        else if (score >= 70 && score <= 80){
            Grade = 'c';
        }
            else
            {
            Grade = 'F';
        }
System.out.println(Grade);
    }
}
