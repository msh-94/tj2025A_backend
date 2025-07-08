package day07;// 패키지명

public class Lamp {// 클래스 시작
    boolean isOn = false;
    boolean turnOn(){
        isOn = true;
        return isOn;
    }// 메소드 끝
    boolean turnOff(){
        isOn = false;
        return isOn;
    }
}// 클래스 끝
