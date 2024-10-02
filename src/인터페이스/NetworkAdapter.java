package 인터페이스;

public interface NetworkAdapter {
    void connect(); // 인터페이스 포함되는 메소드는 추상 메소드 (자동으로 public abstract 가 붙음)
}
class WiFi implements NetworkAdapter{
    String company;
    WiFi(String company){
        this.company = company;
    }

    @Override
    public void connect(){
        System.out.println(company+" WiFi에 연결 되었습니다.");
    }

}
class FiveG implements NetworkAdapter{
    String company;
    FiveG(String company){
        this.company = company;
    }

    @Override
    public void connect(){
        System.out.println(company+" 5G에 연결 되었습니다.");
    }

}
class Lte implements NetworkAdapter{
    String company;
    Lte(String company){
        this.company = company;
    }

    @Override
    public void connect(){
        System.out.println(company+" LTE에 연결 되었습니다.");
    }

}
