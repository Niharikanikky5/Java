package OCT.ex11102024_Encapsulation.Encap.superkeyword;

public class LAb141 {
    public static void main(String[] args) {
//        BaseClass t2 = new BaseClass();
//        TestCase1 t3 = new TestCase1();
        Baseclass t1 = new TestCase1(); //Dynamic Dispatch
        // TestCase1 t1 = new BaseClass();

        // Dynamic Dispatch
        t1.openBrowser("edge");
        t1.closeBrowser();

    }
}
