package Generic프린터;

public class Nylon extends Material {
    @Override
    public void doPrinting(){
        System.out.println("Nylon 재료로 출력 합니다.");
    }
    @Override
    public String toString(){
        return "재료는 Nylon 입니다.";
    }
}
