package day11; // 패키지명

import java.util.ArrayList;
import java.util.Scanner;

public class 실습11 { // class start
    public static void main(String[] args) { // main start
        // [문제1]
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("유재석");
        nameList.add("강호동");
        nameList.add("신동엽");
        System.out.println(nameList);
        // [문제2]
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("딸기");
        for (int i = 0; i < fruits.size(); i++){
            String str = fruits.get(i);
            System.out.println("인덱스 "+i+" : " +str);
        }// for end
        // [문제3]
        for (String str : fruits){
            System.out.println(str);
        }// for end
        // [문제4]
        ArrayList<String> 알파벳 = new ArrayList<>();
        알파벳.add("A");
        알파벳.add("B");
        알파벳.add("C");
        알파벳.add("D");
        알파벳.add("E");
        알파벳.remove(2);
        System.out.println(알파벳);
        // [문제5]
        ArrayList<String> 프로그램언어 = new ArrayList<>();
        프로그램언어.add("자바");
        프로그램언어.add("파이썬");
        프로그램언어.add("C++");
        프로그램언어.add(1 , "자바스크립트");
        System.out.println(프로그램언어);
        // [문제6]
        ArrayList<Book> library = new ArrayList<>();
        Book b1 = new Book("어린왕자","유재석");
        Book b2 = new Book("아기돼지3형제","강호동");
        Book b3 = new Book("백설공주","신동엽");
        library.add(b1);
        library.add(b2);
        library.add(b3);
        for (Book b : library){
            System.out.println("제목 : "+b.title);
            System.out.println("저자 : "+b.author);
        }// for end
        // [문제7]
        Scanner scan = new Scanner(System.in);
        ArrayList<String> end = new ArrayList<>();
        for ( ; ;){
            System.out.print("문자열 : ");
            String s1 = scan.next();
            end.add(s1);
            if (s1.equals("종료")){
                System.out.println(end);
                break;
            }// if end

        }// for end
        // [문제8]
        ArrayList<String> 과목 = new ArrayList<>();
        과목.add("국어");
        과목.add("수학");
        과목.add("사회");
        과목.add("과학");
        과목.set(1 , "영어");
        System.out.println(과목);





    } // main end
}// class end
