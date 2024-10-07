package Generic프린터;

public class Powder extends Material{
    @Override
    public void doPrinting(){
        System.out.println("Powder 재료로 출력 합니다.");
    }
    @Override // Object 클래스 오버라이딩
    public String toString(){ // toString 은 오버라이딩을 해서 이용 (기존에는 class+@+해시코드 16진수)
        return "재료는 Powder 입니다.";
    }
}
