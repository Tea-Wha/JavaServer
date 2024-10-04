package 다중인터페이스;

public class MultiInterface {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.sell();
        customer.buy();
        customer.order();
        
    }
}

interface Buy {
    void buy();
    default void order(){ // 구현부가 있으면 오버라이딩 해도 되고 안해도 됨
        System.out.println("구매 주문");
    }
}
interface Sell {
    void sell();
    default void order(){ // 겹치는 메소드가 있다면 -> 오버라이딩을 해야 문제가 해결된다.
        System.out.println("판매 주문");
    }
}
class Customer implements Buy,Sell{

    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void order() {
        System.out.println("고객 주문");
    }

    @Override
    public void sell() {
        System.out.println("판매하기");
    }
}