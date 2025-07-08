package day07;// 패키지명

public class 실습8 { // 클래스 시작
    public static void main(String[] args) {// main 시작
        // [문제1]
        Printer p1 = new Printer();
        p1.printMessage();
        // [문제2]
        Greeter g1 = new Greeter();
        g1.greet("민성호");
        // [문제3]
        SimpleCalculator s1 = new SimpleCalculator();
        int result = s1.add(2,4);
        System.out.println(result);
        // [문제4]
        Checker c1 = new Checker();
        boolean check = c1.isEven(4);
        if (check){
            System.out.println("짝수입니다.");
        }else {
            System.out.println("홀수입니다.");
        }// if end
        // [문제5]
        Lamp l1 = new Lamp();
        l1.turnOn();
        l1.turnOff();
        // [문제6]
        Product p2 = new Product();
        p2.stock = 10;
        boolean b3 = p2.sell(3);
        System.out.println(b3);
        System.out.println(p2.stock);
        // [문제7]
        Visualizer v1 = new Visualizer();
        String s2 = v1.getStars(5);
        System.out.println(s2);
        // [문제8]
        ParkingLot p3 = new ParkingLot();
        int money = p3.calculateFee(65);
        System.out.println(money);
        int money1 = p3.calculateFee(140);
        System.out.println(money1);

    }//main 끝
}// 클래스 끝
