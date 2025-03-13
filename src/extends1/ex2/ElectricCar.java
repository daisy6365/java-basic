package extends1.ex2;

/**
 * 자식은? 부모에 대해 앎
 */
public class ElectricCar extends Car {
    /**
     * charge() 기능 뿐만 아니라 move() 기능 또한 사용 가능
     */
    public void charge() {
        System.out.println("충전합니다.");
    }
}
