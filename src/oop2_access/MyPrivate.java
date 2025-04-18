package oop2_access;

// 자바의 접근제어자는 public > protected > default > private
// public 동일 패키지의 클래스 또는 이 클래스를 상속받은 다른 패키지의 클래스에서 모두 접근 가능
// private 자기 클래스 안에서만 확인이 가능한 변수, 메서드, 클래스
// class, 변수명, 메서드명 앞에다가 작성 해줍니다.
// class 단위에서는 접근제어자가 private은 허용 불가: 가져다 쓸 수 없는 클래스를 작성했기 때문
public class MyPrivate {


    private String msg = "프라이빗 변수";

    private void print() {
        System.out.println(this.msg);
    }

    public void insideCheck() {
        System.out.println(this.msg); // 프라이빗 변수는 자기 클래스 안에서는 사용 가능
        print(); // 자기 클래스 안에서는 사용 가능
    }

}
