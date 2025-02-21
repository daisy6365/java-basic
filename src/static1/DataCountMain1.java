package static1;

public class DataCountMain1 {

    /**
     * 당연히 결과는 count가 누적 되지 않음
     * 왜냐? 각 data들에 대한 인스턴스는 새로 Heap영역에 생성되기 때문
     * count++를 할때마다 새로운 인스턴스에 새로 증가를 시킴
     */
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count=" + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count=" + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count=" + data3.count);
    }
}
