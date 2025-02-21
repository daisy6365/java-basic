package static1;

/**
 * 클래스를 통해 생성되 객체의 수를 세고자 함
 */
public class Data1 {
    // 예제를 단순하게 설명하기 위해 접근제어자 배제
    public String name;
    public int count;

    public Data1(String name) {
        this.name = name;
        count++;
    }
}
