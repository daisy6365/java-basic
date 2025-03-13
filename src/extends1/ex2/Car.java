package extends1.ex2;

/**
 * 부모는 상속받은 자식에 대해 모름
 */
public class Car {
    /**
     * Car는 부모 클래스.
     * 부모 클래스는 공통적인 기능인 move()가 존재, 자식 모두가 사용 가능함
     */
    public void move() {
        System.out.println("차를 이동합니다.");
    }
}
