package memory;

public class JavaMemoryMain2 {

    /**
     * 자바 실행 시
     * 맨 처음 Stack에 main() 프레임이 생성됨
     *
     * @@ 더이상 Data인스턴스를 참조하는 곳이 없음 @@
     * -> GC는 이렇게 참조가 모두 사라진 Heap영역의 인스턴스(Data)를 찾아서 메모리에서 제거
     * -> Heap 영역의 외부가 아닌, 내부에서 참조하는 경우에도 GC의 대상
     */
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    /**
     * main()은 method1()을 호출
     * method1() 프레임이 생성되어 쌓인다.
     * data1 변수가 프레임에 포함되고,
     * 참조값을 data1에 포함
     *
     * method1() 종료되면 data1을 참조하는 것이 사라짐
     */
    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10); // Heap영역에 인스턴스를 생성
        // data1을 넘겨줌, 변수 또한 스택 프레임에 포함
        method2(data1);
        System.out.println("method1 end");
    }

    /**
     * method1()은 method2()를 호출하면서,
     * data2 매개변수에 참조값을 넘김
     * data2에 대한 새로운 인스턴스? XXX
     * new Data를 하지 않았다. 그저 같은 인스턴스를 참조
     *
     * mehtod2()가 종료되면 참조하는 것도 사라짐 -> data2 제거
     *
     */
    static void method2(Data data2) {
        System.out.println("method2 start");
        // data2
        System.out.println("data.value=" + data2.getValue());
        System.out.println("method2 end");
    }

}
