package extends1.super2;

public class ClassC extends ClassB {
    /**
     * 자식 클래스의 생성자를 만들면,
     * 반드시 부모 클래스의 생성자도 자동으로 만들어짐
     */
    public ClassC() {
        // super (15); -> 생성자 종류에 따라 선택 가능
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
}
