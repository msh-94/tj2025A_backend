package day23; // 패키지명

import java.util.ArrayList;
import java.util.List;

public class Example1 { // class start
    public static void main(String[] args) { // main start
        /*
        인터페이스 : 추상메소드를 가진 타입
        추상메소드 : 메소드를 선언만 하고 구현부{}를 정의하지 않은 메소드
        구현체 : 추상메소드를 가진 인터페이스 implements 해서 추상메소드를 구현한 클래스의 객체
        ** 다형성 ** : 다양한 타입을 가지는 성질 , extends / implements 키워드 구조관계
        [ 컬렉션 프레임워크 ]
            - 컬렉션(수집) 프레임(틀) 워크(작업) : 미리 만들어진 자료수집(=자료구조) 방법
            - 종류 : List , Set , Map 인터페이스
            - 구현체 :
                1) List : ArrayList , Vector , LinkedList 등
                    .add( [인덱스] , 자료 )  [인덱스] 생략가능
                    .set( 인덱스 , 자료 )
                    .get(인덱스)
                    .size()
                    .contains(자료)
                    .indexOf(자료)
                    .remove(인덱스)
                    .isEmpty()
                    .clear
                2) Set : HashSet , TreeSet 등
                3) Map : HashMap , TableMap 등
        */
        // [1] 인터페이스타입 변수명 = new 클래스명();
        ArrayList<String> list1 = new ArrayList<>(); // (1)
        List<String> list2 = new ArrayList<>(); // (2)

        // [2] List 인터페이스 주요 메소드
            // 1) .add(자료) : 리스트내 지정한 자료를 마지막 요소 추가
        list2.add("유재석");
        list2.add("강호동");
        list2.add("신동엽");
        list2.add("유재석"); // 중복 허용
        list2.add( 2, "서장훈"); // 리스트내 지정한 인덱스의 자료를 추가 *추가*
        System.out.println(list2);
            // 2) .set(자료) : 리스트내 지정한 인덱스의 자료를 * 수정/변경 *
        list2.set(0 , "유재석2");
            // 3) .get(인덱스) : 리스트내 지정한 인덱스의 자료 호출/반환
        String result = list2.get(2); // '서장훈' 반환
        System.out.println(result);
            // 4) .size() : 리스트내 전체 요소/자료 개수 반환
        int count = list2.size();
        System.out.println(count); // 5
            // 5) .contains(자료) : 리스트내 지정한 자료 존재하면 true , 없으면 false
        boolean bool = list2.contains("서장훈"); // true
        System.out.println(bool);
            // 6) .indexOf(자료) : 리스트내 지정한 자료의 인덱스 반환 , 없으면 -1
        int index = list2.indexOf("서장훈"); // 2
        System.out.println(index);
            // 7) .remove(인덱스) : 리스트내 지정한 인덱스의 요소/항목/자료 삭제
        list2.remove(2); // 2번(서장훈) 인덱스 삭제
        System.out.println(list2);
            // 8) .isEmpty() : 리스트내 요소가 비어 있으면 true , 1개이상 존재하면 false
        System.out.println(list2.isEmpty()); // false
            // 9) .clear() : 리스트내 모든 요소 삭제
        // list2.clear();
        // System.out.println(list2); // []

            // 10) 리스트/배열 와 반복문 활용
                // 리스트( 여러가지 자료(객체) 들을 갖는 자료(객체) )
                // 여러가지 자료들을 순서대로 호출/순회/확인 == 반복문 통해 작업
            // (1) 일반 for 문
        for ( int i = 0; i < list2.size(); i++){
            System.out.println(list2.get(i));
        }// for end
            // (2) 향상된 for 문
        for (String str : list2){
            System.out.println(str);
        }// for end
            // (3) forEach 문 :
            // 리스트/배열명.forEach()
            // list2.forEach( (반복변수) -> { 실행문 } );
            // 리스트내 첫번째 요소부터 마지막 요소까지 순서대로 반복변수에 대입하여 실행처리 한다
            // 람다식/화살표 함수 : 복잡한 함수 선언 방식을 간소화 , ( 매개변수 ) -> { 실행문 };
        list2.forEach((str)-> { System.out.println(str); });


    }// main end
}// class end
