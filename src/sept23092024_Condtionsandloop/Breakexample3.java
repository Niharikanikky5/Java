package sept23092024_Condtionsandloop;

public class Breakexample3 {

    public static void main(String[] args) {
        // Switch Condition
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Thur");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");
            default:
                System.out.println("No idea, what day its");
        }
        System.out.println("End of the loop");

    }
}
