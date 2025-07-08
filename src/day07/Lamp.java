package day07;// 패키지명

public class Lamp {// 클래스 시작
    boolean isOn = false; // 멤버변수
    void turnOn(){
        isOn = true;
        System.out.println(isOn);
    }// 메소드 끝
    void turnOff(){
        isOn = false;
        System.out.println(isOn);
    }// 메소드 끝
}// 클래스 끝
