package 데몬쓰레드;
// 다른 스레드의 작업들 돕는 보조적인 역할을 수행하는 스레드
// 데몬 스레드 이외의 스레드가 모두 종료되면 데몬 스레드도 강제 종료
// start() 메소드 호출 전에 setDaemon(true)를 호출해야 함

public class DaemonThreadEx {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true); // 데몬 스레드 적용
        autoSaveThread.start();
        Thread.sleep(30000); // 메인 슬립이 끝나면 -> 메인 끝남

    }
}

class AutoSaveThread extends Thread{
    public void save(){
        System.out.println("작업 내용을 저장합니다.");
    }
    @Override
    public void run(){ // run method 는 start 시 시작되는 메소드
        while (true){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){}
            save();
        }
    }
}