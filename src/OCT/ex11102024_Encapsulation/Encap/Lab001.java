package OCT.ex11102024_Encapsulation.Encap;

public class Lab001 {
    public static void main(String[] args) {
        VWOLogin VWOLogin = new VWOLogin("admin", "password123");
        System.out.println(VWOLogin.password);
        VWOLogin.password = "hacker";
        System.out.println(VWOLogin.password);

        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("goodadmin", "admin123");
        // System.out.println(vwoLogin1.password);
        // vwoLogin1.password = "pass123";>?
        System.out.println(vwoLogin1.getPassword());

        // Checking Admin
        boolean isAdmin = false;

        // vwoLogin1.setYourKey("admin");

        vwoLogin1.setPassword("newpassword", isAdmin);
        System.out.println(vwoLogin1.getPassword());


    }
}