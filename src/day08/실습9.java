package day08;// 패키지명

import java.util.Scanner;

public class 실습9 {// 클래스 시작

    public static void main(String[] args) { // main 시작
        // [문제1]
        Book b1 = new Book("이것이 자바다." , "신용권" , 30000);
        Book b2 = new Book("자바의 정석", "남궁성",28000);
        System.out.print(b1.title);
        System.out.print(b1.author);
        System.out.println(b1.price);
        System.out.print(b2.title);
        System.out.print(b2.author);
        System.out.println(b2.price);
        // [문제2]
        Pet p1 = new Pet("초코","푸들",3);
        Pet p2 = new Pet("나비","코리안숏헤어",5);
        System.out.print(p1.name);
        System.out.print(p1.species);
        System.out.println(p1.age);
        System.out.print(p2.name);
        System.out.print(p2.species);
        System.out.println(p2.age);
        // [문제3]
        Rectangle r1 = new Rectangle(10,5);
        int i1 = r1.getArea();
        System.out.println("사각형의 넓이: "+i1);
        // [문제4]
        BankAccount bank1 = new BankAccount("111-222-3333","유재석",10000);
        bank1.deposit(5000);
        bank1.withwraw(3000);
        System.out.println(bank1.balance);
        // [문제5]
        Goods g1 = new Goods();
        Goods g2 = new Goods("콜라",2000);
        System.out.print(g1.name);
        System.out.println(g1.price);
        System.out.print(g2.name);
        System.out.println(g2.price);
        // [문제6]
        Member m1 = new Member();
        System.out.print(m1.id);
        System.out.println(m1.isLogin);
        // [문제7]
        Television t1 = new Television(7 ,20);
        System.out.print(t1.channel);
        System.out.println(t1.volume);
        // [문제8]
        Player play1 = new Player("손흥민",90,95);
        Player play2 = new Player("이강인",85,92);
        System.out.print(play1.name);
        System.out.print(play1.power);
        System.out.println(play1.speed);
        System.out.print(play2.name);
        System.out.print(play2.power);
        System.out.println(play2.speed);
        // [문제9]
        MenuItem m2 = new MenuItem("김치찌개",8000,true);
        if (m2.isSignature){ System.out.printf("[대표메뉴] %s : %d원\n" , m2.name , m2.price); }
        // [문제10]
        Scanner scan = new Scanner(System.in);
        System.out.print("이름 : ");
        String s1 = scan.next();
        System.out.print("나이 : ");
        int i2 = scan.nextInt();
        System.out.print("mbti : ");
        String s2 = scan.next();
        UserProfile u1 = new UserProfile();
        u1.name = s1;
        u1.age = i2;
        u1.mbti = s2;
        System.out.print(u1.name);
        System.out.print(u1.age);
        System.out.println(u1.mbti);
    }// main 끝
}// 클래스 끝
