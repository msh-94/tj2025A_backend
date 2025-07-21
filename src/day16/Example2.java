package day16; // 패키지명

public class Example2 { // class start

    // (1) 예외가 발생하는 메소드 , 반환타입 메소드명() throws 예외클래스명 {}
    public static void method1() throws NullPointerException{
        String str = null;
        System.out.println( str.length() ); // 100% 예외 발생 예측된다.
        // * 예외 발생시 예외 던지기(throws)
    }
    // (2) 예외가 발생하는 메소드 ,
    // 일반예외 클래스들은 주로 throws 예외 코드 존재한다
    // 실행예외 클래스들은 주로 throws 예외 코드 없다.
    public static void method2() throws ClassNotFoundException {
        Class.forName("com.sql.jdbc"); // 일반예외란? 무조건 예외처리
    }
    public static void main(String[] args) { // main start
        // [9] 예외던지기 : 예외 발생시 메소드를 호출한 곳으로 예외 전달/리턴
        // --> 한곳에서 예외처리 하기위해 메소드 내부에서 발생한 예외를 이동/전달/리턴 할 수 있다.
        try { method1(); } // <---- 예외가 발생하는 메소드 호출
        catch ( NullPointerException e){ System.out.println("method1의 예외 발생"+e); }

        try { method2(); }// <---- 예외가 발생하는 메소드 호출
        catch (ClassNotFoundException e){ System.out.println("method2의 예외 발생"+e); }
    }// main end
}// class end
