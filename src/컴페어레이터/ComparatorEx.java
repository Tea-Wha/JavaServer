package 컴페어레이터;
// Comparator : 정렬을 구현하는 인터페이스, 두개의 객체를 비교할 때 사용

import java.util.TreeSet;

public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<Fruit> treeSet = new TreeSet<>(new FruitCompare().reversed()); // Fruit 클래스에 정렬 조건 없어서
        // new 로 정렬 조건 추가해야 한다. 기본은 compare로 바로 넘어감
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 12000));

        for (Fruit e : treeSet){
            System.out.println(e);
        }
    }
}

