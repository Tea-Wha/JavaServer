package 쓰레드종료;
// 스레드 안전한 종료 : 원래는 stop() 메소드가 존재했지만 현재는 사용 중지 되었음
// 대체 방법으로는 stop 플래그 사용하는 방식, interrupt() 메소드 사용하는 방식

public class ThreadStopEx {
    public static void main(String[] args) throws InterruptedException {
//        RunThread runThread = new RunThread();
//        runThread.start();
//        Thread.sleep(1000); // 현재 메인 thread 가 sleep 상태가 됨
//        runThread.setStop(true); // Stop 플래그 사용
        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();
        Thread.sleep(1000); // 메인 sleep
        interruptThread.interrupt();
    }
}

// Stop 플래그 사용 방식
class RunThread extends Thread{
    private boolean stop; // stop 플래그 설정

    public void setStop(boolean stop) {
        this.stop = stop;
    }
    @Override
    public void run(){
        while (!stop){
            System.out.println("Thread 실행 중......");
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    } // run method 가 끝나면 thread 종료 // stop -> dead lock 유발
}

class InterruptThread extends Thread {
    @Override
    public void run(){
        try{
            while (true){
                System.out.println("Thread 실행 중......");
                Thread.sleep(1); // Sleep 상태가 있어야만 외부 interrupt 를 받을 수 있음
                // 예외 발생 시 catch 쪽으로 넘어감
            }
        } catch(InterruptedException e){
            System.out.println(e+"예외 발생");
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}