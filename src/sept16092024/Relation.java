package sept16092024;

public class Relation {
    public static void main(String[] args) {
        // Relational Operators  = boolean
        //  > < , >= <= , != , ! -> true or false
        int a = 10;
        int b = 30;
        boolean c = a > b;
        System.out.println(c);
        int age_nikky = 34;
        int age_niha = 34;
//        boolean result = age_niha > age_nikky; // false
        boolean result = age_nikky >= age_niha; // false //
        // age_niha > age_nikky or age_niha =age_nikky;;
        System.out.println(result);
    }
}