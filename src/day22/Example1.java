package day22;// 패키지명

import java.util.Arrays;

public class Example1 {// class start
    public static void main(String[] args) { // main start
        /*
        [ String 클래스 ] : 자바에서 문자열 표현하는 방법
            - 컴퓨터는 문자 는 알고 문자열은 모른다.
            - 문자 번역 : 바이트 <--번역방법--> 문자
                1. 아스키코드    : (영문/숫자/특수문자) 128문자 표현하는 규칙 , 7비트
                2. 유니코드     : 전세계 공용어(한글포함) , 자바가 사용하는 코드
            - 65 <--> 'A' , { 74 , 65 , 86 , 65 } <---> 'JAVA' , 44608 <--> '김'

            1. 문자열 사용하는방법
                1) "문자열"                  : ""큰따옴표 안에 문자열 표현
                2) new String               : new String()생성자 이용한 문자열 표현
            2. 문자열 비교하는 방법
                1) 문자열A == 문자열B         : "리터럴" 문자만 비교 가능하다.
                2) 문자열A.equals(문자열B)    : "리터럴" 과 객체문자열을 비교 가능하다
            3. 주요메소드
                1) 문자열A.concat(문자열B)                        : 연결 메소드
                2) String.format("형식문자" , 문자열A )            : 지정한 혈식으로 문자열 반환 메소드
                3) StringBuilder builder = new StringBuilder()  : 문자열 연결 클래스
                    builder.append( 문자열A );
                    builder.append( 문자열B );

        */
        // 1. 배열을 이용한 문자열 표현
        char str1 = '유';    // ' ' 작은 따옴표로 감싼 문자1개는 char타입
        char[] str2 = { '유' , '재' , '석'}; // ' ' 작은따옴표 3개를 char배열 타입

        // 2. char타입의 아스키코드 10진수
        char str3 = 65;                           System.out.println(str3); // A
        char[] str4 = { 74 , 65 ,86 , 65};        System.out.println(Arrays.toString(str4)); // [J, A, V, A]
        char str5 = '김';                         System.out.println( (int) str5 ); // 44608

        // 3. 문자열 리터럴 : " " 큰따옴표 , String 클래스
        String str6 = "유재석"; // 101호    // - new String 사용하지 않고 문자열 생성할경우
        String str7 = "유재석"; // 101호    // 문자열이 동일경우 동일한 객체 취굽
        String str8 = new String("유재석"); // 102호  // - new String 사용시 동일한 문자열 이라도 다른객체 취급

        // 4. ==  vs  .equals()
        // 1) == 주소값(객체가저장된위치)비교
        // 2) .equals() : 객체내 값 비교
        System.out.println(str6 == str7); // true
        System.out.println(str6 == str8); // false
        System.out.println(str6.equals(str7)); // true
        System.out.println(str6.equals(str8)); // true
        // * 문자는 불변( 변하지않는다/수정이없다 )

        // 5. 주요 메소드
        // 1) 문자열A.concat( 문자열B ) : 문자열 연결 메소드 vs 문자열A+문자열B
        String str9 = "자바".concat("프로그래밍");  // 자바프로그래밍
        System.out.println(str9);
        System.out.println("자바"+"프로그래밍");        // 자바프로그래밍
        // 2) StringBuilder 클래스 : 문자열을 단계적으로 연결 하는 메소드 제공하는 클래스
        StringBuilder builder = new StringBuilder();
        builder.append("자바");
        builder.append("프로그래밍");
        System.out.println(builder);                            // 자바프로그래밍 // 메모리 효율 좋다.
        // 3) String.format( "형식문자" , "문자열A" );
        String str10 = String.format("%s%s","자바","프로그래밍");
        System.out.println(str10);                  // 자바프로그래밍
        // 4) +연결연산자
        String str11 = "";
        str11 += "자바";
        str11 += "프로그래밍";
        System.out.println(str11);                 // 자바프로그래밍
        // 활용] JDBC SQL의 매개변수 연결
        String name = "유재석";
        String sql1 = "insert into table(name) values("+name+")"; // 비권장
        String sql2 = String.format("insert into table(name)values(%s);",name);
        String sql3 = "";
        sql3 += "insert";
        sql3 += "table(name)";
        sql3 += "values("+name+")"; // 비권장 : 띄어쓰기 주의
        StringBuilder sql4 = new StringBuilder();
        sql4.append("insert into table(name) ");
        sql4.append("values("+name+")");



    }// main end
}// class end
