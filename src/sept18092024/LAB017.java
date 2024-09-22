package sept18092024;

public class LAB017 {
    public static void main(String[] args) {
       // int a = 10;
       // System.out.println(++a + a++ + a++);
        //System.out.println(a);
        //  Part ->  A -> ++a , Exp1 = 11 , a = 11
        //  Part ->  B -> a++ , Exp2 = 11 , a = 12
        //  Part ->  C -> a++, Exp3 = 12 , a = 13

        int a = 12;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        //  Part ->  A -> ++a , Exp1 = 13 , a = 13
        //  Part ->  B -> a++ , Exp2 = 13 , a = 14
        //  Part ->  C -> a++, Exp3 = 14 , a = 15
    }
}