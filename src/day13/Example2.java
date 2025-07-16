package day13; // 패키지명
// Object class : 최상위 클래스 / 슈퍼 클래스
// * 자바의 모든 클래스는 자동으로 extends Object 이므로 자바는 100% 객체지향 이다.
class A{                                                                  // 부모 : Object , 자식 : B/C , 자손 : D/E
    A(){ System.out.println("A 객체 탄생"); } // A클래스 생성자
}// class end

class B extends A{ // B는 A로부터 상속받는다                                 // 부모 : A , 자식 : D
    B(){ System.out.println("B 객체 탄생"); } // B클래스 생성자
} // class end

class C extends A{ // C는 A로부터 상속받는다                                 // 부모 : A , 자식 : E
    C(){ System.out.println("C 객체 탄생"); }// C클래스 생성자
}// class end

class D extends B{ // D는 B로부터 상속받는다                                 // 부모 : B
    D(){ System.out.println("D 객체 탄생"); } // D클래스 생성자
}// class end

class E extends C{ // E는 C로부터 상속받는다                                 // 부모 : C
    E(){ System.out.println("E 객체 탄생"); } // E클래스 생성자
}// class end

public class Example2 {// class start
    public static void main(String[] args) { // main start
        // (1) A클래스로 객체 생성시 총 객채수 : 2개 (A/Object)
        System.out.println("[1] =============");
        A a = new A(); // Object -> A

        // (2) B클래스로 객체 생성시 총 객채수 : 3개 (B/A/Object)
        System.out.println("[2] =============");
        B b = new B(); // Object -> A -> B
        System.out.println(b);

        System.out.println("[3] =============");
        // (3) C클래스로 객체 생성시 총 객체수 : 3개 (C/A/Object)
        C c = new C(); // Object -> A -> C

        System.out.println("[4] =============");
        // (4) D클래스로 객체 생성시 총 객체수 : 4개 (D/B/A/Object)
        D d = new D();  // object -> A -> B -> D

        System.out.println("[5] =============");
        // (5) E클래스로 객체 생성시 총 객체수 : 4개 (E/C/A/Object)
        E e = new E(); // object -> A -> C -> E

        // (6) 자동타입변환
        A a1 = b;           // b객체(값)는 B타입
        Object o1 = b;      // b객체(값)는 Object타입 변환 가능
        // B b2 = c;        // 불가능

        // (7) 강제타입변환
        B b2 = (B)a1;       // 가능! a1태생확인

        A a2 = e;           // 자동
        C c1 = (C)a2;       // 강제

        // B b3 = (B)a2;    // 강제
        // 문법오류 가 아닌 실행오류 발생

        // (8) 인스턴스(객체/값) 타입 확인 방법
        // 객체 instance of 타입/클래스명 : 객체가 지정한 클래스 타입 확인
        // 강제타입 변환 전에 확인 목적
        System.out.println( a instanceof Object ); // true
        System.out.println( b instanceof A ); // true
        // System.out.println( e instanceof B ); false
        System.out.println(a2 instanceof C); // true
        System.out.println( a2 instanceof B ); // false

        // (9) 상속 활용처
        // 1. 웹/앱 라이브러리
        // 2.
        //      코드치다가 명령어(코드)가 중복되면 메소드화
        //      클래스정의하다가 다른클래스와 멤버변수 중복되면 상속






    }// main end
} // class end
