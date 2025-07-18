package day15; // 패키지명

public class 실습13 {// class start
    public static void main(String[] args) { // main start
        // [문제1]
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.mkaeSound();
        dog.mkaeSound();

        // [문제2]
        int max = RemoteControl.MAX_VOLUME;
        int min = RemoteControl.MIN_VOLUME;
        System.out.println(max);
        System.out.println(min);

        // [문제3]
        Runnable runner = new Person();
        runner.run();
        runner = new Car();
        runner.run();

        // [문제4]
        Sword s1 = new Sword();
        Gun g1 = new Gun();
        Character c1 = new Character();
        c1.useWeapon(s1);
        c1.useWeapon(g1);

        // [문제5]
        Duck d1 = new Duck();
        d1.fly();
        d1.swimmable();

        // [문제6]
        Duck d2 = new Duck();
        Object obj = d2;
        if (obj instanceof Flyable){
            Flyable f1 = (Flyable)obj;
            f1.fly();
        }// if end
        if (obj instanceof Swimmable){
            Swimmable s2 = (Swimmable)obj;
            s2.swimmable();
        }// if end

        // [문제7]
        DataAccessObject dao;
        dao = new OracleDao();
        dao.save();
        dao = new MysqlDao();
        dao.save();

        // [문제8]
        Greeting greeting = new Greeting() {
            public void welcome() {
                System.out.println("환영합니다.");
            }// func end
        };
        greeting.welcome();

        // [문제9]
        Television t1 = new Television();
        t1.turnOn();
        t1.turnOff();
        t1.setMute(true);

        // [문제10]
        int sum = Calculator.sum(10,20);
        System.out.println(sum);
    }// main end
}// class end

// [문제1]
interface Soundable{ void mkaeSound(); } // interface end
class Cat implements Soundable{ public void mkaeSound() { System.out.println("야옹");}// func end
}// class end
class Dog implements Soundable{ public void mkaeSound() { System.out.println("멍멍");}// func end
}// class end

// [문제2]
interface RemoteControl{
    public static final int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
} // interface end

// [문제3]
interface Runnable{ void run(); }// interface end
class Person implements Runnable{
    public void run() { System.out.println("사람이 달립니다"); }
}//  class end
class Car implements Runnable{
    public void run() { System.out.println("자동차가 달립니다"); }
}//  class end

// [문제4]
interface Attackable{ void attack(); } // interface end
class Sword implements  Attackable{ public void attack(){ System.out.println("검으로 공격!"); } }// class end
class Gun implements  Attackable{ public void attack() { System.out.println("총으로 공격!"); } }// class end
class Character{ public void useWeapon(Attackable weapon){ weapon.attack(); } } // class end

// [문제5]
interface Flyable{ void fly(); }// interface end
interface Swimmable{ void swimmable(); }// interface end
class Duck implements Flyable , Swimmable{
    public void fly() { System.out.println("하늘을 납니다"); }
    public void swimmable() { System.out.println("물에서 헤엄칩니다."); }
}// class end

// [문제7]
interface DataAccessObject{ void save(); }// interface end
class OracleDao implements DataAccessObject{ public void save() { System.out.println("Oracle DB에 저장"); } } // class end
class MysqlDao implements DataAccessObject{ public void save() { System.out.println("MySQL DB에 저장"); } } // class end

// [문제8]
interface Greeting{ void welcome(); }// interface end

// [문제9]
interface Device{
    void turnOn(); void turnOff(); // 추상 func end
    public default void setMute(boolean mute){
        System.out.println("무음 처리합니다.");
    } // default func end
}// interface end
class Television implements Device{
    public void turnOn() { }
    public void turnOff() { }
}// class end

// [문제10]
interface Calculator{
    static int sum(int x , int y){
        return x + y;
    }// 정적메소드
}// interface end