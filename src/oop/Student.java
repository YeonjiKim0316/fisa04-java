package oop;

public class Student {
    // - field
    String name;
    int age;

    // 생성자(constructor)는 인스턴스를 만들 때 딱 한번 실행됩니다.
    // 클래스 이름과 같은 이름으로 작성합니다.
    Student(String name){
        this.name = name;
    }; // 이름을 받아서 인스턴스를 만들겠다

    // method - return이 있는 함수 / return이 없는 함수  *  파라미터가 있는 함수 / 파라미터가 없는 함수
    String enter() {  // 리턴할자료형 메서드명(입력받을 파라미터) { 실행문 }
        return "입실했습니다";
    }

    void exit() { // 특정메서드가 동작만 하고 return이 없다면 void로 채워줍니다.
        System.out.println("퇴실했습니다.");
    }

//    , 이너클래스(inner class)
}
