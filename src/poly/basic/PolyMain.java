package poly.basic;

public class PolyMain {
    /**
     * 다형적 참조
     * 부모는 자식을 품을 수 있음
     *
     */
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent(); // 메모리 영역에 Parent만 생성됨
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child(); // 메모리 영역에 Child + Parent(상속) 생성됨
        child.parentMethod(); // 부모의 기능까지 접근 가능(상속받음)
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        // Parent 타입의 변수에 Child 인스턴스를 생성
        // 메모리 영역에 둘다 생성됨
        // 하지만 참조값은 Parent 타입의 변수에 담겨있음
        Parent poly = new Child();
        poly.parentMethod();

        // 자식 타입의 변수는 Parent 인스턴스를 생성 할 수없음 -> 컴파일 오류 발생
        //Child child1 = new Parent(); //자식은 부모를 담을 수 없다.

        /**
         * [다형적 참조의 한계]
         * 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
         * 부모가 자식의 기능을 상속받는다? XXX
         * 자식의 기능은 자식만 사용가능, 부모는 자식에게, 부모는 자기자신의 기능만.
         *
         * 왜 그럴까?
         * poly에 담겨있는 참조값을 통해 인스턴스를 찾음.
         * -> 그다음에 해당 인스턴스 안에서 실행할 타입을 찾음
         *
         * poly는 Parent 타입인데, 어떻게 child로 타고 내려가겠음?
         * 타고 올라가면서 참조 탐색은 가능하지만,
         * 타고 내려오면서 참조 탐색은 불가능 하다. 그림을 확인하자
         */
        //poly.childMethod();

    }
}
