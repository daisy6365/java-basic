package static1;

/**
 * static 변수를 통해 공용으로 함께 사용할 수 있는 변수를 만듦
 * staitc이 왜 공용의 개념인가 ?
 * : static변수는 Method 영역.
 * -> 프로그램을 실행하는데 공통의 정보를 관리
 */
public class Data3 {
    public String name;
    public static int count; //static

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
