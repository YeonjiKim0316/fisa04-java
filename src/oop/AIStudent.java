package oop;

// 자바에서 상속은 extends 라는 명령어로 사용합니다.
// 자바는 다중상속을 허용하지 않습니다.
public class AIStudent extends Student {
    // 필드, 메서드, 이너클래스 등등을 모두 상속받아서 사용할 수 있습니다.
    static String className = "AI반"; // 클래스 변수

    // 인수를 받는 생성자 직접 작성
    AIStudent(String name, int age) {
        super(name, age); // 부모 클래스에 있는 생성자를 찾아서
    }

    AIStudent(String name) {
        super(name); // 부모 클래스에 있는 생성자를 찾아서
    }

    AIStudent() {
//        super(); // 알아서 super()
    }
    
    // 클래스에서 사용할거야
    static void lateRule(){
        System.out.println("지각비를 걷습니다");
    }

    // 부모클래스의 메서드를 자식클래스에서 다른 방식으로 사용 (Override)
    // 원래있는 메서드를 덮어씀
    @Override // 컴파일러가 부모 클래스에 똑같은 이름이 있는지 확인
    String enter() {
        System.out.println("AI반에"); // 우리가 새로 작성한 오버라이딩 된 동작
        return super.enter();  // 부모클래스의 enter가 원래 하는 동작
    }

//    @Override
//    void enter2(){
//    }
}
