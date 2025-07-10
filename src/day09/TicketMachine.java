package day09; // 패키지명

public class TicketMachine { // 클래스 시작
    static int totalTickets = 0; // 정적변수
    static void issueTicket(){
        totalTickets += 1;
        System.out.println("티켓 1장을 발권했습니다.");
    }// 메소드끝
    static void printTotalTickets(){
        System.out.println(totalTickets);
    }// 메소드 끝
} // 클래스 끝
