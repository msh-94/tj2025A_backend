package day23;// 패키지명

import java.util.*;

public class Example3 {// class start
    public static void main(String[] args) {// main start
        /*
        [ 컬렉션 프레임워크3 ]
        List 인터페이스 : 순서(인덱스) 대로 저장하는 구조
        Set 인터페이스 : 순서(인덱스) 없이 저장하는 구조
        Map 인터페이스 : key와value를 한쌍(entry) 으로 여러 쌍 저장하는 구조
            -> JSON이란 : 자바스크립트에서 사용하는 객체 형식
            -> 자바에는 json 없어서 json 비슷한 형식은 map
        */
        // [1] HashMap 객체 생성 , < key타입 , value타입 >
        Map<String , Integer> map = new HashMap<>();

        // [2] 주요 메소드
            // 1) .put(key자료1 , value자료2) :
            // MAP 객체내 KEY 와 VALUE 자료를 한쌍(ENTRY)을 저장한다
            // 단] key는 중복 불가능 , value 중복 가능
        map.put("유재석",95); // "유재석" 자료는 key(속성) , 95 자료는 value(속성값)
        map.put("강호동",100); // "강호동"속성(key)명에 100 대입/저장 한다.
        map.put("신동엽",78);
        map.put("유재석",67); // key(속성명) 중복이 불가능하다 ( *식별자* )
        map.put("서장훈",100); // value(속성값) 중복이 가능하다
        System.out.println(map); // {서장훈=100, 유재석=67, 강호동=100, 신동엽=78}
            // 2) .get( key ) : MAP 객체내 지정한 KEY의 VALUE 반환
        System.out.println( map.get("유재석") ); // 67
            // 3) .size() : MAP 객체내 entry(쌍) 개수 반환
        System.out.println( map.size() ); // 엔트리 : 4 , key : 4  value : 4
            // 4) .remove(key) : MAP 객체내 지정한 KEY의 entry(쌍) 삭제 한다.
        map.remove("유재석");
        System.out.println(map); // {서장훈=100, 강호동=100, 신동엽=78}
            // 5) .containsKey( key ) , containsValue( value )
        System.out.println(map.containsKey("강호동")); // true
        System.out.println(map.containsValue( 65 )); // false
            // 6) .clear() : MAP 객체내 모든 entry 삭제한다
        // map.clear();
            // 7) .isEmpty() : MAP 객체내 entry 하나도 없으면 true , 1개이상이면 false 반환
        System.out.println( map.isEmpty() ); // false
            // + .entrySet() : MAP 객체내 모든 entry 를 set 인터페이스 반환
        System.out.println( map.entrySet() ); // [서장훈=100, 강호동=100, 신동엽=78]
            // + .keySet() : MAP 객체내 모든 KEY 를 set 인터페이스 반환
        System.out.println(map.keySet()); // [서장훈, 강호동, 신동엽]
            // + .values() : MAP 객체내 모든 VALUE를 List 인터페이스 반환
        System.out.println( map.values() ); // [100, 100, 78]

        // [3] MAP 과 반복문 관계
        // 1) 일반 FOR문 표현 못함 , 인덱스가 없어서
        // 2) 향상된 FOR문
        for (String key : map.keySet()){ // map 객체내 모든 키를 반복한다
            System.out.println(key);            // key   * value 활용하여 key 호출 한다 [x]
            System.out.println(map.get(key));   // value ** key 활용하여 value 호출 한다 [o]
        }// for end
        // 3) forEach 문
        map.keySet().forEach( (key) -> {
            System.out.println(key);
            System.out.println(map.get(key));
        }); // forEach end
        // 활용] JSON( javascript 객체 ) <----> MAP/DTO ( 자바객체 )
        // DTO는 N회성 객체 , MAP은 1회성 객체

        // [4] 구현체
        // MAP 인터페이스 : key 와 value 를 (자료2개)를 한쌍(entry자료1개) 으로 여러개 쌍을 저장
        // 1) HashMap       : key와value으로 구성된 entry객체를 저장하는 구조
        HashMap<Integer,Object> hashMap = new HashMap<>();
        // 2) HashTable     : + 동기화 메소드 제공 ( 멀티 스레드 플랫폼 )
        Hashtable<Integer,Object> hashtable = new Hashtable<>();
        // 3) TreeMap       : + key값 기준으로 자동 정렬(오름차순)
        TreeMap<Integer,Object> treeMap = new TreeMap<>();
        // 4) Properties    : + 제네릭이 없다 , + 주로 세팅/설정 파일 사용된다. Spring 환경
        Properties properties = new Properties();

        Map<Integer,Object> map2;
        map2 = hashMap;
        map2 = hashtable;
        map2 = treeMap;


    }// main end
}// class end
