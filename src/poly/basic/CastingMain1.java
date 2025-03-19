package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child(); //x001
        //단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod();

        //다운캐스팅(부모 타입 -> 자식 타입)
        // 다운캐스팅을안하면 컴파일 오류가 발생
        /**
         * 1. 다운캐스팅을 통해 부모타입을 자식타입으로 변환
         * 2. 참조 값을 읽은 다음 Child로 지정
         * 3. poly가 자식타입이 된 것? X.
         * 해당 참조값을 꺼내서 타입을 Child로 변경한 것
         */
        Child child = (Child) poly; //x001
        child.childMethod(); // Child 인스턴스의 기능을 호출 가능
    }
}
