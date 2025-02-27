package final1;

public class ConstructInit {
    // 클래스의 final 변수
    // 초기값을 선언하면 생성자를 통해서도 할당 불가
    final int value;

    // 생성자를 통해 값을 할당. -> 이후에는 할당 불가
    public ConstructInit(int value) {
        this.value = value;
    }
}
