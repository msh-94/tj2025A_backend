package day02; // 패키지명

public class Example1 {
    public static void main(String[] args) { // main start
        // (변수) 타입 변환  , 캐스팅 , ***다형성( 하나의 자료가 여러개 타입으로 변환이 가능하다. )
        // 1. 자동 타입변환 (묵시적)
            // byte -> short/char -> int -> long -> float -> double
            // (1) 메모리 크기가 작은 것 에서 큰 것 으로 변환 가능
            // (2) 데이터의 손실이 적다
        byte byteValue = 10;                // *10* 자료를 *byte* 타입으로 분류
        short shortValue = byteValue;       // byte -> short 가능!
        int intValue = shortValue;          // short -> int 가능!
        long longValue = intValue;          // int -> long 가능!
        float floatValue = longValue;       // long -> float 가능!
        double doubleValue = floatValue;    // float -> double 가능! , 10자료를 double타입으로 분류

        // 2. 강제 타입변환 (명시적)
            // double -> float -> long -> int -> short/char -> byte
            // (1) 메모리 크기가 큰 것 에서 작은 것으로 변환 가능
            // (2) 데이터 손실이 크다
            // (3) (변환할타입명)변수명;
        double dvalue = 3.14;
        float fvalue = (float)dvalue;   // double -> float 강제가능
        long lvalue = (long)fvalue;     // float -> long 강제가능   // 손실발생 : 3.14 -> 3
        int ivalue = (int)lvalue;       // long -> int 강제가능
        short svalue = (short)ivalue;   // int -> short 강제가능
        byte bvalue = (byte)svalue;     // short -> byte 강제가능

        // 3. 연산 (자동) 타입변환
            // byte + byte = int , byte + short = int , int + int = int
            // - 연산결과는 두개 항 중에 더 큰 항의 타입으로 자동 타입변환.
            // 단] int 이하의 연산결과는 int 이다
        byte b1 = 10;       byte b2 = 20;       short s1 = 30;      int i1 = 40;        long l1 = 50;
        float f1 = 3.14F;   double d1 = 41.25;
        int result = b1 + b2;
        int result2 = b1 + s1;
        int result3 = i1 + i1;
        long result4 = i1 + l1;     // int + long = long
        float result5 = i1 + f1;    // int + float = float
        double result6 = i1 + d1;   // int + double = double

    }// main end
}// class end
