package OCT.ex11102024_Encapsulation.Encap.superkeyword;

public class Baseclass {

    private String browser;

    Baseclass(){
        System.out.println("DC - BaseClass");
    }
    Baseclass(String b){
        System.out.println("CC - BaseClass");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        }else{
            System.out.println("Not Allowed");
        }
    }

    void openBrowser() {
        System.out.println("Opening Browser!!");
    }

    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }
    void closeBrowser() {
        System.out.println("Close Browser!!");
    }
}
