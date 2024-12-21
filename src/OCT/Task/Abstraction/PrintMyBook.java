package OCT.Task.Abstraction;

public class PrintMyBook extends Book {

    PrintMyBook(String name,String author, String price){

        super(name,author,price);
        this.getDetails();
    }
    @Override
    void getDetails() {
        System.out.println(super.name +","+super.author+","+super.price);
    }
}
