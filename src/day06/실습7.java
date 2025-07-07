package day06;// 패키지명

import java.awt.*;
import java.util.Scanner;

public class 실습7 { // class start
    public static void main(String[] args) { // main start
//        JAVA] 실습7 : 클래스와 객체의멤버변수
//[ 문제 ] 아래 클래스와 멤버변수 관련 문제
//       [ 제출방법 ] 코드가 작성된 파일이 위치한 깃허브 상세 주소를 제출하시오.
//
//[문제 1] Book 클래스를 만드세요. 이 클래스는 title(문자열), author(문자열), price(정수) 멤버 변수를 가집니다.
//        1. main 함수에서 Book 객체 2개를 생성하세요.
//        2. 첫 번째 객체에는 "이것이 자바다", "신용권", 30000을, 두 번째 객체에는 "자바의 정석", "남궁성", 28000을 각각 저장하세요.
//        3. 두 객체의 모든 정보를 각각 출력하세요.
        Book book1 = new Book();
        book1.title = "이것이 자바다";
        book1.author = "신용권";
        book1.price = 30000;
        Book book2 = new Book();
        book2.title = "자바의 정석";
        book2.author = "남궁성";
        book2.price = 28000;
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.price);
        System.out.println(book2.title);
        System.out.println(book2.author);
        System.out.println(book2.price);
//
//[문제 2] Pet 클래스를 만드세요. name(문자열), species(문자열, 품종), age(정수) 멤버 변수를 가집니다.
//        1. main 함수에서 Pet 객체 2개를 생성하세요.
//        2. 첫 번째 객체에는 "초코", "푸들", 3을, 두 번째 객체에는 "나비", "코리안숏헤어", 5를 각각 저장하세요.
//        3. "이름: [이름], 종류: [품종], 나이: [나이]살" 형식으로 각 반려동물의 프로필을 출력하세요.
        Pet pet1 = new Pet();
        pet1.name = "초코";
        pet1.species = "푸들";
        pet1.age = 3;
        Pet pet2 = new Pet();
        pet2.name = "나비";
        pet2.species = "코리안숏헤어";
        pet2.age = 5;
        System.out.printf("이름 : %s , 종류 : %s , 나이 : %d살\n",pet1.name , pet1.species ,pet1.age);
        System.out.printf("이름 : %s , 종류 : %s , 나이 : %d살\n",pet2.name , pet2.species , pet2.age);


//
//[문제 3] Rectangle 클래스를 만드세요. width(정수)와 height(정수) 멤버 변수를 가집니다.
//        1. main 함수에서 Rectangle 객체를 하나 생성하고, width에 10, height에 5를 저장하세요.
//        2. 해당 객체의 width와 height 값을 곱하여 "사각형의 넓이: [넓이]"를 출력하세요.
        Rectangle r1 = new Rectangle();
        r1.width = 10;
        r1.height = 5;
        int 넓이 = r1.width*r1.height;
        System.out.printf("사각형의 넓이 : %d\n",넓이);
//
//[문제 4] BankAccount 클래스를 만드세요. accountNumber(문자열), ownerName(문자열), balance(정수, 잔액) 멤버 변수를 가집니다.
//        1. main 함수에서 BankAccount 객체를 하나 생성하고, 계좌번호는 "111-222-3333", 예금주는 "유재석", 초기 잔액은 10000으로 저장하세요.
//        2. balance에 5000을 더하여 입금 상황을 구현하고, "입금 후 잔액: [잔액]"을 출력하세요.
//        3. 다시 balance에서 3000을 빼서 출금 상황을 구현하고, "출금 후 잔액: [잔액]"을 출력하세요.
        BankAccount b1 = new BankAccount();
        b1.accountNumber = "111-222-3333";
        b1.ownerName = "유재석";
        b1.balance = 10000;
        b1.balance = b1.balance - 3000;
        System.out.printf("출금 후 잔액 : %d\n", b1.balance);

//
//[문제 5] Product 클래스를 만드세요. name(문자열)과 price(정수) 멤버 변수를 가집니다.
//        1. main 함수에서 Product 객체 2개를 생성하고, 각각 "새우깡", 1500과 "콜라", 2000 정보를 저장하세요.
//        2. if문을 사용하여 두 객체의 price를 비교하고, 더 비싼 상품의 이름을 출력하세요.
        Product p1 = new Product();
        p1.name = "새우깡";
        p1.price = 1500;
        Product p2 = new Product();
        p2.name = "콜라";
        p2.price = 2000;
        if(p1.price > p2.price){
            System.out.println(p1.price);
        }else {
            System.out.println(p2.price);
        }
//
//[문제 6] Member 클래스를 만드세요. id(문자열)와 isLogin(boolean) 멤버 변수를 가집니다.
//        1. main 함수에서 Member 객체를 하나 생성하고, 아이디는 "admin", isLogin은 false로 초기화하세요.
//        2. "로그인 전 상태: [isLogin 값]"을 출력하세요.
//        3. 객체의 isLogin 값을 true로 변경하여 로그인 상황을 구현하세요.
//        4. "로그인 후 상태: [isLogin 값]"을 출력하세요.
        Member m1 = new Member();
        m1.id = "admin";
        m1.isLogin = false;
        System.out.printf("로그인 전 상태 : %s\n",m1.isLogin);
        m1.isLogin = true;
        System.out.printf("로그인 후 상태 : %s\n",m1.isLogin);
//
//[문제 7] Television 클래스를 만드세요. channel(정수)과 volume(정수) 멤버 변수를 가집니다.
//        1. main 함수에서 Television 객체를 생성하고, channel은 7, volume은 20으로 초기화하세요.
//        2. 객체의 channel 값을 11로 변경하고, volume 값은 2 감소시킨 뒤, 변경된 채널과 볼륨을 출력하세요.
        Television t1 = new Television();
        t1.channel = 7;
        t1.volume = 20;
        t1.channel = 11;
        t1.volume = t1.volume-2;
        System.out.println(t1.channel);
        System.out.println(t1.volume);
//
//[문제 8] Player 클래스를 만드세요. name(문자열), power(정수), speed(정수) 멤버 변수를 가집니다.
//        1. main 함수에서 Player 객체 2개를 생성하세요.
//        2. 첫 번째 객체에는 "손흥민", 90, 95를, 두 번째 객체에는 "이강인", 85, 92를 각각 저장하세요.
//        3. 두 객체의 power와 speed의 합을 각각 계산하고, 합이 더 높은 선수의 이름을 출력하세요.
        Player play1 = new Player();
        play1.name = "손흥민";
        play1.power = 90;
        play1.speed = 95;
        Player play2 = new Player();
        play2.name = "이강인";
        play2.power = 85;
        play2.speed = 92;
        int 손 = play1.power+play1.speed;
        int 이 = play2.power+play2.speed;
        if (손 > 이){
            System.out.println(play1.name);
        }else {
            System.out.println(play2.name);
        }

//
//[문제 9] MenuItem 클래스를 만드세요. name(문자열), price(정수), isSignature(boolean, 대표메뉴 여부) 멤버 변수를 가집니다.
//        1. main 함수에서 MenuItem 객체 3개를 생성하고, 첫 번째는 "김치찌개", 8000, true, 두 번째는 "된장찌개", 8000, false, 세 번째는 "계란찜", 3000, false로 저장하세요.
//        2. if문을 사용하여 isSignature가 true인 메뉴 객체를 찾아, "[대표메뉴] [메뉴이름] : [가격]원" 형식으로 출력하세요.
        MenuItem i1 = new MenuItem();
        i1.name = "김치찌개";
        i1.price = 8000;
        i1.isSignature = true;
        MenuItem i2 = new MenuItem();
        i2.name = "된장찌개";
        i2.price = 8000;
        i2.isSignature = false;
        MenuItem i3 = new MenuItem();
        i3.name = "계란찜";
        i3.price = 3000;
        i3.isSignature = false;
        if (i1.isSignature == true){ System.out.printf("[대표메뉴] [%s] : [%d]원\n",i1.name , i1.price); }
        if (i2.isSignature == true){ System.out.printf("[대표메뉴] [%s] : [%d]원\n",i2.name , i2.price); }
        if (i3.isSignature == true){ System.out.printf("[대표메뉴] [%s] : [%d]원\n",i3.name , i3.price); }
//
//[문제 10] UserProfile 클래스를 만드세요. name(문자열), age(정수), mbti(문자열) 멤버 변수를 가집니다.
//        1. main 함수에서 UserProfile 객체를 하나 생성하세요.
//        2. Scanner를 사용하여 사용자로부터 이름, 나이, MBTI를 순서대로 입력받으세요.
//        3. 입력받은 값들을 생성된 객체의 각 멤버 변수에 저장하세요.
//        3. 모든 정보가 저장된 객체의 멤버 변수들을 가져와 "--- 프로필 ---", "이름: [이름]", "나이: [나이]", "MBTI: [MBTI]" 형식으로 출력하세요.
        UserProfile u1 = new UserProfile();
        Scanner scan = new Scanner(System.in);
        System.out.print("이름 : ");
        String s1 = scan.next();
        System.out.print("나이 : ");
        int int1 = scan.nextInt();
        System.out.print("MBTI : ");
        String s2 = scan.next();
        u1.name = s1;
        u1.age = int1;
        u1.mbti = s2;
        System.out.print("--- 프로필 ---");
        System.out.print("이름 : "+u1.name );
        System.out.print(" 나이 : "+u1.age );
        System.out.print(" MBTI : "+u1.mbti);


    }// main end
}// class end
class Book{
    String title;
    String author;
    int price;
}// Book class end

class Pet{
    String name;
    String species;
    int age;
}// Pet class end

class Rectangle{
    int width;
    int height;
}// Rectangle class end