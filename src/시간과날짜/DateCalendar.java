package 시간과날짜;
// lcoal date time
// Data 클래스 : 자바 초기 버전 부터 제공되는 클래스
// java.util 패키지에 포함되어 있음
// Date 객체는 UTC(협정 시계시)를 기준으로 1970년 1월 1일 자정부터 경과 시간 계산 (밀리초 단위)
// 불변성 없음, 현재 실무에서 거의 사용되지 않음
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalendar {
    public static void main(String[] args) {
        DateFunc();
        calendarFunc();
    }
    static void DateFunc(){
        Date date = new Date();
        SimpleDateFormat f1,f2,f3,f4,f5,f6,f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd"); // 2024-10-07
        f2 = new SimpleDateFormat("yy/MM/dd"); // 24/10/07
        f3 = new SimpleDateFormat("yyyy년MM월dd일"); // 2024년10월07일
        f4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); // 2024-10-07 11:16:47
        f5 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날입니다."); // W -> 달에서 몇번째
        f6 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다."); // w -> 년에서 몇번째
        f7 = new SimpleDateFormat("오늘은 yyyy년 MM월 dd일 입니다.");
        System.out.println(f1.format(date));
        System.out.println(f2.format(date));
        System.out.println(f3.format(date));
        System.out.println(f4.format(date));
        System.out.println(f5.format(date));
        System.out.println(f6.format(date));
        System.out.println(f7.format(date));
    }
    // Calender 클래스 : Date 클래스의 단점을 보완하기 위해서 도입됨
    // java.util 포함
    // Calendar는 추상클래스로, 특정 국가나 문화의 달력 시스템에 맞게 하위 클래스가 구현
    static void calendarFunc(){
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+1); // 인덱스 배열 맞추기 위해 +1
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.AM_PM));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));

    }
}
