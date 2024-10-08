package HashMap인터페이스;
// Map 인터페이스 -> 하나가 아닌 쌍으로 되어 있는 자료를 관리하는 메소드로 선언
// 하나의 쌍은 키(Key)와 값(Value)으로 이루어져 있다.
// 파이썬 dictionary / 자바 Map /
// 키 값 -> Hash function -> 주소 -> 2500 (값 저장)
// 겹치면 -> Hash Collision -> 충돌된 값에서 LinkedList 로 만들어지고 구분됨
// Map 인터페이스 : 키(key) 와 값(value)의 쌍(pair) 으로 자료 관리하는 인터페이스
// 구현체 HashMap, TreeMap, HashTable, Properties

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapInterface {
    public static void main(String[] args) {
        // Map 생성
        Map<String,Integer> map = new HashMap<>();
        // 객체 추가 : Entry(키, 값)
        map.put("우영우",99);
        map.put("동그라미",55);
        map.put("최수연",95);
        map.put("이준호",80);
        map.put("동그라미",96); // 키가 같기 때문에 저장된 값이 대체됨 (나중에 들어간 값으로 대체됨)
        System.out.println("총 Entity 수 : "+map.size());
        System.out.println("키로 값 찾기 : "+map.get("동그라미"));

        // 반복 순회 방법 (향상된 for 문 이용하는 방법)
        for (String key : map.keySet()){ // keySet -> 키값 나열
            System.out.print(key+" : "+map.get(key)+" ");
        }
        System.out.println();
        // 이전 방식 순회 : 반복자(iterator)를 이용하는 방식
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.print(key + " : " + map.get(key) + " ");
        }
    }
}
