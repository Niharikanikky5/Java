package OCT.ex09102024_inheritence.singleinheritance.ex2;

public class Python extends Programming {
    // Is A Programming
    public Python(){
        System.out.println("DC");
    }
    void print(){
        System.out.println(author);
        System.out.println(version);
    }
}
