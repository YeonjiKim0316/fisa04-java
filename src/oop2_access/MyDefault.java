package oop2_access;

// 자바의 접근제어자는 public > protected > default > private
// 기본값이 default이므로 interface(기준이 추상이라) 외에서는 따로 명기하지 않습니다.
class MyDefault {  // 우리가 아무것도 접근제어자를 작성하지 않을 때는 default가 컴파일러의 기본 접근제어자로 들어갑니다.


    String msg = "Default 변수";

    void print() {
        System.out.println(this.msg);
    }

    void insideCheck() {
        System.out.println(this.msg); // 프라이빗 변수는 자기 클래스 안에서는 사용 가능
        print(); // 자기 클래스 안에서는 사용 가능
    }

}
