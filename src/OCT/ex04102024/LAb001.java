package OCT.ex04102024;

public class LAb001 {
    public static void main(String[] args) {
        Ahuman amit = new Ahuman();
        Ahuman pramod = new Ahuman("Nikky");
        Ahuman vijay = new Ahuman("Puppy");
        System.out.println(amit.planet);
        System.out.println(pramod.planet);



        System.out.println(amit.name);
        System.out.println(pramod.name); // Pramod
        System.out.println(vijay.name); // Vijay

    }
}
