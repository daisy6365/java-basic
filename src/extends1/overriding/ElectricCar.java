package extends1.overriding;

public class ElectricCar extends Car {

    /**
     * @Override를 통해 부모로부터 상속된 기능을 재정의 함을 표시함
     * 이동한다 -> 빠르게 이동한다.
     *
     * 해당 어노테이션을 통해 컴파일 시 오버라이드를 확인함
     */
    @Override
    public void move() {
        // 이미 자식 인스턴스에 move() 메서드가 존재하기 때문에, 부모값을 탐색하러 가지 않음
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
