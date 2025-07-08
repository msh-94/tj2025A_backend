package day07; // 패키지명

public class Product { // 클래스 시작
    // 매개변수
    String name;
    int stock;
    // 메소드
    boolean sell(int x){
        if (x <= stock){
            stock = stock - x;
            return true;
        }else {
            System.out.println("재고 부족");
            return false;
        }
    }


}// 클래스 끝
