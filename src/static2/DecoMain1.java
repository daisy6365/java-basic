package static2;

public class DecoMain1 {

    /**
     * 문자를 변환하기 위한 기능을 만듦
     * 문자 변환기능은 deco()메서드를 통해 작동
     * 하지만 인스턴스생성을 하는 불필요성이 존재함
     */
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1(); // 굳이 인스턴스를 생성?
        // 인스턴스가 애초에 왜 있나.
        // 인스턴스는 내부 인스턴스 변수를 활용하여 기능을 제공함. 기능만 제공하지 않음
        String deco = utils.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
