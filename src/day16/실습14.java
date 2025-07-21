package day16; // 패키지명

public class 실습14 {// class start


    public static void main(String[] args) { // main start
        // [문제1]
        try{  int result = 10 / 0; }
        catch (ArithmeticException e){ System.out.println("0으로 나눌 수 없습니다."+e); } // try end

        // [문제2]
        try{  String notANumber = "오류";  int value = Integer.parseInt(notANumber); }
        catch (NumberFormatException e){ System.out.println("잘못된 숫자 형식입니다."+e); } // try end

        // [문제3]
        try {
            String[] fruits = {"사과", "바나나"};
            System.out.println(fruits[2]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("잘못된 인덱스에 접근했습니다."+e);
        } // try end

        // [문제4]
        try {
            String text = null;
            System.out.println("글자 수 : " + text.toUpperCase());
        }catch (NullPointerException e){
            System.out.println("객체가 초기화되지 않았습니다.");
        } // try end

        // [문제5]
        try { System.out.println("데이터베이스 연결을 시작합니다"); }
        finally { System.out.println("데이터베이스 연결을 종료합니다."); } // try end

        // [문제6]
        try{
            String text = null;
            text.length();
            int result = 5/0;
        }
        catch (NullPointerException e){ System.out.println(e); }
        catch (ArithmeticException e1){ System.out.println(e1); } // try end

        // [문제7]
        try {
            new 실습14().pauseOneSecond();
        } catch (InterruptedException e) {
            System.out.println(e);
        }// try end

        // [문제8]
        try{
            int[] arr = new int[2];
            System.out.println(arr[5]);
        }catch (Exception e){
            System.out.println("알 수 없는 오류가 발생했습니다.");
        }// try end

    } // main end
    // [문제7]
    public void pauseOneSecond() throws InterruptedException{
        Thread.sleep(1000);
    } // func end
}// class end

