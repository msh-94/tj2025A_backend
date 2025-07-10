package day09.package1; // 패키지명

public class A { // 클래스 시작  * 클래스에는 private 키워드 불가능*
    public int 공개변수 = 1;    // public
    private int 비공개변수 = 2; // private
    int 일반변수 = 3;           // (default) 생략
    public void 메소드(){
        System.out.println( this.공개변수 ); // 가능
        System.out.println( 비공개변수 ); // 가능
        System.out.println( 일반변수 ); // 가능
    } // 메소드 끝
}// 클래스 끝
