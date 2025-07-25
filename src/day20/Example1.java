package day20; // 패키지명

class BookDto{

}
class BoardDto{
    @Override
    public String toString() {
        return "BoardDto{}";
    }
}

public class Example1 {// class start
    public static void main(String[] args) { // main start

        /*
        - 리터럴(상수) 값 / 자료 : 3.14 , 10 , 'a'
        - 타입 : 값 분류하는 종류
            1. 기본타입 : 8가지 , 리터럴자료 , 소문자로시작 , int
                    -> 자바회사에서 제공하는 타입
                    int a = 3;      -- 3 자료를 int 로 분류
                    double b = 3;   -- 3 자료를 double 로 분류
                vs
            2. 참조타입 : 배열/클래스/인터페이스 , new(인스턴스)자료 , 대문자로시작 , Integer
                    -> 개발자 만든 타입 또는 라이브러리
                    MemberDto a = new MemberDto() <-- (인스턴스)자료

        [ 클래스 ] : 기본타입에 존재하지 않은 새로운 타입 설계 , 라이브러리(도구) 미리 만들어진 클래스들
            예 ] int는 정수 1개만 저장하는 타입 , int int 정수 2개를 저장하는 타입
            class SuperInt{ int value; int value2; }

        [ 자바의 기본 클래스 ]
            1. Object 클래스 : 모든 객체의 조상(최상위) , 즉] 모든 인스턴스는 Object 으로 상속 받는다.
                특징 : 모든 자료를 저장 할 수 있는 타입
                주요메소드
                    1) .toString()  : 자료(객체)의 주소값 반환 함수
                    2) .equals()    : 자료(객체)의 비교 결과 반환 함수
                    3) .hashCode()  : 자료(객체)를 정수로 반환 함수
        */

        // [1] Object
        // 1) Object 타입은 모든 타입을 상속 하므로 *다형성*으로 타입변환 가능하다.
        Object o1 = 3;                  // 정수를 Object 분류할 수 있다.
        Object o2 = 3.14;               // 실수를 Object 분류할 수 있다.
        Object o3 = true;               // 논리를 Object 분류할 수 있다.
        Object o4 = "유재석";            // 문자열을 Object 분류할 수 있다.
        Object o5 = new Object();       //
        Object o6 = new int[] {1,2,3};  //
        // 2) Object 타입/클래스 의 주요 메소드
        Object o7 = new BookDto();
        Object o8 = new BoardDto();
            // 1. .toString() : 인스턴스/자료 주소(메모리위치) 반환
            // -> 주로 오버라이딩(재정의) 해서 인스턴스의 정보(문자)반환
            // -> 생략가능
        System.out.println( o7.toString() ); // day20.BookDto@378bf509
        System.out.println( o8.toString() ); // BoardDto{}
        System.out.println( o7 );            // day20.BookDto@5fd0d5ae

            // 2. == 변수가 갖는 값/주소(위치) 비교 .equals() : 주소가 갖는 객체 비교
        Object o9 = new BookDto();
        System.out.println(o9);     // day20.BookDto@2d98a335
        Object o10 = new BookDto();
        System.out.println(o10);    // day20.BookDto@16b98e56
        Object o11 = o9; // o9를 o11에 대입한다.
        System.out.println( o9 == o10 ); // == 같다 , false
        System.out.println( o9.equals(o10) ); // , false
        System.out.println( o9 == o11 ); // true;
        System.out.println( o9.equals(o11) ); // true;
        String str1 = new String("유재석");
        String str2 = new String("유재석");
        System.out.println( str1 == str2 ); // false
        System.out.println( str1.equals(str2)); // true

            // 3. .hashCode() : 객체의 주소(객체가 위치한 메모리위치)값을 정수로 반환
        System.out.println( str1.hashCode() );  // 50621969
        System.out.println( str2.hashCode() );  // 50621969
        System.out.println( o9.hashCode() );    // 764977973
        System.out.println( o10.hashCode() );   // 381259350
        System.out.println( o11.hashCode() );   // 764977973


    }// main end
}// class end
