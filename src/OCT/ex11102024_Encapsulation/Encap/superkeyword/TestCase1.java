package OCT.ex11102024_Encapsulation.Encap.superkeyword;

public class TestCase1 extends Baseclass{
    // TestCase is A Type of BaseClass - Single Inheritance
    TestCase1(){
        super();// DC of parent
        this.setBrowser("edge",true);
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        System.out.println("Own Logic");
        super.setBrowser(browser,isAuth);
    }
}
