package oop;

public class Oop_example {
    // 클래스 메서드 - 인스턴스 만들지 않고 직접 실행 가능한 return이 없는
    public static void main(String[] args){
        
//        // 자료형 변수명 = new(메모리 확보) 생성자 (호출)
//        Student kim = new Student("김연지"); // 명시적으로 작성된 생성자가 있으면 그 생성자만 사용할 수 있도록
//        Student shin = new Student("신짱구", 5);
//        Student lee = new Student();
//        kim.exit(6);
//        kim.exit("AI반");
//        kim.exit(6, "AI반");
//        System.out.println(kim.exit(6, "ai반", "집"));
//
//        kim.introduce();
//        shin.introduce();


//        System.out.println(kim.age); // 초기값 0을 넣어줬음
//        System.out.println(kim.name); // null;
//        String result = kim.enter(); // return을 했으므로
//        System.out.println(result);
//        kim.exit();

//        Student shin = new Student("신짱구");
//        // 이너클래스 - 외부클래스와 관련있는 어떤 객체를 만들 때 사용
//        // 외부클래스.자료형 변수명 = 인스턴스.new(메모리 확보) 생성자 (호출)
//        Student.Grade grade = shin.new Grade(85);
//        System.out.println(grade.getGrade()+"가 "+shin.name+"의 점수입니다.");

        System.out.println(AIStudent.className);
        AIStudent.lateRule(); // 클래스 메서드
        AIStudent lee = new AIStudent("이지연", 22);
        lee.introduce(); // 인스턴스 메서드
        System.out.println(lee.name); // 인스턴스 필드
        String result = lee.enter();
        System.out.println(result);

        AIStudent kim = new AIStudent("김연지");
        kim.introduce();

        AIStudent kim2 = new AIStudent();
        kim2.introduce();


    }
}
