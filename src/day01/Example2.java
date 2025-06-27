package day01;  // guswo .java 파일 위치한 폴더명

public class Example2 { // class start : 모든 자바코드는 클래스안에 존재한다.

    // (1) main함수 선언 : main + 엔터( 자동완성 )
    public static void main(String[] args) { // main start
        // (2) 리터럴 : (JAVA)언어 들이 미리 정의한 데이터
            // 3 , '김' , "김현수" , 3.14 , true    * JS에서는 '작은따옴표와 "큰따옴표 구분이 없다.
            // 리터럴의 모든 정수는 int , 리터럴의 모든 실수는 double

        // (3) 출력함수 : System.out.print( 리터럴/변수/연산/함수 등 );
            // JS : console.log( ) * JS에서는 ;(세미콜론) 선택 이지만 , 자바는 무조건 명령어 끝에 ; 넣는다.
        // (4) main함수 실행 : ctrl+shfit+f10 또는 실행버튼
        System.out.println( 3 );         // 리터럴 3 출력    , 명령어 끝에 ;(세미콜론) 필수!!!!!!!!!!
        System.out.println( 3.14 );      // 리터럴 3.14 출력
        System.out.println( '김' );       // 리터럴 '김' 출력
        System.out.println( "김현수" );   // 리터럴 "김현수" 출력
        System.out.println( true );     // 리터럴 true 출력
        // (5) 자료형/타입 , 8가지             * 기본자료형
            // 정수 : byte , short , int(*) , long
            // 실수 : float , double(*)
            // 문자 : char        String : 문자열(문자로 만든배열) *참조자료형
            // 논리 : boolean
        // (6) 리터럴값을 변수(* 한개만 자료를 저장 *)에 대입하기
        // =========== 자료형 변수명 = 리터럴; ===============
            // 1. boolean 타입 : true 와 false 만 저장
        boolean bool1 = true;           // 리터럴 true를 저장 가능한 타입
        boolean bool2 = false;
        // boolean bool3 = 3;           // 3 라는 리터럴은 boolean에 저장 불가능.
        System.out.println( bool1 );    // 변수명을 호출하여 변수값 출력
        System.out.println( bool2 );

            // 2. char 타입 : '작은따옴표 으로 감싼 문자1개 저장
        char ch1 = 'A';
//        char ch2 = 'ABC';             // 불가능 , 문자열(문자여러개)
//        char ch3 = "ABC";             // "" 감싼 자료 는 불가능
        System.out.println( ch1 );

            // 3. String 클래스타입 : "큰따옴표 으로 감싼 문자 여러개 저장;
        String str1 = "ABC";
        //String str2 = 'ABC';            // ' ' 감싼 자료 는 불가능
        System.out.println(str1);

            // 4. byte 타입 : 정수 -128 ~ +127            1 바이트
        byte b1 = 100 ;
        //byte b2 = 300 ; // 불가능 : 저장 허용 범위 벗어남
        System.out.println(b1);
            // 5. short 타입 : 정수 +-3만 정도             2 바이트
        short s1 = 32000;
        //short s2 = 50000; // 불가능 : 저장 허용 범위 벗어남
        System.out.println(s1);
            // 6. int 타입 : 정수 +-21억 정도              4바이트 , 리터럴*
        int i1 = 2100000000;
//        int i2 = 3000000000; // 불가능 : 저장 허용 범위 벗어남
        System.out.println(i1);
            // 7. long 타입 : 정수 +-21억 정도 이상         8바이트 , 리터럴 뒤에 L/l
        //long l1 = 3000000000; // 불가능 : 키보드로 입력한 모든값은(리터럴) 정수가 INT 라서
        long l2 = 3000000000L;
        System.out.println(l2);
            // 8. double 타입 : 실수 소수점 17자리 까지 표현 , 실수 리터럴*
        double d1 = 0.123456789123456789;
        System.out.println(d1); // 0.12345678912345678 나머지는 짤림
            // 9. float 타입 : 실수 소수점 8자리까지 표현  , 리터럴 뒤에 F/f
        float f1 = 0.123456789123456789F; // 리터럴 뒤에 F 붙인다
        System.out.println(f1); // 0.12345679 나머지는 짤림

        // ************* 주의할점 : double(기본타입) vs Double(참조타입) ******************


    }// main end

}// class end
