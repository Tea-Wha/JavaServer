package ArrayList실습;

import 필드와메소드.FieldAndMethodEx;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private ArrayList<Product> products; // ArrayList에 대한 참조 변수
    private BigDecimal total;

    public void initSet(){ // 인스턴스 필드의 초기값 설정
        this.products = new ArrayList<>(); // 초기 주소 대입 (초기화)
        this.total = BigDecimal.ZERO;
    }
    public void addItem(Product product){
        products.add(product);
        total = total.add(product.getPrice());
    }
    public Product getItem(String name){
        for(Product e : products){
            if (e.getName().equals(name)){
                return e;
            }
        }
        return null;
    }
    public boolean removeItem(String name){
        for(Product e: products){
            if (e.getName().equals(name)){
                products.remove(e);// 해당 요소를 삭제
                total = total.subtract(e.getPrice());
                return true;
            }
        }
        return false;
    }
    public ArrayList<Product> getProducts(){
        return products;
    }

    public BigDecimal calculateFinalPrice(BigDecimal taxRate){
        // 주문 금액에 세금을 곱해서 세액을 만들
        BigDecimal tax = total.multiply(taxRate);
        BigDecimal finalPrice = total.add(tax);
        return finalPrice.setScale(3,RoundingMode.HALF_UP); // 스케일은 소수점 자리수
    }


}
