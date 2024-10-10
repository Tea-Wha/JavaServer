package 반복자와향상된for문;
// 자바의 컬렉션 프레임워크는 컬렉션에 저장된 요소를 읽어오는 방법은 Iterator 인터페이스로 표준화함

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExMain {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);
        // 향상된 for 문 사용하는 방식 (권장되는 방식) -> 요소값 변경 가능
        for(int e : list) System.out.print(e+ " ");
        System.out.println();

        Iterator<Integer> iterator = list.iterator(); // 표준 이터레이터 생성
        while (iterator.hasNext()){
            if(iterator.next() == 4) iterator.remove();; // 요소값을 변경 할 수 있음
        }
        for(int e : list) System.out.print(e+ " ");
    }
    
}
