package Comparable인터페이스;
// Comparable 과 Comparator 는 자바에서 객체들을 정렬하는 데 사용하는 인터페이스
// Comparable : 나와 다른 객체를 비교하는 방식
// Comparator : 두개의 다른 객체를 비교해줌



import java.util.TreeSet;

public class ComparableEx {
    public static void main(String[] args) {
        TreeSet<Car> treeSet = new TreeSet<>();
        treeSet.add(new Car("Santafe", 2023, "White"));
        treeSet.add(new Car("Sorento", 2005, "Silver"));
        treeSet.add(new Car("Grandeur", 2018,"Black"));
        treeSet.add(new Car("Morning", 2023, "Red"));
        treeSet.add(new Car("Morning", 2023, "Blue"));

        for (Car e : treeSet){
            System.out.println("이름 : "+e.getName()+ " : "+e.getYear()+ " : " + e.getColor());
        }
    }
}
