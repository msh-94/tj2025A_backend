package day09; // 패키지명

public class 실습10 { // 클래스 시작
    public static void main(String[] args) { // main 시작
        // [문제1]
        Member m1 = new Member();
        m1.setId("admin");
        System.out.println(m1.getId());
        // [문제2]
        Score s1 = new Score();
        s1.setScore(85);
        s1.setScore(120);
        // [문제3]
        BankAccount b1 = new BankAccount("123-456");
        System.out.println(b1.getAccountNumber());
        // [문제4]
        CircleCalculator c1 = new CircleCalculator();
        System.out.println(c1.printCircleArea(5));
        // [문제5]
        TicketMachine machine1 = new TicketMachine();
        TicketMachine machine2 = new TicketMachine();
        TicketMachine machine3 = new TicketMachine();
        machine1.issueTicket();
        machine1.issueTicket();
        machine2.issueTicket();
        TicketMachine.printTotalTickets();
        // [문제6]
        System.out.println(GameConfig.GAME_TITLE);
        System.out.println(GameConfig.MAX_LEVEL);
        System.out.println(GameConfig.MAX_HP);

    } // main 끝
} // 클래스 끝
