package oop;

public class Student {
    // field
    String name;
    int age;

    // 생성자(constructor)는 인스턴스를 만들 때 딱 한번 실행됩니다.
    // 클래스를 만들 때 생성자를 아무것도 작성하지 않으면 초기값 없이 인스턴스를 만드는 생성자를 자동으로 넣어줍니다.
//    Student(){
//    }

    // 클래스 이름과 같은 이름으로 작성합니다.
    // 오버로딩 (메서드를 만들 때 다른 파라미터를 사용하면 다른 방식으로 동작하도록 몇개든지 같은 함수명을 작성하는 방법)
    Student(String name="이름없음", int age=0){
        this.name = name;
        this.age = age;
    }; // 이름을 받아서 인스턴스를 만들겠다

    // method - return이 있는 함수 / return이 없는 함수  *  파라미터가 있는 함수 / 파라미터가 없는 함수
    String enter() {  // 리턴할자료형 메서드명(입력받을 파라미터) { 실행문 }
        return "입실했습니다";
    }

    void exit() { // 특정메서드가 동작만 하고 return이 없다면 void로 채워줍니다.
        System.out.println("퇴실했습니다.");
    }

    //  이너클래스(inner class)
    // 외부 클래스와 관련된 특성들을 안에서 작성해놓고 사용합니다. (캡슐화)
    class Grade {
        // 필드(속성)
        int score;

        // 생성자
        Grade(int score) {
            this.score = score;
        }

        // 메서드
        String getGrade() {
            if (score >= 90) {
                return "A";
            } else if (score >= 80) {
                return "B";
            } else {
                return "C";
            }
        }
    }
}
