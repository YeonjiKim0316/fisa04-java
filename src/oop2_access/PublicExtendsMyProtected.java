package oop2_access;

// 자바의 접근제어자는 public > protected > default > private
// public 동일 패키지의 클래스 또는 이 클래스를 상속받은 다른 패키지의 클래스에서 모두 접근 가능
// private 자기 클래스 안에서만 확인이 가능한 변수, 메서드, 클래스
// class, 변수명, 메서드명 앞에다가 작성 해줍니다.
// protected로 선언된 속성, 메서드는 자기 패키지 안에서만 사용 가능하므로
// public 자식클래스를 통해 타 패키지에서 사용가능하도록 '경유'
public class PublicExtendsMyProtected extends MyProtected {

    // 부모 클래스에서 상속받은 this.msg, print() 를 외부 패키지에서 사용 가능
    public void insideCheck() {
        System.out.println(this.msg); // 프라이빗 변수는 자기 클래스 안에서는 사용 가능
        print(); // 자기 클래스 안에서는 사용 가능
    }

}
