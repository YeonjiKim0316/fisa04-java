package oop;

public class Oop_example {
    // 클래스 메서드 - 인스턴스 만들지 않고 직접 실행 가능한 return이 없는
    public static void main(String[] args){
        
        // 자료형 변수명 = new(메모리 확보) 생성자 (호출)
        Student kim = new Student("김연지");
        System.out.println(kim.age); // 초기값 0을 넣어줬음
        System.out.println(kim.name); // 김연지
        String result = kim.enter(); // return을 했으므로
        System.out.println(result);
        kim.exit();
    }
}
