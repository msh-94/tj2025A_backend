package day08; // 패키지명

public class Goods { // 클래스 시작
    String name;
    int price;
    Goods(){
        name ="미정";
        price = 0;
    }// 생성자1 끝

    Goods(String name , int price){
        this.name = name;
        this.price =price;
    }// 생성자2 끝
}// 클래스 끝
