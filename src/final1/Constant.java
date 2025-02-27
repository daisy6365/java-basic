package final1;

/**
 * 상수
 * public 이기 때문에 어디에서나 접근 가능
 * 전반적으로 변수를 사용해야하는 설정값들이 있기 때문에,
 * 이러한 상수들은 public으로 두고 사용한다.
 *
 * @ Runtime에 값을 변경할 수 없다. 상수를 변경하려면 프로그램을 종료하고, 코드를 변경해야 함
 */
public class Constant {
    //수학 상수
    public static final double PI = 3.14;
    //시간 상수
    public static final int HOURS_IN_DAY = 24;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int SECONDS_IN_MINUTE = 60;
    //애플리케이션 설정 상수
    public static final int MAX_USERS = 2000;
}