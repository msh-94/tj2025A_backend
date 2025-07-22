package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        try {
            String path1 = "./src/visit_log1.txt";
            Scanner scan = new Scanner(System.in);
            System.out.print("이름 : ");
            String name = scan.next();
            String outname = name + "님이 방문했습니다.\n";
            File file = new File(path1);
            if (file.exists()) { // 파일이 존재하면
                FileInputStream fin = new FileInputStream(path1); // 입력 객체 생성하고
                byte[] inByte = new byte[(int)file.length()]; // 파일용량만큼 배열길이 선언하기
                fin.read(inByte); // 읽고 나서 추가해야됨 안그러면 이전값을 날려버림
                String str = new String(inByte); // 문자열로 변환
                str += outname; // 기존에 있던것에 새로입력값 추가
                byte[] outByte = str.getBytes(); // 바이트배열 변환
                FileOutputStream fos = new FileOutputStream(path1); // 출력 객체 생성
                fos.write(outByte); // 쓰기
            }else {
                FileOutputStream fos = new FileOutputStream(path1);
                fos.write(outname.getBytes());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }// try end
    }// main end
}// class end
