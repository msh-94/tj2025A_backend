package day16;// 패키지명

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class 실습15 {// class start
    public static void main(String[] args) { // main start
        // [문제1]
        try {
            String path = "./src/diary.txt";
            FileOutputStream fout = new FileOutputStream( path );
            String str = "오늘 날씨는 맑았다. 자바 공부는 재미있다.";
            byte[] outByte = str.getBytes();
            fout.write(outByte);

            // [문제2]
            FileInputStream fin = new FileInputStream( path );
            byte[] bytes = new byte[58];
            fin.read(bytes);
            System.out.println(new String(bytes));

            // [문제3]
            File file = new File(path);
            System.out.println(file.exists());
            System.out.println(file.getPath());
            System.out.println(file.getName());
            System.out.println(file.length());

            // [문제4]
            String path1 = "./src/visit_log.txt";
            Scanner scan = new Scanner(System.in);
            System.out.print("이름 : ");  String name = scan.next();
            String outname = name+"님이 방문했습니다.\n";
            byte[] out = outname.getBytes();
            File file3 = new File(path1);
            FileOutputStream fout1;
            if (file3.exists()){
                fout1 = new FileOutputStream(path1,true);
                fout1.write(out);
            }else {
                fout1 = new FileOutputStream(path1);
                fout1.write(out);
            }// if end  or test.java

            // [문제5]
            System.out.print("이름 : ");
            String name1 = scan.next();
            System.out.print("전화번호 : ");
            String phone = scan.next();
            System.out.print("사는 곳 : ");
            String st1 = scan.next();
            String intro = name1+","+phone+","+st1+"\n";
            String path2 = "./src/contacts.scv";
            byte[] outByte2 = intro.getBytes();
            FileOutputStream fout2 = new FileOutputStream(path2);
            fout2.write(outByte2);

            // [문제6]
            System.out.print("영화제목 , 감상평 : ");
            scan.nextLine();
            String movie = scan.nextLine();
            String path3 = "./src/movie_review.txt";
            byte[] movieByte = movie.getBytes();
            FileOutputStream fout3 = new FileOutputStream(path3);
            fout3.write(movieByte);

            // [문제7]
            FileInputStream fin1 = new FileInputStream(path3);
            File file1 = new File(path3);
            byte[] inByte = new byte[(int)file1.length()];
            fin1.read(inByte);
            System.out.println(new String(inByte));

            // [문제8]
            String path4 = "src/bupyeong_population.csv";
            File file2 = new File(path4);
            FileInputStream fin2 = new FileInputStream(path4);
            byte[] inByte2 = new byte[(int)file2.length()];
            fin2.read(inByte2);
            String str2 = new String(inByte2 , "EUC-KR");
            String[] row = str2.split("\n");
            for (int i = 0; i < row.length; i++){
                String irow = row[i];
                String[] cols = irow.split(",");
                System.out.printf("동별 : %s , 총 인구 : %s\n", cols[0], cols[1]);
            }// for end
        }catch (Exception e){ System.out.println(e); } // try end





    }// main end
}// class start
