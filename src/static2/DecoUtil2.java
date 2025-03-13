package static2;

public class DecoUtil2 {

    /**
     * "static 메서드"로 전환
     * -> 인스턴스 생성 없이 클래스 명을 통해서 바로 호출 가능함
     */
    public static String deco(String str) {
        String result = "*" + str + "*";
        return result;
    }
}
