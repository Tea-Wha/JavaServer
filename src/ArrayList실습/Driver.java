package ArrayList실습;

import java.math.BigDecimal;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        order.initSet();

        while (true) {
            System.out.println("\n==== 주문 관리 시스템 ====");
            System.out.println("1. 제품 추가");
            System.out.println("2. 제품 제거");
            System.out.println("3. 제품 목록 보기");
            System.out.println("4. 제품 보기");
            System.out.println("5. 최종 가격 계산 (세금 포함)");
            System.out.println("6. 종료");
            System.out.print("원하는 작업을 선택 : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("제품 이름 입력 : ");
                    String name = scanner.next();
                    System.out.print("제품 가격 입력 : ");
                    BigDecimal price = new BigDecimal(scanner.next());
                    order.addItem(new Product(name, price)); // 이 부분 체크 -> 생각 못한 이유?
                    System.out.println(name+" 제품이 추가되었습니다.");
                    break;
                case 2:
                    System.out.print("제거 제품 이름 입력 : ");
                    String delName = scanner.next();
                    if (order.removeItem(delName)) System.out.println(delName+" 제품이 제거되었습니다.");
                    else System.out.println("해당 제품을 제거할 수 없습니다.");
                    break;
                case 3:
                    System.out.println("===== 현재 제품 목록 =====");
                    for (Product e: order.getProducts()){
                        System.out.println(e.getName()+" : "+e.getPrice());
                    }
                    break;
                case 4:
                    System.out.println("===== 제품 검색 =====");
                    System.out.print("검색 제품 입력 : ");
                    String chName = scanner.next();
                    Product product = order.getItem(chName);
                    System.out.println(product.getName()+ " : "+product.getPrice());
                    break;
                case 5:
                    System.out.print("세금 비율 입력 : ");
                    BigDecimal taxRate = new BigDecimal(scanner.next()); // BigDecimal은 다음과 같이 입력
                    BigDecimal finalPrice = order.calculateFinalPrice(taxRate);
                    System.out.println("세금 포함된 최종 가격 : "+finalPrice);
                    break;
                case 6:
                    System.out.println("작업을 종료합니다.");
                    return;
                default:
                    System.out.println("입력이 잘못 되었습니다.");
                    break;
            }
        }
    }
}
