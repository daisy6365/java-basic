package final1;

public class ConstantMain1 {

    /**
     * 이러한 부분에서 참여자 수를 변경하고 싶을 때,
     * main() -> 1000 과 process() -> 1000을 변경해야함
     * 이러한 부분을 상수로 변경하여
     * 참여자 수를 변경하고 싶을 때, 상수 값만 변경하면 됨
     */
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + 1000);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수:" + currentUserCount);
        if (currentUserCount > 1000) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
