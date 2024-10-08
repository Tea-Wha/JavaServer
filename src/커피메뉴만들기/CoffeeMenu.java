package 커피메뉴만들기;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeMenu {
    static Map<String, MenuInfo> map = new HashMap<>(); // 키 안에 객체 생성 가능
    public static void main(String[] args) {
    makeMenu();
    selectMenu();
    }
    static void makeMenu(){
        map.put("Americano", new MenuInfo("Americano",2000, "Coffee", "기본커피")); // new MenuInfo -> 객체
        map.put("Espresso", new MenuInfo("Espresso",2000, "Coffee", "진한커피"));
        map.put("Latte", new MenuInfo("Latte",4000, "Coffee", "우유포함"));
    }
    static void selectMenu(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("메뉴 선택 : ");
            System.out.print("[1]메뉴보기 [2]메뉴조회 [3]메뉴추가 [4]메뉴삭제 [5]메뉴수정 [6] 종료 ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("====== 메뉴 리스트 보기 ======");
                    // keySet() 반복순회
                    for (String k : map.keySet()){
                        System.out.print("메뉴 : "+(map.get(k)).getName()+" ");
                        System.out.print("가격 : "+(map.get(k)).getPrice()+" ");
                        System.out.print("카테고리 : "+(map.get(k)).getCategory()+" ");
                        System.out.print("설명 : "+(map.get(k)).getDesc()+" ");
                        System.out.println();
                        System.out.println("---------------------------------------------------------");
                    }
                    break;
                case 2:
                    System.out.print("조회할 메뉴 이름 입력 : ");
                    // containsKey(키) 해당 키가 map 내에 존재 하는지 확인
                    String chk = scanner.next();
                    if (map.containsKey(chk)) {System.out.println(chk+" 메뉴가 존재합니다."); break;}
                    else System.out.println("해당 메뉴가 존재하지 않습니다.");
                    break;
                case 3:
                    System.out.print("추가할 메뉴 입력 : ");
                    // containsKey(키) 확인 후 해당 메뉴가 없으면, 키와 값을 입력 받아서 put()
                    String adk = scanner.next();
                    if (map.containsKey(adk)) {System.out.println("해당 메뉴가 이미 존재합니다."); break;}
                    else System.out.print("가격 입력 : "); int nprice = scanner.nextInt();
                    System.out.print("카테고리 입력 : "); String ncat = scanner.next();
                    System.out.print("설명 입력 : "); String ndec = scanner.next();
                    map.put(adk, new MenuInfo(adk, nprice, ncat, ndec));
                    break;
                case 4:
                    System.out.print("삭제할 메뉴 입력 : ");
                    // containsKey(키) 해당 키 존재 여부 확인 후 -> remove(key) 삭제
                    String delk = scanner.next();
                    if (map.containsKey(delk)) {map.remove(delk); System.out.println("메뉴를 삭제했습니다."); break;}
                    else System.out.println("해당 메뉴가 없습니다.");
                    break;
                case 5:
                    System.out.print("수정할 메뉴 입력 : ");
                    // containsKey(키)로 키를 찾아서 값 변경 후 put
                    String rek = scanner.next();
                    if (map.containsKey(rek)){
                        System.out.print("수정할 가격 입력 : "); int reprice = scanner.nextInt();
                        System.out.print("수정할 카테고리 입력 : "); String recat = scanner.next();
                        System.out.print("수정할 설명 입력 : "); String redec = scanner.next();
                        map.put(rek, new MenuInfo(rek, reprice, recat, redec)); break;
                    }
                    else System.out.println("수정할 메뉴가 존재하지 않습니다.");
                    break;
                case 6:
                    System.out.println("메뉴 선택을 종료 합니다.");
                    return;
                default:
                    System.out.println("선택된 메뉴가 없습니다.");
                    break;
            }
        }
    }
}
