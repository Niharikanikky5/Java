package sept20092024;

public class Leapyear {
    public static void main(String []args){
        int num=2032;
        if(num%4==0 || num%100 ==0 && num%400==0)
            System.out.println(num +" is a leapyear");
        else
        System.out.println(num +" is not a leapyear");

    }
}
