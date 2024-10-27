package OCT.ex09102024_Polymorphism.Methodoverlodding;

public class Lab001 {
    public static void main(String[] args) {
        Mathoperation m = new Mathoperation();

        int result = m.add(3,4);
        System.out.println(result);


        String name = m.add("Niharika","Nikky");
        System.out.println(name);
}
    }