package extends1.ex2;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 상속한 부모한테 존재
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move(); // 상속한 부모한테 존재
        gasCar.fillUp();
    }
}
