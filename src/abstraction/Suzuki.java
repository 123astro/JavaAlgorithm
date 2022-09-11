package abstraction;

public class Suzuki extends Car {

    @Override
    public void accelerate() {
        System.out.println("Suzuki:: accelerate");
    }

    @Override
    public void hasGas(){
        System.out.println("Tank is almost empty");
    }
}
