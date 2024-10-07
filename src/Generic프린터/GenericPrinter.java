package Generic프린터;

// <T extends Material> Material 클래스로부터 상속 받은 타입만 올 수 있음
public class GenericPrinter<T extends Material> { // Powder, Plastic 에 뿌려주는 역할
    private T material; // T 타입 변수 재료의 형태가 결정

    public void setMaterial(T material){ // material 설정 받음
        this.material = material;
    }
    public T getMaterial(){
        return material;
    }
    public String toString(){
        material.toString();
        return material.toString();
    }
    public void printing(){
        material.doPrinting();
    }
}
