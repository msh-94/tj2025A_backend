package day08;// 패키지명

public class Phone {// 클래스 시작
    // 클래스내 멤버
    // 1. 멤버변수 ( 객체내 포함되는 변수 )
    String model; // 핸드폰 모델명
    String color; // 핸드폰 색상
    int price;    // 핸드폰 가격
    // 2. 생성자
    // 1) 기본생성자 :
        // -> 클래스내 하나도 생성자가 없으면 자동으로 (컴파일될때) 생성된다.
        // -> 클래스내 하나 이상의 생성자가 있을때는 직접 기본생성자 정의
    Phone(){
        System.out.println("--->Phone 기본생성자 실행");
    }
    // 2) 매개변수( 해당 메소드/생성자를 호출시 외부로부터 들어오는 값 )가 있는 생성자
        // -> 생성자는 매개변수는 있지만 반환값이 없다
    Phone( String pModel , String pColor ){
        // --> 외부로부터 전달받은 인자값이 저장된 매개변수 값을 멤버변수에 저장
        model = pModel; // 내부변수 = 외부변수;
        color = pColor;
        price = 1200000; // 초기값을 임의로 고정한다. 120만원
    }
    // 3) 생성자의 오버로드
        // -> 기존 생성자와 매개변수의 타입/순서/개수 다르면 오버로드
    Phone( String model , String color , int price){
        // ---> 멤버변수 : 객체내 변수
        // ---> 매개변수 : 메소드/생성자가 사용하는 인자값 저장변수
        // 문제점 : 이름이 같다
        // --> model = model; // ?? 누가 멤버 고 누가 매개 인지 모른다
        // 해결책 : this키워드 : 현재 메소드/생성자를 호출한 객체 가리킨다.
        this.model = model;
        this.color = color;
        this.price = price;
        // this 안쓰고 이름 다르게 할게요;
        // [관례적] 초기화 값은 멤버변수와 매개변수명을 동일하게 한다
    }
    // 3. 메소드

}// 클래스 끝
