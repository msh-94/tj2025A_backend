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
            if (file.exists()) {
                FileInputStream fin = new FileInputStream(path1);
                byte[] inByte = new byte[(int)file.length()];
                fin.read(inByte); // 읽고 나서 추가해야됨 안그러면 이전값을 날려버림
                String str = new String(inByte);
                str += outname;
                byte[] outByte = str.getBytes();
                FileOutputStream fos = new FileOutputStream(path1);
                fos.write(outByte);
            }else {
                FileOutputStream fos = new FileOutputStream(path1);
                fos.write(outname.getBytes());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }// try end
    }// main end
}// class end
