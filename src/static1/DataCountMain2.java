package static1;

public class DataCountMain2 {

    /**
     * public의 counter 변수를 가진 객체 생성
     * Data 인스턴스가 해당 counter를 가지고 다님
     * -> counter 인스턴스를 공용으로 사용함
     */
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count=" + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count=" + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count=" + counter.count);
    }
}
