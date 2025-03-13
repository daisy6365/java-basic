package final1;

public class FieldInit {

    /**
     * 두개의 차이
     * static final 상수
     * static, method의 static 영역을 사용한다,
     * JVM 메모리 사용이 적은 편
     *
     * final 필드
     * class의 멤버변수 이기 때문에 Heap 영역을 사용한다.
     * 생성자가 선언되고 초기화 될 때마다 JVM 메모리를 사용한다.
     */
    static final int CONST_VALUE = 10;
    final int value = 10;

}