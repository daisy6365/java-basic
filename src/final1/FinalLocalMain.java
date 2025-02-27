package final1;

public class FinalLocalMain {
    /**
     * final 로 선언된 변수는 최초 한번만 값할당이 가능
     * 이후 값을 변경하면 compile error 발생
     *
     * 오류내용
     * - Variable 'data1' might already have been assigned to
     */
    public static void main(String[] args) {
        //final 지역 변수1
        final int data1;
        data1 = 10; //최초 한번만 할당 가능
//        data1 = 20; //컴파일 오류

        //final 지역 변수2
        final int data2 = 10;
        //data2 = 20; //컴파일 오류
        method(10);
    }

    /**
     *
     * 메서드 호출 시, final로 된 parameter 값을 할당한다면
     * 이후 값변경이 불가능함
     * @param parameter
     */
    static void method(final int parameter) {
        //parameter = 20; //컴파일 오류
    }
}
