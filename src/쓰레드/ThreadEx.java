package 쓰레드;
// 개념이 중요
// 자바 -> 멀티 스레드 / 자바 스크립트 -> 비동기
// 모든 자바 어플리케이션은 Main Thread가 main() 메소드를 실행하면서 시작
// 멀티 스레드는 메인 스레드가 종료되더라도 실행 중인 스레드가 하나라도 있다면 프로세스는 종료되지 않는다.
// 멀티스레드란? 하나의 어플리케이션 내에서 동시에 여러가지 일을 수행하는 것
// 자바는 main() 메소드 호출 시 하나의 스레드가 생성됨
// 멀티스레드가 수행중인 경우 main() 스레드가 종료 되더라도 어플리케이션은 종료되지 않음
// 스레드 생성 방법
// - Thread 클래스를 상속 하는 방법 (상속 받으면 다른 상속을 받을 수 없음) -> Thread 는 클래스
// - Runnable 인터페이스를 상속받아 구현하는 방법 -> Runnable 은 인터페이스
// 우선 순위 방식 -> thread.setPriority(1) : 우선 순위 가장 낮음 / thread.setPriority(1) : 우선 순위 가장 높음
// 순환 할당(Round-Robin) 방식

public class ThreadEx {
    public static void main(String[] args) {
        Thread subThread1 = new CustomThread(); // Thread 를 상속받은 객체 생성
        Runnable runTask = new CustomRunnable(); // 작업 내용은 가지고 있지만, 실제 Thread 동작은 없음
        Thread subThread2 = new Thread(runTask); // 스레드 객체 생성 (Thread 안쪽에 Runnable 변수 대입)
        // Runnable 인터페이스는 자바에만 있음
        subThread1.start(); // 운영체제한테 시작해달라고 요청
        subThread2.start();
        // Thread -> 병렬 진행 / Main 과 Thread 가 동시 진행
        
        // 익명의 객체로 만드는 방법 -> 많이 사용함
        Runnable task = new Runnable() { // 람다 ()->
            @Override
            public void run() {
                int sum = 0;
                for(int i = 0; i<=11; i++){
                    sum += i;
                    System.out.println(Thread.currentThread()+ " : " + sum);
                }
                System.out.println(Thread.currentThread() + "합계 : " + sum); // 순서 보장 안됨
            }
        };
        Thread subThread3 = new Thread(task); // 스레드로 변환, 만들어아됨
        subThread3.start();
        
    }
}

// Thread 클래스를 상속 받음
class CustomThread extends Thread{ // Thread 는 Runnable 인터페이스를 상속 받음
    @Override
    public void run(){ 
        int sum = 0;
        for(int i = 0; i<=10; i++){
            sum += i;
            System.out.println(Thread.currentThread()+ " : " + sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }
}
// Runnable 인터페이스 구현
class CustomRunnable implements Runnable{
    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i<=9; i++){
            sum += i;
            System.out.println(Thread.currentThread()+ " : " + sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }
}