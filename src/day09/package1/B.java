package day09.package1; // 패키지명

public class B { // 클래스 시작
    public void 메소드(){
        A a = new A();
        System.out.println(a.공개변수); // 가능
        // System.out.println(a.비공개변수); // 불가능
        System.out.println(a.일반변수); // 가능 : A 와 B는 같은 패키지
    }// 메소드 끝
} // 클래스 끝
