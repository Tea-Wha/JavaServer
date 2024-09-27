package 매개변수의다형성;

import 상속TV.ProductTV;

// 상속 관계를 이용해 매개변수에 자식 타입의 객체를 대입함
public class ParamPolyEx {
    public static void main(String[] args) {
        Buyer buyer = new Buyer(); // 구매자 객체 생성
        buyer.buy(new Computer()); // Product p = new TV() // new Computer() // new PlayStation()

        TV tv = new TV();
        buyer.buy(tv); // == buyer.buy(new TV());
        buyer.buy(new PlayStation()); // price와 bonusPoint가 전부 부모/자식에 있기 때문에 
        // 최종 계산이 가능하다
        buyer.viewInfo();
    }
}

class Product{
    int price;
    int bonusPoint;
}
class TV extends Product{
    public TV(){
        this.price = 100;
        this.bonusPoint = 10;
    }
}
class Computer extends Product{
    public Computer(){
        this.price = 200;
        this.bonusPoint = 20;
    }
}
class PlayStation extends Product{
    public PlayStation(){
        this.price = 120;
        this.bonusPoint = 12;
    }
}
class Buyer{
    int money = 1000;
    int bonusPoint = 0;
    void buy(Product p){ // 물건을 사는 행위 (buy method) // 부모 클래스에 대한 참조 변수
        // 부모 클래스 참조 -> 자식 클래스 객체 접근 가능
        // 클래스 buyer 에 속한 메소드
        money -= p.price;
        bonusPoint += p.bonusPoint;
    }
    void viewInfo(){ // 클래스 buyer 에 속한 메소드
        System.out.println("잔액 : "+money);
        System.out.println("포인트 : "+bonusPoint);
    }
}