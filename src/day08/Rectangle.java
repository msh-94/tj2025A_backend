package day08; // 패키지명

public class Rectangle { // 클래스시작
    int width;
    int height;
    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }// 생성자 끝

    int getArea(){

        return this.width*this.height;
    }// 메소드 끝

}// 클래스 끝
