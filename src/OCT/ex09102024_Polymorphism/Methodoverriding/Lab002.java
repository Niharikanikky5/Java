package OCT.ex09102024_Polymorphism.Methodoverriding;

public class Lab002 {
    public static void main(String[] args) {
//        Nikky p = new Nikky();
//        p.home();
//
//        Father f  = new Father();
//        f.home();
//

        // Dynamic Dispatch
        Father object = new Nikky();
        object.home();

        // WebDriver driver = new ChromeDriver();

        // Not possible
        // Pramod object = new Father();

    }
}
