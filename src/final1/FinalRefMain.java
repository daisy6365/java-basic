package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        // 객체를 final로 둠 -> 참조형 -> 단 한번만 초기화 가능함
        final Data data = new Data();
        // -> 참조대상을 변경할 수 없음
        //data = new Data();

        //참조 대상의 "값"은 변경 가능
        // 멤버 변수는 변경 가능
        // 왜 ? value는 data의 참조형 변수이기 때문에.
        // int -> primitive type 아님?
        // new Data했기 때문에 참조형임
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
