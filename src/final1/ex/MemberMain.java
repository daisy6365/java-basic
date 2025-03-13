package final1.ex;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();
        // changeData를 통해 값을 변경하려고 해도,
        // final값이니까 변경되지 않은 채 "myId"로 출력 됨
        member.changeData("myId2", "seo");
        member.print();
    }
}
