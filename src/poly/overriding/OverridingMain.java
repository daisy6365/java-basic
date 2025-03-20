package poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {
        /**
         * [자식 변수가 자식 인스턴스 참조]
         * Parent Child 둘다 메모리 영역에 존재
         * 하지만 자식 타입&인스턴스 이므로
         * method()는 자식 에서 찾아서 호출
         */
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        /**
         * [부모 변수가 부모 인스턴스 참조]
         * Parent 만 메모리 영역에 존재
         * method()는 부모에서 찾아서 호출
         */
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        /**
         * [부모 변수가 자식 인스턴스 참조] -> 다형적 참조
         * Parent Child 둘다 메모리 영역에 존재
         * 오버라이딩 된 메서드인 child.method()가
         * 우선권을 가짐.
         * Child에서 찾아서 호출
         */
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); //변수는 오버라이딩X
        poly.method(); //메서드 오버라이딩!
    }
}
