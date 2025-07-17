package day14; // 패키지명

import day09.package2.C;

import javax.crypto.Mac;

public class 실습12 {
    public static void main(String[] args) {
        // [문제1]
        Student s1 = new Student();
        s1.name = "유재석";
        s1.studentId = 1;
        System.out.println(s1.name);
        System.out.println(s1.studentId);

        // [문제2]
        Cat c1 = new Cat();
        c1.makeSound();

        // [문제3]
        Computer pc1 = new Computer();

        // [문제4]
        Triangle t1 = new Triangle();

        Figure f1 = t1;
        // Triangle 클래스가 Figure클래스를 상속받아서 Triangle객채 생성시 Figure객체도 생성되기 때문에
        // 상속관계 이므로 자동 타입변환 아래에서 위로 올라감

        // [문제5]
        Shape shape = new Circle();
        shape.draw(); // 원을 그립니다
        // 하위타입을 상위타입의 변수에 생성
        // 상속관계시 메소드명이 같으면 오버라이딩 한 메소드가 최우선이기 때문에 (재정의)

        // [문제6]
        Vehicle vehicle = new Bus();
        if (vehicle instanceof Bus){
            Bus b1 = (Bus)vehicle;
            b1.checkFare();
        }// if end
        // [문제7]

        Beverage[] b2 = new Beverage[2];
        Coke coke = new Coke();
        Coffee coffee = new Coffee();
        b2[0] = coke;
        b2[1] = coffee;
        for (int i = 0; i < b2.length; i++){
            b2[i].drink();
        }// for end

        // [문제8]
        Sword sword = new Sword();
        Gun gun = new Gun();
        Character character = new Character();
        character.use(gun);
        character.use(sword);

        // [문제9]
        SuperClass obj = new SubClass();
        System.out.println(obj.name);
        obj.method();
        // name 멤버변수는 하위클래스 생성자로 생성해도 상위 클래스 멤버변수 값을 갖고오지만
        // 메소드는 오버라이딩하여 재정의하기 때문에 오버라이딩한 메소드안의 name이 출력된것

        // [문제10]
        Laptop laptop = new Laptop();
        System.out.println(laptop instanceof Electronic);
        System.out.println(laptop instanceof Device);
    }// main end
}// class end
// [문제1]
class Person{ String name; }// class end
class Student extends Person{ int studentId; }// class end

// [문제2]
class Animal{
    void makeSound(){ System.out.println("동물이 소리를 냅니다."); }// func end
}// class end
class Cat extends Animal{
    void makeSound(){ System.out.println("고양이가 야옹하고 웁니다"); }// func end
}// class end

// [문제3]
class Machine{
    Machine(){ System.out.println("부모 클래스 생성자 실행"); }// 생성자 end
}// class end
class Computer extends Machine{
    Computer(){ System.out.println("자식 클래스 생성자 실행"); } //생성자 end
}// class end

// [문제4]
class Figure{}// class end
class Triangle extends Figure{}// class end

// [문제5]
class Shape{
    void draw(){ System.out.println("도형을 그립니다"); } // func end
}// class end
class Circle extends Shape{
    void draw(){ System.out.println("원을 그립니다"); } // func end
} // class end

// [문제6]
class Vehicle{ } // class end
class Bus extends Vehicle{
    void checkFare(){ System.out.println("요금을 확인합니다."); }// func end
}// class end

// [문제7]
class Beverage{
    void drink(){ System.out.println("음료를 마십니다."); }// func end
}// class end
class Coke extends Beverage{
    void drink(){ System.out.println("콜라를 마십니다."); }// func end
}// class end
class Coffee extends Beverage{
    void drink(){ System.out.println("커피를 마십니다."); }// func end
} // class end

// [문제8]
class Weapon{
    void attack(){ System.out.println("무기로 공격합니다."); } // func end
}// class end
class Sword extends Weapon{
    void attack(){ System.out.println("검으로 공격합니다."); } // func end
}// class end
class Gun extends Weapon{
    void attack(){ System.out.println("총으로 공격합니다."); } // func end
}// class end
class Character{
    void use(Weapon weapon){ weapon.attack(); }// func end
}// class end

// [문제9]
class SuperClass{
    String name = "상위"; // 멤버변수
    void method(){ System.out.println(name + "메소드"); } // func end
}// class end
class SubClass extends SuperClass{
    String name = "하위"; // 멤버변수
    void method(){ System.out.println(name + "메소드"); } // func end
}// class end

// [문제10]
class Device{ }// class end
class Electronic extends Device{ }// class end
class Laptop extends Electronic{ }// class end