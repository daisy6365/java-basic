package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        // 아래에 존재하는 또다른 생성자를 먼저 호출 함
        this(a, 0); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        super(); //기본 생성자 생략 가능 -> ClassA에 parameter가 없기 때문에
        System.out.println("ClassB 생성자 a=" + a + " b=" + b);
    }
}
