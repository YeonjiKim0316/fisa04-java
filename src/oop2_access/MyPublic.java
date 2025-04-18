package oop2_access;

// 자바의 접근제어자는 public > protected > default > private
// public 동일 패키지의 클래스 또는 이 클래스를 상속받은 다른 패키지의 클래스에서 모두 접근 가능
// private 자기 클래스 안에서만 확인이 가능한 변수, 메서드, 클래스
// class, 변수명, 메서드명 앞에다가 작성 해줍니다.
public class MyPublic {

//    MyPublic(){
//    }
    public String msg = "퍼블릭 변수";

    public void print() {
        System.out.println(this.msg);
    }
}
