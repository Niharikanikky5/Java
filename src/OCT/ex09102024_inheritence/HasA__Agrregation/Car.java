package OCT.ex09102024_inheritence.HasA__Agrregation;

public class Car {
    // Car Has-A Engine, Tyre
    protected void startCar(){
        new Engine().start();
        new Tyre().rolling();
    }
}
