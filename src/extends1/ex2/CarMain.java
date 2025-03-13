package extends1.ex2;

public class CarMain {

    public static void main(String[] args) {
        /**
         * 인스턴스 생성한 순간.
         * 자식 (ElectricCar) + 부모 (Car)가 한 메서드 영역에 같이 생김
         */
        ElectricCar electricCar = new ElectricCar();
        // 호출된 변수의 타입인 ElectricCar 를 먼저 탐색
        // 없음 -> 부모 Car로 가서 찾음
        electricCar.move(); // 상속한 부모한테 존재
        // 호출된 변수의 타입인 ElectricCar 를 먼저 탐색
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move(); // 상속한 부모한테 존재
        gasCar.fillUp();
    }
}
