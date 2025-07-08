package day07;// 패키지명

public class ParkingLot { // 클래스 시작
    int calculateFee(int x){
        int result = 0;
        if (x < 30){
            result = 1000;
        } else{
            result = ((x - 30) / 10)*500 + 1000;
        } // if end
        result = result >= 20000 ? 20000 : result;
        return result;
    }// 메소드 끝
}// 클래스 끝
