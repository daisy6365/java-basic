package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    /**
     * 정적(static) 메서드
     * 때문에 static 변수와 메서드만 접근 및 사용이 가능
     * 인스턴스 변수와 메서드는 compile 에러 발생
     */
    public static void staticCall() {
        //instanceValue++; //인스턴스 변수 접근, compile error
        //instanceMethod(); //인스턴스 메서드 접근, compile error

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    // 참조값을 parameter로 전달한다면 당연히 해결 가능함
    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }


    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
